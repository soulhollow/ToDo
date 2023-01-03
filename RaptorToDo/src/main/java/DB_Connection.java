

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB_Connection {
    
    private String host;
    private String database;
    private String user;
    private String password;
    private int port;
    public Connection connection;
    
    DB_Connection(){
        host = "127.0.0.1";
        database = "todo-database";
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
    
    public void connect(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + database + "?autoReconnect=true", user, password);
            Thread.sleep(10);
        } catch (SQLException ex) {
          System.out.println("Verbidung nicht erfolgreich.");
        } catch (InterruptedException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
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

