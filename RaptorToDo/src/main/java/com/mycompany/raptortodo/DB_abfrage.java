package com.mycompany.raptortodo;

import java.sql.*;
import java.util.*;

public class DB_abfrage {
    
    DB_Connection dp_connection;
    public DB_abfrage() {
        dp_connection = new DB_Connection();
    }
    
    
    

    public double getSalary(int iD_Worker){
        ResultSet rs;
        String sql = "SELECT Salary FROM workertable WHERE ID_Worker = " + iD_Worker;
        rs = dp_connection.query(sql);
        double value = 0;
        try {
            while (rs.next()) {
                value = rs.getDouble("Salary");
        }

        } catch (SQLException ex) {
            System.out.println("Error getting Salary");
        }
        return value;
    }

    public int getPosition(int iD_Worker){
        ResultSet rs;
        String sql = "SELECT Position FROM workertable WHERE ID_Worker = " + iD_Worker;
        rs = dp_connection.query(sql);
        int value = 0;
        try {
            while (rs.next()) {
                value = rs.getInt("Position");
        }

        } catch (SQLException ex) {
            System.out.println("Error getting Position");
        }
        return value;
    }

    public String getName(int iD_Worker){
        ResultSet rs;
        String sql = "SELECT Name FROM workertable WHERE ID_Worker =" + iD_Worker;
        rs = dp_connection.query(sql);
        String value = "";
        try {
            while (rs.next()) {
                value = rs.getString("Name");
            }
        } catch (SQLException ex) {
            System.out.println("Error getting Name");
        }
        return value;
    }

public String getFirstName(int iD_Worker){
    ResultSet rs;
    String sql = "SELECT FirstName FROM workertable WHERE ID_Worker = " + iD_Worker;
    rs = dp_connection.query(sql);
    String value = "";
    try {
        while (rs.next()) {
            value = rs.getString("FirstName");
        }
    } catch (SQLException ex) {
        System.out.println("Error getting FirstName");
    }
    return value;
}

public int getWorkerStatus(int iD_Worker){
    ResultSet rs;
    String sql = "SELECT WorkerStatus FROM workertable WHERE ID_Worker = " + iD_Worker;
    rs = dp_connection.query(sql);
    int value = 0;
    try {
        while (rs.next()) {
            value = rs.getInt("WorkerStatus");
        }
    } catch (SQLException ex) {
        System.out.println("Error getting WorkerStatus");
     }
    return value;
    }

    public String getAdress(int iD_Worker){
        ResultSet rs;
        String sql = "SELECT Adress FROM workertable WHERE ID_Worker = " + iD_Worker;
        rs = dp_connection.query(sql);
        String value = "";
        try {
            while (rs.next()) {
                value = rs.getString("Adress");
            }
        } catch (SQLException ex) {
            System.out.println("Error getting Adress");
        }
        return value;
}

    
    public int getEstimatedTime(int iD_Task){
        ResultSet rs;
        String sql = "SELECT estimatedTime FROM tasktable WHERE ID_Task = " + iD_Task;
        rs = dp_connection.query(sql);
        int value = 0;
        try {
            while (rs.next()) {
                value = rs.getInt("EstimatedTime");
            }
        } catch (SQLException ex) {
            System.out.println("Error getting EstimatedTime");
        }
        return value;
    }

    public int getStatus(int iD_Task){
        ResultSet rs;
        String sql = "SELECT Status FROM tasktable WHERE ID_Task = " + iD_Task;
        rs = dp_connection.query(sql);
        int value = 0;
        try {
            while (rs.next()) {
                value = rs.getInt("Status");
            }
        } catch (SQLException ex) {
            System.out.println("Error getting Status");
        }
        return value;
    }

    public String getTaskTag(int iD_Task){
        ResultSet rs;
        String sql = "SELECT taskTag FROM tasktable WHERE ID_Task = " + iD_Task;
        rs = dp_connection.query(sql);
        String value = "";
        try {
            while (rs.next()) {
                value = rs.getString("TaskTag");
            }
        } catch (SQLException ex) {
            System.out.println("Error getting TaskTag");
        }
        return value;
    }

    public int[] getCorrespondingWorkerID(int iD_Task){
        ResultSet rs;
        String sql = "SELECT ID_Worker FROM tasktable WHERE ID_Task = " + iD_Task;
        rs = dp_connection.query(sql);
        List<Integer> values = new ArrayList<>();
        try {
            while (rs.next()) {
                values.add(rs.getInt("CorrespondingWorkerID"));
            }
        } catch (SQLException ex) {
            System.out.println("Error getting CorrespondingWorkerID");
        }
        return values.stream().mapToInt(i -> i).toArray();
    }

    
    public int getUsedTime (int iD_Task){
        ResultSet rs;
        String sql = "SELECT UsedTime FROM tasktable WHERE ID_Task = " + iD_Task;
        rs = dp_connection.query(sql);
        int value = 0;
        try {
            while (rs.next()) {
                value = rs.getInt("UsedTime");
            }
        } catch (SQLException ex) {
            System.out.println("Error getting UsedTime");
        }
        return value;
    }
    
    public int getID_Worker(String username){
        ResultSet rs;
        String sql = "SELECT ID_Worker FROM passwordtable WHERE username = '" + username + "'";
        rs = dp_connection.query(sql);
        int value = 0;
        try {
            while (rs.next()) {
                value = rs.getInt("ID_Worker");
            }
        } catch (SQLException ex) {
            System.out.println("Error getting ID_Worker");
        }
        return value;
    }
    
    public int getMaxID_Task(){
        ResultSet rs;
        String sql = "SELECT ID_Task FROM workertable WHERE ID_Task=(SELECT MAX(ID_Task) FROM tasktable); ";
        rs = dp_connection.query(sql);
        int value = 0;
        try {
            while (rs.next()) {
                value = rs.getInt("ID_Task");
            }
        } catch (SQLException ex) {
            System.out.println("Error getting ID_Task");
        }
        return value;
    }
    
     public String getUsername(int iD_Worker){
        ResultSet rs;
        String sql = "SELECT username FROM passwordtable WHERE ID_Worker = " + iD_Worker;
        rs = dp_connection.query(sql);
        String value = "";
        try {
            while (rs.next()) {
                value = rs.getString("username");
            }
        } catch (SQLException ex) {
            System.out.println("Error getting username");
        }
        return value;
    }
     
     public String getTaskSubject(int iD_Task){
        ResultSet rs;
        String sql = "SELECT TaskSubject FROM Tasktable WHERE ID_Task = " + iD_Task;
        rs = dp_connection.query(sql);
        String value = "";
        try {
            while (rs.next()) {
                value = rs.getString("TaskSubject");
            }
        } catch (SQLException ex) {
            System.out.println("Error getting TaskSubject");
        }
        return value;
    }
     
    public int getCreator(int iD_Task){
        ResultSet rs;
        String sql = "SELECT Creator FROM Tasktable WHERE ID_Task = " + iD_Task;
        rs = dp_connection.query(sql);
        int value = 0;
        try {
            while (rs.next()) {
                value = rs.getInt("Creator");
            }
        } catch (SQLException ex) {
            System.out.println("Error getting Creator");
        }
        return value;
    }
     
     public int getMaxUser (){
        ResultSet rs;
        String sql = "SELECT ID_Worker FROM workertable WHERE ID_Worker=(SELECT MAX(ID_Worker) FROM workertable)";
        rs = dp_connection.query(sql);
        int value = 0;
        try {
            while (rs.next()) {
                value = rs.getInt("ID_Task");
            }
        } catch (SQLException ex) {
            value = 0;
        }
        return value;
    }
    
    public String getPassword(int iD_Worker){
        ResultSet rs;
        String sql = "SELECT Password FROM passwordtable WHERE ID_Worker = " + iD_Worker;
        rs = dp_connection.query(sql);
        String value = "";
        try {
            while (rs.next()) {
                value = rs.getString("password");
            }
        } catch (SQLException ex) {
            System.out.println("Error getting password");
        }
        return value;
    }
    
    
    public void setSalary(double salary, int iD_Worker) {
        String sql = "UPDATE workertable SET Salary = '" + salary + "' WHERE ID_Worker = " + iD_Worker;
        dp_connection.update(sql);
    }

    public void setPosition(int position, int iD_Worker){
    String sql = "UPDATE workertable SET Position = '" + position + "' WHERE ID_Worker = " + iD_Worker;
    dp_connection.update(sql);
    }

    public void setName(String name, int iD_Worker) {
        String sql = "UPDATE workertable SET Name = '" + name + "' WHERE ID_Worker = " + iD_Worker;
        dp_connection.update(sql);
    }
    
     public void setFirstName(String firstName, int iD_Worker) {
        String sql = "UPDATE workertabele SET FirstName = '" + firstName + "' WHERE ID_Worker = " + iD_Worker;
        dp_connection.update(sql);
    }
     
    public void setWorkerStatus(int workerStatus, int iD_Worker) {
        String sql = "UPDATE workertable SET WorkerStatus = '" + workerStatus + "' WHERE ID_Worker = " + iD_Worker;
        dp_connection.update(sql);
    }

    public void setAdress(String adressOwner, int iD_Worker) {
        String sql = "UPDATE workertable SET AdressOwner = '" + adressOwner + "' WHERE ID_Worker = " + iD_Worker;
        dp_connection.update(sql);
    }


    public void setEstimatedTime(int estimatedTime, int iD_Task) {
        String sql = "UPDATE tasktable SET estimatedTime = '" + estimatedTime + "' WHERE ID_Task = " + iD_Task;
        dp_connection.update(sql);
    }

    public void setStatus(int taskStatus, int iD_Task)  {
        String sql = "UPDATE tasktable SET taskStatus = '" + taskStatus + "' WHERE ID_Task = " + iD_Task;
        dp_connection.update(sql);
    }

    public void setTaskTag(String taskTag, int iD_Task) {
        String sql = "UPDATE tasktable SET taskTag = '" + taskTag + "' WHERE ID_Task = " + iD_Task;
        dp_connection.update(sql);
    }

    public void setCorrespondingWorkerID(int correspondingWorkerID, int iD_Task) {
        String sql = "UPDATE workertasktable SET ID_Worker = '" + correspondingWorkerID + "' WHERE ID_Task = " + iD_Task;
        dp_connection.update(sql);
    }
    
    public void setPassword(String password, int iD_Worker) {
        String sql = "UPDATE passwordtable SET password ='" + password + "' WHERE ID_Worker = " + iD_Worker;
        dp_connection.update(sql);
    }
    
    public void setUsername(String username, int iD_Worker){
        String sql = "UPDATE passwordtable SET username ='" + username + "' WHERE ID_Worker = " + iD_Worker;
        dp_connection.update(sql);
    }
    
    public void setTaskSubject(String taskSubject, int iD_Task){
        String sql = "UPDATE tasktable SET TaskSubject ='" + taskSubject + "' WHERE ID_Task = " + iD_Task;
        dp_connection.update(sql);
    }
    public void setCreator(int creator, int iD_Task){
        String sql = "UPDATE tasktable SET Creator ='" + creator + "' WHERE ID_Task = " + iD_Task;
        dp_connection.update(sql);
    }
    
    public void setUsedTime (int creator, int iD_Task){
        String sql = "UPDATE tasktable SET Creator ='" + creator + "' WHERE ID_Task = " + iD_Task;
        dp_connection.update(sql);
    }
    
    public void createWorker (double salary, int position, int workerStatus, String name, String firstName, String email, String username, String password){
        int value = getMaxUser();
        String sql = "INSERT INTO workertable (" + value +", "+ salary +", " + position + ", "  + workerStatus + ", '" + name + "', '" + firstName + "', '" + email + "')";
        dp_connection.update(sql);
        sql = "UPDATE passwordtable SET username ='" + username + "' WHERE ID_Worker = " + value;
        dp_connection.update(sql);
        sql = "UPDATE passwordtable SET password ='" + password + "' WHERE ID_Worker = " + value;
        dp_connection.update(sql);
        
    }
        public int createTask (int status, int estimatedTime, String taskTag, String taskSubjekt, int creator){
            String sql = "INSERT INTO tasktable (" + status +", " + estimatedTime + ", '" + taskTag + "', '" + taskSubjekt + "'" + creator +")";
            dp_connection.update(sql);
            int value = getMaxID_Task();
            return value;
    }
    
}
