package com.mycompany.raptortodo;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControlGUI {

    //Deklarieren von Variablen
    private GUITaskView GUITaskAnsicht1;
    private GUINewTask GUINewTask1;
    private GUIToUser GUIToUser1;
    private GUILogin GUILogin1;
    private GUIAccount GUIAccount1;

    private String username;
    private String password;
    private String newPassword;
    private String repeatNewPassword;
    private Brain brain;
    Worker worker1;
    Task task1;
    Task[] taskarr1;
    Task[] taskarr2;

    public ControlGUI() {

        try {
            //Erstellt die Login-Oberflächen
            GUILogin1 = new GUILogin(this);

            //macht den Login Screen Sichtbar:
            GUILogin1.setVisible(true);

            //Erstellt alle anderen GUI Elemente
            GUITaskAnsicht1 = new GUITaskView(this);
            GUINewTask1 = new GUINewTask(this);
            GUIToUser1 = new GUIToUser(this);
            GUIAccount1 = new GUIAccount(this);
            //macht alle anderen GUIElemente Standartmäßig Unsichtbar
            GUITaskAnsicht1.setVisible(false);
            GUINewTask1.setVisible(false);
            GUIToUser1.setVisible(false);
            GUIAccount1.setVisible(false);
            this.brain = new Brain();
        } catch (Exception ex) {
            Logger.getLogger(ControlGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //setter um die verschiedene GUI Elemente sichtbar/unsichtbar zu schalten
    public void setTaskViewVisible() {
        GUITaskAnsicht1.setVisible(true);
    }

    public void setTaskViewInvisible() {
        GUITaskAnsicht1.setVisible(false);
    }

    public void setGUIAccountInvisible() {

        GUIAccount1.setVisible(false);
    }

    public void setGUIAccountVisible() {

        GUIAccount1.setVisible(true);
    }

    public void setGUILoginVisible() {
        GUILogin1.setVisible(true);
    }

    public void setGUILoginInvisible() {
        GUILogin1.setVisible(false);
    }

    public void setGUINewTaskVisible() {
        GUINewTask1.setVisible(true);
    }

    public void setGUINewTaskInvisible() {
        GUINewTask1.setVisible(false);
    }

    public void setGUIToUserVisible() {
        GUIToUser1.setVisible(true);
        setlstAllUsers();

    }

    public void setGUIToUserInvisible() {
        GUIToUser1.setVisible(false);
    }

    //funktion zum schließen des Programms
    public void exitProgramm() {
        System.exit(0);
        brain.exit();
    }

    //GUILogin Funktionzugriffe
    //Überprüfen aus der db ob Login Daten richtig sind und boolean an GUILogin btnLogin geben
    public void loginLoginBtn() {
        try {
            username = GUILogin1.getUser();
            password = GUILogin1.getPassword();
            if (brain.checkKey(username, password) &&  ! username.isBlank()) {
                this.setTaskViewVisible();
                this.setGUILoginInvisible();
                this.worker1 = new Worker(username);
                setlstAllTasks();
            }else {
                GUILogin1.resetUser();
                GUILogin1.resetPassword();
                JOptionPane.showMessageDialog(GUILogin1, "Der Benutzername oder Passwort sind falsch.");
            }
        } catch (HeadlessException e) {
        }

    }

    // GUIChangePassword Funktionzugriffe
    public void ChangePasswordBtn() {

        username = GUIAccount1.getUsername();
        password = GUIAccount1.getOldPassword();
        newPassword = GUIAccount1.getNewPassword();
        repeatNewPassword = GUIAccount1.getNewPasswordRepeat();

        if (( newPassword.isBlank() ) && ( password.isBlank() )) {
            JOptionPane.showMessageDialog(GUIAccount1, "Passwortfelder wurden nicht beschrieben.");

        }else {
            
            if (repeatNewPassword.equals(newPassword) &&  !( newPassword.isBlank() ) && !( password.isBlank() )) {
                worker1.setPassword(newPassword);
                GUIAccount1.GUIAccountPasswordClearAll();
                GUIAccount1.GUIAccountBenutzerClearALL();
                setGUIAccountInvisible();
                JOptionPane.showMessageDialog(GUIAccount1, "Passwort erfolgreich geändert. Sie werden nun abgemeldet.");
                GUILogin1.setUser(worker1.getUsername());
                logoutBtn();

            }else {
                JOptionPane.showMessageDialog(GUIAccount1, "Die Passwörter stimmen nicht überein.");

            }
        }
    }

    public void PasswordsetUsername() {
        GUIAccount1.setUsername(worker1.getUsername());
    }

    public void setVonUserTime( String sUser, int iEstimatedTime ) {
        GUITaskAnsicht1.setVonUserTime(sUser, iEstimatedTime);
    }

    //setzt die Taskübersicht Liste
    public void setlstAllTasks() {
        taskarr1 = worker1.fillTasksStatus1();
        taskarr2 = worker1.fillTasksStatus2();
        String[] taskSubjects1 = new String[taskarr1.length];
        String[] taskSubjects2 = new String[taskarr2.length];
        for (int i = 0; i < taskarr1.length; i ++) {
            taskSubjects1[i] = taskarr1[i].getTaskSubject();
        }
        for (int i = 0; i < taskarr2.length; i ++) {
            taskSubjects2[i] = taskarr2[i].getTaskSubject();
        }
        GUITaskAnsicht1.setlstAllTasks1(taskSubjects1);
        GUITaskAnsicht1.setlstAllTasks2(taskSubjects2);
    }

    public void setlstAllTasksEmpty() {
        //Erstellt halt nen String Array was genau nulol groß ist. Kp ob das Sinnig ist aber es funktioniert hoffentlich.
        String[] sListData;
        sListData = new String[0];
        GUITaskAnsicht1.setlstAllTasks1(sListData);
    }
    //fehlerbehandlung muss noch gemacht werden momentan ist einfach Zeit -1 gesetzt

    public int getBearbeitungszeit() {
        return GUITaskAnsicht1.getBearbeitungszeit();
    }

    //String muss schon Formatiert sein mit Zeilenumbrüchen
    public void setTaskDescription( String sTaskDescription ) {
        GUITaskAnsicht1.setTaskDescription(sTaskDescription);
    }

    //leert die TaskAnsichtFelder
    public void emptyTaskAnsicht() {
        this.setVonUserTime("", 0);
        this.setTaskDescription("");
        this.setlstAllTasksEmpty();
        GUITaskAnsicht1.setTxfTatsaechlicheZeit(0);
    }

    //refresht die Aufgaben die Angezeigt werden
    public void btnMyTaskRefresh() {
        this.setlstAllTasks();
    }

    //öffnet die Detail Ansicht einer Task bei Click eines buttons
    public void showTaskBtn() {

        //Variablos
        int iWhichTask, iEstimatedTime, iIDWorker;
        String sTaskDescription, sUser;
        Worker wCreator;
        if (GUITaskAnsicht1.istSelected1()) {
            iWhichTask = GUITaskAnsicht1.getListAllTasksSelection1();
            this.task1 = taskarr1[iWhichTask];
            iIDWorker = this.task1.getCreator();
            brain.fillWorkerArray();
            wCreator = brain.getWorker(iIDWorker);
            sUser = wCreator.getName() + " " + wCreator.getFirstName();
            sTaskDescription = this.task1.getDescription();
            iEstimatedTime = this.task1.getEstimatedTime();

            GUITaskAnsicht1.setTaskDescription(sTaskDescription);
            GUITaskAnsicht1.setVonUserTime(sUser, iEstimatedTime);
        }
        if (GUITaskAnsicht1.istSelected2()) {
            iWhichTask = GUITaskAnsicht1.getListAllTasksSelection2();
            this.task1 = taskarr2[iWhichTask];
            iIDWorker = this.task1.getCreator();
            brain.fillWorkerArray();
            wCreator = brain.getWorker(iIDWorker);
            sUser = wCreator.getName() + " " + wCreator.getFirstName();
            sTaskDescription = this.task1.getTaskSubject();
            iEstimatedTime = this.task1.getEstimatedTime();

            GUITaskAnsicht1.setTaskDescription(sTaskDescription);
            GUITaskAnsicht1.setVonUserTime(sUser, iEstimatedTime);
        }
        if ( ! GUITaskAnsicht1.istSelected2() &&  ! GUITaskAnsicht1.istSelected1()) {
            JOptionPane.showMessageDialog(GUIToUser1, "Wähle eine Task aus.");
        }
    }
    //öffnet New Task nur das schon vorausgefüllt die Task drin steht. Der Creator wird zum Empfänger hinzugefügt

    public void taskBearbeitenBtn() {
        showTaskBtn();
        this.task1.setStatus(2, worker1.getiDWorker());
        btnMyTaskRefresh();

    }

    //Alle Felder und GUI´s werden geleert. Dann kann neu eingeloggt werden.
    public void logoutBtn() {

        //erstmal alles Unsichtbar machen für den Benutzer
        this.setTaskViewInvisible();
        this.setGUIAccountInvisible();
        this.setGUINewTaskInvisible();
        this.setGUINewTaskInvisible();

        //dann alle GUI Elemente leeren
        //Task ansicht
        this.emptyTaskAnsicht();
        //benutzer oder so
        this.clearBenutzerGUI();
        //clearLogin
        GUILogin1.resetUser();
        GUILogin1.resetPassword();
        //clearNewTask
        this.resetNewTask();
        //clearGUIToUser
        String[] sEmpty = new String[0];
        this.setlstSelectedUseres(sEmpty);
        this.setlstAllUsers(sEmpty);
        GUINewTask1.resetAll();
        //last but not least das Brain zurücksetzen da fehlt noch zeugs?
        //einen Anmelde Screen wieder sichtbar machen.
        this.setGUILoginVisible();

    }

    //Momentan offene Aufgabe wird abgegeben dabei muss gecheckt werden ob Zeit Sinnvoll ist
    public void taskFinishBtnTaskAnsicht() {
        showTaskBtn();
        if (GUITaskAnsicht1.getBearbeitungszeit() == -1) {
            JOptionPane.showMessageDialog(GUIToUser1, "Bitte tragen sie ihre Arbeitszeit ein.");
        }else {
            this.task1.setStatus(3, worker1.getiDWorker());
            this.task1.setUsedTime(GUITaskAnsicht1.getBearbeitungszeit(), worker1.getiDWorker());
            btnMyTaskRefresh();
            GUITaskAnsicht1.setTaskDescription("");
            GUITaskAnsicht1.setVonUserTime("", 0);
            GUITaskAnsicht1.setTxfTatsaechlicheZeit(0);
            SaveInvoice();
        }
    }

    public void SaveInvoice() {
        CSVWriter writer1 = new CSVWriter();

        var IDTask = String.valueOf(task1.getiD_Task());
        var TaskCreator = String.valueOf(task1.getCreator());
        var TaskDescription = task1.getDescription();
        var TaskSubect = task1.getTaskSubject();
        var TaskUsedTime = String.valueOf(task1.getUsedTime(worker1.getiDWorker()));
        var TaskEstimatedTime = String.valueOf(task1.getEstimatedTime());

        var WorkerID = String.valueOf(worker1.getiDWorker());
        var WorkerFirstName = worker1.getFirstName();
        var WorkerName = worker1.getName();
        var WorkerEmail = worker1.getEmail();
        var WorkerSalary = String.valueOf(worker1.getSalary());
        var WorkerPostition = String.valueOf(worker1.getPosition());

        double cost = ( worker1.getSalary() / 60 ) * task1.getUsedTime(worker1.getiDWorker());
        String costString = String.valueOf(cost);

        String[][] data = {
            {"Arbeiter ID", "Vorname", "Nachname", "E-Mail", "Gehalt in Stunden", "Position", "Aufgaben ID", "Aufgaben Ersteller", "Aufgaben Betreff", "Aufgaben Beschreibung", "Zeit für die Aufgabe in Minuten", "Arbeitszeit des Mitarbeiters", "Kosten für diese Aufgabe"},
            {WorkerID, WorkerFirstName, WorkerName, WorkerEmail, WorkerSalary, WorkerPostition, IDTask, TaskCreator, TaskSubect, TaskDescription, TaskEstimatedTime, TaskUsedTime, costString}
        };
        writer1.writeToFile(data);

        brain.SendInvoiceMail(task1, data);
    }

    //GUINewTask Funktionszugriffe
    //get alle ausgewählte User hintereinander als String
    //evtl String aufspalten? Hier oder wo anders? 
    public String[] getUseres() {
        return GUINewTask1.getUser();
    }

    //bekommt den Betreff als String zurück
    public String getSubject() {
        return GUINewTask1.getSubject();
    }

    //bekommt die Task Beschreibung als hoffentlich Formatierten String
    public String getDescription() {
        return GUINewTask1.getDescription();
    }

    //bekommt den Zeitaufwand in Minuten als Integer
    public int getZeitaufwand() {
        return GUINewTask1.getZeitaufwand();
    }

    //setzt die User aus ToUser ins Feld
    //well resettet halt New Task komplett
    public void resetNewTask() {
        GUINewTask1.resetUsers();
        GUINewTask1.resetSubject();
        GUINewTask1.resetDescription();
        GUINewTask1.resetZeitaufwand();
    }

    //Speichert die neue Task in der 
    //Idk db Stuff fehlt noch?
    public void saveNewTask() {
        String[] user = GUINewTask1.getUser();
        String betreff = GUINewTask1.getSubject();
        String body = GUINewTask1.getDescription();
        int zeit = GUINewTask1.getZeitaufwand();
        brain.Savedraft(user, betreff, body, zeit);
    }

    //"Verschickt" die neue Aufgabe
    //Idk db Stuff fehlt noch?
    public void sendTask() {
        int[] iD_User = new int[GUINewTask1.getUser().length];
        Worker worker;

        for (int i = 0; i < GUINewTask1.getUser().length; i ++) {
            worker = new Worker(GUINewTask1.getUser()[i]);

            iD_User[i] = worker.getiDWorker();
        }
        worker = new Worker(username);
        brain.taskAbschicken(GUINewTask1.getZeitaufwand(), GUINewTask1.getSubject(), GUINewTask1.getDescription(), worker.getiDWorker(), iD_User);
    }

    //GUIToUser Funktionszugriffe
    //Setzt alle User die von der Person aufgaben bekommen können in eine Liste
    public void setlstAllUsers( String[] sAllUsers ) {
        GUIToUser1.setlstAllUsers(sAllUsers);
    }

    //Setzt alle Selected Users in die andere Liste
    public void setlstSelectedUseres( String[] sSelectedUsers ) {
        GUIToUser1.setlstSelectedUseres(sSelectedUsers);
    }

    public void setSelectedUsersEmpty() {
        String[] asEmpty = new String[1];
        GUIToUser1.setlstSelectedUseres(asEmpty);
    }

    //bekommt alle selected Users als String List
    public String[] getlstAllUseresSelected() {
        return GUIToUser1.getlstAllUseresSelected();
    }

    public String getSelectedUserSelected() {
        return GUIToUser1.getSelectedUsersSelected();
    }

    public String[] getSelectedUsersAll() {
        return GUIToUser1.getSelectedUsersAll();
    }

    //Hier müsste wie auch immer der Selected User removed werden geht aber nicht weil kack listen
    public void deleteOneSelectedUser() {
        String aUserToRemove = this.getSelectedUserSelected();
        String[] aAllUSersSelected = this.getSelectedUsersAll();
        if (aAllUSersSelected.length > 1) {
            String[] newAllSelectedUsers = new String[aAllUSersSelected.length - 1];
            int f = 0;
            for (String aAllUSersSelected1 : aAllUSersSelected) {
                if ( ! aUserToRemove.equals(aAllUSersSelected1)) {
                    newAllSelectedUsers[f] = aAllUSersSelected1;
                    f ++;
                }
            }
            this.setlstSelectedUseres(newAllSelectedUsers);
        }else {
            this.setSelectedUsersEmpty();
        }

    }

    //setzt die User auf die die man angeklickt hat, weiß noch nicht wie man das macht, das auch die bleiben, welche man davor angeklickt hat.
    public void btnAnFunktion() {
        List<String> newlySelected = new LinkedList<>(Arrays.asList(getSelectedUsersAll()));
        for (String user : getlstAllUseresSelected()) {
            if ( ! newlySelected.contains(user)) {
                newlySelected.add(user);
            }
        }
        setlstSelectedUseres(newlySelected.toArray(String[] :: new));
    }

    //schreibt aus GUIToUser die ausgewählten User in die GUINewTask
    public void IstSelectedUseresIntotxfToUser() {
        GUINewTask1.setUsers(GUIToUser1.getAllSelectedUserIds());
    }

    public void OpenbenutzerErstellen() {
        if (worker1.getPosition() < 2) {
            GUIAccount1.setVisible(true);
        }else {
            JOptionPane.showMessageDialog(GUIAccount1, "Du hast nicht die Befugnisse dies zu tun");
        }

    }

    public void benutzerErstellen() {
        try {
            int salary = GUIAccount1.getGehalt();
            int position = GUIAccount1.getPosition();
            String email = GUIAccount1.getEmail();
            String name = GUIAccount1.getLastName();
            String firstName = GUIAccount1.getFirstName();
            if (position >= worker1.getPosition()) {
                PasswordGenerator pg = new PasswordGenerator();
                Worker worker = new Worker(salary, position, 0, name, firstName, email, firstName + "." + name, pg.generatePassword(12, true, true, true, true));
                clearBenutzerGUI();
                JOptionPane.showMessageDialog(GUIToUser1, "Dein Benutzername ist: " + worker.getUsername() + "\n Dein Passwort lautet: " + worker.getPasswort() + "\nEine Email mit diesen Informationen wurde ihnen zu geschickt.");
                brain.sendAccountMail(worker);
            }else {
                JOptionPane.showMessageDialog(GUIToUser1, "Die Position ist höher als deine eigene");
            }
        } catch (NullPointerException pe) {
            JOptionPane.showMessageDialog(GUIToUser1, "Bitte wähle eine Position aus");
        } catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(GUIToUser1, "Das Gehalt darf nur prositive Zahlen so wie keine Währungszeichen");
        }
    }

    public void clearBenutzerGUI() {
        GUIAccount1.GUIAccountBenutzerClearALL();
        GUIAccount1.setPosition(-1);
        GUIAccount1.GUIAccountPasswordClearAll();
    }

    public void abbrechenBenutzer() {
        GUITaskAnsicht1.setVisible(true);
        GUIAccount1.setVisible(false);
    }

    public void taskAnlegen() throws NumberFormatException {
        if ("".equals(GUINewTask1.getSubject())) {
            throw new NumberFormatException();
        }
        String[] recipient = GUINewTask1.getUser();
        List<Worker> workerlist = new ArrayList<>();
        List<Integer> indicesToRemove = new ArrayList<>();
        for (int i = 0; i < recipient.length; i ++) {
            workerlist.add(new Worker(recipient[i]));
            if (workerlist.get(i).getPosition() < worker1.getPosition()) {
                JOptionPane.showMessageDialog(GUINewTask1, "Du kannst nicht " + workerlist.get(i).getUsername() + " eine Aufgabe stellen.");
                indicesToRemove.add(i);
            }
        }

        Collections.sort(indicesToRemove, Collections.reverseOrder());
        for (int index : indicesToRemove) {
            workerlist.remove(index);
        }

        if ( ! workerlist.isEmpty()) {
            Task task = new Task(GUINewTask1.getZeitaufwand(), GUINewTask1.getDescription(), GUINewTask1.getSubject(), worker1.getiDWorker());
            for (Worker worker : workerlist) {
                task.fillworkertasktable(worker.getiDWorker());
                brain.sendTaskMail(worker, GUINewTask1.getSubject(), GUINewTask1.getDescription(), GUINewTask1.getZeitaufwand());
            }
            GUINewTask1.resetUsers();
            GUINewTask1.resetSubject();
            GUINewTask1.resetDescription();
            GUINewTask1.resetZeitaufwand();
            setGUINewTaskInvisible();
            btnMyTaskRefresh();
        }else {
            JOptionPane.showMessageDialog(GUINewTask1, "Es wurden keine Arbeiter eingetragen");
        }
    }

    public void loadDraft() {
        Draft draft = brain.getdraft();
        if ( ! ( draft.getEmpfaenger() == null || draft.getBetreff() == null || draft.getBody() == null )) {
            GUINewTask1.setUsers(draft.getEmpfaenger());
            GUINewTask1.setZeitaufwand(draft.getZeit());
            GUINewTask1.setSubject(draft.getBetreff());
            GUINewTask1.setDescription(draft.getBody());
        }
    }

    public void setlstAllUsers() {
        GUIToUser1.setlstAllUsers(brain.getAllUsersIDs().toArray(String[] :: new));
        GUIToUser1.setlstSelectedUseres(brain.getAllUsersIDs(GUINewTask1.getUser()));
    }
}
