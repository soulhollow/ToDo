package com.mycompany.raptortodo;

import java.sql.SQLException;

public class Task {
    
    private final int iD_Task;
    private int estimatedTime;
    private int status;
    private String taskTag;
    private String taskSubject;
    private int usedTime;
    private int creator;
    private DB_abfrage db_abfrage;
    
    public Task(int iD_Task){
        db_abfrage = new DB_abfrage();
        this.iD_Task = iD_Task;
        this.estimatedTime = db_abfrage.getEstimatedTime(this.iD_Task);
        this.status = db_abfrage.getStatus(this.iD_Task);
        this.taskTag = db_abfrage.getTaskTag(this.iD_Task);
        this.taskSubject = db_abfrage.getTaskSubject(this.iD_Task);
        this.usedTime = db_abfrage.getUsedTime(this.iD_Task);
        this.creator = db_abfrage.getCreator(this.iD_Task);
    }

    public Task(int estimatedTime, String taskTag, String taskSubject, int creator) {
        db_abfrage = new DB_abfrage();
        this.iD_Task = db_abfrage.createTask(1, estimatedTime, taskTag, taskSubject, creator);
        this.estimatedTime = estimatedTime;
        this.status = status;
        this.taskTag = taskTag;
        this.taskSubject = taskSubject;
        this.usedTime = 0;
    }

    public int getiD_Task() {
        return iD_Task;
    }

    public int getEstimatedTime() {
        return estimatedTime;
    }

    public int getStatus() {
        return status;
    }

    public String getTaskTag() {
        return taskTag;
    }

    public String getTaskSubject() {
        return taskSubject;
    }
    
    public int getUsedTime(){
        return usedTime;
    }

    public int getCreator() {
        return creator;
    }
    
    
    //Setter


    public void setEstimatedTime(int estimatedTime){
        db_abfrage.setEstimatedTime(estimatedTime, this.iD_Task);
        this.estimatedTime = estimatedTime;
    }

    public void setStatus(int status){
        db_abfrage.setStatus(status, this.iD_Task);
        this.status = status;
    }

    public void setTaskTag(String taskTag){
        db_abfrage.setTaskTag(taskTag, this.iD_Task);
        this.taskTag = taskTag;
    }

    public void setTaskSubject(String taskSubject){
        db_abfrage.setTaskSubject(taskSubject, this.iD_Task);
        this.taskSubject = taskSubject;
    }
    
    public void setUsedTime(int usedTime){
        db_abfrage.setUsedTime(usedTime, this.iD_Task);
        this.usedTime = usedTime;
    }
    
    public void setCreator(int creator){
        db_abfrage.setCreator(creator, this.iD_Task);
        this.creator = creator;
    }
    
}


