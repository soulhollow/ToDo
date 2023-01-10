package com.mycompany.raptortodo;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.googleapis.json.GoogleJsonError;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.gmail.Gmail;
import com.google.api.services.gmail.model.Message;
import org.apache.commons.codec.binary.Base64;

import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.Set;

import static com.google.api.services.gmail.GmailScopes.GMAIL_SEND;
import java.io.File;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import static javax.mail.Message.RecipientType.TO;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;

public class GMailer {

    private static final String me = "raptor.todo.emailsystem@gmail.com";
    private final Gmail service;
    private String subject;
    private String message;
    private String toEmailAddress;

    public GMailer() throws Exception {
        NetHttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();
        GsonFactory jsonFactory = GsonFactory.getDefaultInstance();
        service = new Gmail.Builder(httpTransport, jsonFactory, getCredentials(httpTransport, jsonFactory))
                .setApplicationName("JavaGmailService")
                .build();
    }

    private static Credential getCredentials(final NetHttpTransport httpTransport, GsonFactory jsonFactory)
            throws IOException {
        String token = "/client_secret_812886324406-8m25k33f14ja13q8nd9642afk3mm16m1.apps.googleusercontent.com.json";
        System.out.println(token);
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(jsonFactory, new InputStreamReader(GMailer.class.getResourceAsStream(token)));
        
        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
                httpTransport, jsonFactory, clientSecrets, Set.of(GMAIL_SEND))
                .setDataStoreFactory(new FileDataStoreFactory(Paths.get("tokens").toFile()))
                .setAccessType("offline")
                .build();

        LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8888).build();
        return new AuthorizationCodeInstalledApp(flow, receiver).authorize(me);
    }

    public void sendMail() throws Exception {
        Properties props = new Properties();
        Session session = Session.getDefaultInstance(props, null);
        MimeMessage email = new MimeMessage(session);
        email.setFrom(new InternetAddress(me));
        email.addRecipient(TO, new InternetAddress(toEmailAddress));
        email.setSubject(subject);
        email.setText(message);

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        email.writeTo(buffer);
        byte[] rawMessageBytes = buffer.toByteArray();
        String encodedEmail = Base64.encodeBase64URLSafeString(rawMessageBytes);
        Message msg = new Message();
        msg.setRaw(encodedEmail);

        try {
            msg = service.users().messages().send("me", msg).execute();
            System.out.println("Message id: " + msg.getId());
            System.out.println(msg.toPrettyString());
        } catch (GoogleJsonResponseException e) {
            GoogleJsonError error = e.getDetails();
            if (error.getCode() == 403) {
                System.err.println("Unable to send message: " + e.getDetails());
            } else {
                throw e;
            }
        }
    }

    public void sendMailWithAttachment(String [][] data) throws Exception {
        Properties props = new Properties();
        Session session = Session.getDefaultInstance(props, null);
        
        MimeMessage email = new MimeMessage(session);
        email.setFrom(new InternetAddress(me));
        email.addRecipient(TO, new InternetAddress(toEmailAddress));
        email.setSubject(subject);
        email.setText(message);
        
        String rowString = "";
        for (String[] row : data) {
        String[] quotedValues = new String[row.length];
            for (int i = 0; i < row.length; i++) {
                if(row[i].contains(" ")) 
                    quotedValues[i] = "\"" + row[i] + "\"";  // enclose value in quotes if it contains a comma
                else quotedValues[i] = row[i];
            }
        rowString += String.join(",", quotedValues)+ System.lineSeparator();
        
            }
    // Create the message part
            BodyPart messageBodyPart = new MimeBodyPart();

            // Fill the message
            messageBodyPart.setText(message);

            // Create a multipart message
            Multipart multipart = new MimeMultipart();

            // Set text message part
            multipart.addBodyPart(messageBodyPart);

            // Part two is attachment
            messageBodyPart = new MimeBodyPart();
            messageBodyPart.setDataHandler(new DataHandler(new ByteArrayDataSource(rowString.getBytes(),"text/csv")));
            messageBodyPart.setFileName("invoice.csv");
            multipart.addBodyPart(messageBodyPart);
            
            email.setContent(multipart);

//        MimeMultipart multipart = new MimeMultipart();
//        MimeBodyPart messageBodyPart = new MimeBodyPart();
//        messageBodyPart.setText(message);
//        MimeBodyPart attachment = new MimeBodyPart();
//        attachment.attachFile(new File("src/main/resources/invoice.csv"));
//        multipart.addBodyPart(attachment);
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        email.writeTo(buffer);
        byte[] rawMessageBytes = buffer.toByteArray();
        String encodedEmail = Base64.encodeBase64URLSafeString(rawMessageBytes);
        Message msg = new Message();
        msg.setRaw(encodedEmail);

        try {
            msg = service.users().messages().send("me", msg).execute();
            System.out.println("Message id: " + msg.getId());
            System.out.println(msg.toPrettyString());
        } catch (GoogleJsonResponseException e) {
            GoogleJsonError error = e.getDetails();
            if (error.getCode() == 403) {
                System.err.println("Unable to send message: " + e.getDetails());
            } else {
                throw e;
            }

        }
    }

    public static MimeMessage createEmailWithAttachment(String to, String subject, String bodyText, String filePath) throws MessagingException {
        File file = new File(filePath);
        Properties props = new Properties();
        Session session = Session.getDefaultInstance(props, null);
        MimeMessage email = new MimeMessage(session);
        Multipart multipart = new MimeMultipart();
        InternetAddress tAddress = new InternetAddress(to);
        InternetAddress fAddress = new InternetAddress(me);
        email.setFrom(fAddress);
        email.addRecipient(javax.mail.Message.RecipientType.TO, tAddress);
        email.setSubject(subject);
        if (file.exists()) {
            FileDataSource source = new FileDataSource(filePath);
            MimeBodyPart messageFilePart = new MimeBodyPart();
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            try {
                messageBodyPart.setText(bodyText);
                messageFilePart.setDataHandler(new DataHandler(source));
                messageFilePart.setFileName(file.getName());

                multipart.addBodyPart(messageBodyPart);
                multipart.addBodyPart(messageFilePart);
                email.setContent(multipart);
            } catch (MessagingException e) {
                e.printStackTrace();
            }
        } else {
            email.setText(bodyText);
        }
        return email;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setToEmailAddress(String toEmailAddress) {
        this.toEmailAddress = toEmailAddress;
    }
}
