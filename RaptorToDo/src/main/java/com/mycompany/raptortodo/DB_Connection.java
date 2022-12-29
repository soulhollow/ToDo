package com.mycompany.raptortodo;

import java.sql.*;

public class DB_Connection {
    
    private String host;
    private String database;
    private String user;
    private String password;
    private int port;
    public Connection connection;
    
    DB_Connection(){
        host = "127.0.0.1";
        database = "todo1";
        user = "root";
        password = "";
        port = 3306;
        
        connect();
    }

    public void close() {
        try {
            connection.close();
            System.out.println("Verbindung geschlossen.");
        } catch (SQLException ex) {
          System.out.println("Verbidung konte nicht geschlossen werden.");
        }
    }
    
    public void connect() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + database + "?autoReconnect=true", user, password);
            System.out.println("Verbindung erfolgreich.");
        } catch (SQLException ex) {
          System.out.println("Verbidung nicht erfolgreich.");
        }
    }
    
    public void update(String qr) {
        try {
            Statement st = connection.createStatement();
            st.executeUpdate(qr);
            st.close();
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
    }
    
    public ResultSet query(String qr) {
        
        ResultSet rs = null;
        
        try {
            Statement st = connection.createStatement();
            rs = st.executeQuery(qr);
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
        
        return rs;
    }
    
    public Connection getConnection(){
        return connection;
    } 
    
}

