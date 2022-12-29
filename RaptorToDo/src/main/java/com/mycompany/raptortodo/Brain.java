//author florian.gorshoefer ++ florian.ruffner ++ moritz.rothert
package com.mycompany.raptortodo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Brain {
    
    //Variablen 
    private Worker[] allWorkers;
    private Task[] allTasks;
    DB_abfrage db_abfrage;
    Worker worker1;
    Task task1;
    Draft draft;
    
    //Konstruktor
    public Brain(){
        db_abfrage = new DB_abfrage();
        draft = new Draft();
    }
    // getter
    public Worker getWorker(int i){
        Worker value = allWorkers[i];
        return value;
    }
    
    public Task getTask(int i){
        Task value = allTasks[i];
        return value;
    }
    
    
    //Funktionen
    
    //alle worker in ein array
    public void fillWorkerArray(){
        int iMax = db_abfrage.getMaxUser();
        for(int i = 1; i <= iMax ; i++){
            if(db_abfrage.getWorkerStatus(i) != 4){
                allWorkers[i-1] = new Worker(i);
            }
        }
    }
    
    // alle Tasks für einen Worker in ein Array
    public void fillTaskArrayforWorker(int iD_Worker) {
        int iMax = db_abfrage.getMaxID_Task();
        for(int i = 1; i <= iMax ; i++){
            if(db_abfrage.getStatus(i) != 3){
                for (int j = 0; j < 10; j++) {
                    int[] correspondingWorkerID = db_abfrage.getCorrespondingWorkerID(i);
                    if (correspondingWorkerID[j] == iD_Worker) {
                        allTasks[i-1] = new Task(i);
                    }
                }
            }
        }
    }
    
    // username passwort vergleichen
    public boolean checkKey (String username, String password) {
        worker1 = new Worker(username);
        boolean value = false;
        if(worker1.getPasswort().equals(password)){
            value = true;
        }
        return value;
    }
    
    // wird bei button abgabe ausgeführt und setzt die benutzte zeit ein und den setzt den Status auf bendet
    public void abgabeTask (int iD_Task, int usedTime){
        task1 = new Task(iD_Task);
        task1.setUsedTime(usedTime);
        task1.setStatus(3);
    }
    
    // bei button bearbeiten wird dies ausgeführt
    public void bearbeitenTask(int iD_Task){
        task1 = new Task(iD_Task);
        task1.setStatus(2);
    }
    
    // erstellt eine neue Task und fügt alle Mitarbeiter, welche gebraucht werden ein. 
    public void taskAbschicken(int estimatedTime, String taskTag, String taskSubject, int creator, int id_Worker[]){
        task1 = new Task(estimatedTime,  taskTag,  taskSubject, creator);
        int iD_Task = task1.getiD_Task();
        for (int i = 0; i < id_Worker.length; i++) {
            db_abfrage.setCorrespondingWorkerID(id_Worker[i], iD_Task);
        }
    }
    
    // mehode um bei "An" nach usernames zu Suchen gibt ein Array mit alles übereinstimmungen zurück (den Username)
    public String[] SearchUser(String anfang){
        fillWorkerArray();
        List<String> values = new ArrayList<>();
        for (int i = 0; i < allWorkers.length; i++) {
            if(allWorkers[i].getUsername().startsWith(anfang))
            values.add(allWorkers[i].getUsername());
        }
        return values.stream().map(i -> i.toString()).toArray(String[]::new);
    }
    
    //methode um alle Tasktags in eine Liste zu hole n für die Task-Übersicht
    //Error: java.sql.SQLSyntaxErrorException: Unknown column 'ID_Task' in 'field list'
    //Vermutung: getMaxID_Task stimmt noch was nicht
    public String[] getallTasktags(int iID){
            this.fillTaskArrayforWorker(iID);
            int i = this.allTasks.length;
            String[] sListData;
            sListData = new String[i];
            for(int j = 0;j<=i;j++){
                sListData[j] = this.allTasks[j].getTaskTag();
            }
            
            
            return sListData;
    }
    
    
    public void Savedraft (String[] empfaenger, String betreff, String body, int zeit){
        draft.setEmpfaenger(empfaenger);
        draft.setBetreff(betreff);
        draft.setBody(body);
        draft.setZeit(zeit);
    }
    
    public Draft getdraft(){
        return this.draft;
    }
}
