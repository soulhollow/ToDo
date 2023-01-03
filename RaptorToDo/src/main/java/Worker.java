

import java.util.ArrayList;
import java.util.List;


public class Worker {
    
    private String firstName;
    private String name;
    private int workerStatus;
    private int position;
    private double salary;
    private final int iDWorker;
    private String username;
    private String passwort;
    private String email;
    private final DB_abfrage db_abfrage = new DB_abfrage();
    private Task task1;
    
    // herauslesen von exestierenden Worker
    public Worker(int iD_Worker){
        this.iDWorker = iD_Worker;
        this.firstName = db_abfrage.getFirstName(iD_Worker);
        this.name = db_abfrage.getName(iD_Worker);
        this.workerStatus = db_abfrage.getWorkerStatus(iD_Worker);
        this.position = db_abfrage.getPosition(iD_Worker);
        this.salary = db_abfrage.getSalary(iD_Worker);
        this.username = db_abfrage.getUsername(iD_Worker);
        this.passwort = db_abfrage.getPassword(iD_Worker);
        this.email = db_abfrage.getAdress(iD_Worker);
    }
    
    // herauslesen eines exestierende Workers nach Anmeldung
    public Worker(String username){
        this.username = username;
        this.iDWorker = db_abfrage.getID_Worker(username);
        this.firstName = db_abfrage.getFirstName(this.iDWorker);
        this.name = db_abfrage.getName(this.iDWorker);
        this.workerStatus = db_abfrage.getWorkerStatus(this.iDWorker);
        this.position = db_abfrage.getPosition(this.iDWorker);
        this.salary = db_abfrage.getSalary(this.iDWorker);
        this.passwort = db_abfrage.getPassword(this.iDWorker);
        this.email = db_abfrage.getAdress(this.iDWorker);
    }

    // zum erstellen eines Workers
    public Worker(double salary, int position, int workerStatus, String name, String firstName, String email, String username, String passwort){
        this.firstName = firstName;
        this.name = name;
        this.workerStatus = workerStatus;
        this.position = position;
        this.salary = salary;
        this.username = username;
        this.passwort = passwort;
        this.email = email;
        db_abfrage.createWorker(salary, position, workerStatus, name, firstName, email, username, passwort);
        this.iDWorker = db_abfrage.getID_Worker(this.username);
        setUsername(username+"."+this.iDWorker);
    }
    
    
    // getter
    public String getFirstName() {
        return firstName;
    }

    public String getName() {
        return name;
    }

    public int getWorkerStatus() {
        return workerStatus;
    }

    public int getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public int getiDWorker() {
        return iDWorker;
    }

    public String getUsername() {
        return username;
    }

    public String getPasswort() {
        return passwort;
    }

    public String getEmail() {
        return email;
    }


    
    //Setter
    public void setFirstName(String firstName) {
        db_abfrage.setFirstName(firstName, this.iDWorker);
        this.firstName = firstName;
    }

    public void setName(String name){
        db_abfrage.setName(name,this.iDWorker);
        this.name = name;
    }

    public void setWorkerStatus(int workerStatus) {
        db_abfrage.setWorkerStatus(workerStatus, this.iDWorker);
        this.workerStatus = workerStatus;
    }

    public void setPosition(int position) {
        db_abfrage.setPosition(position, this.iDWorker);
        this.position = position;
    }

    public void setSalary(double salary) {
        db_abfrage.setSalary(salary, this.iDWorker);
        this.salary = salary;
    }

    public void setUsername(String username) {
            db_abfrage.setUsername(username, this.iDWorker);
            this.username = username;
    }

    public void setPassword(String password){
        db_abfrage.setPassword(password, iDWorker);
        this.passwort = password;
    }

    public void setEmail(String email) {
        db_abfrage.setAdress(email, iDWorker);
        this.email = email;
    }
    
    public Task[] fillTasksStatus1(){
        String[] taskID = db_abfrage.getCorrespondingTaskID(this.iDWorker);
        List <Task> tasklist1 = new ArrayList<>();
        for (int i = 0; i < taskID.length; i++) {
            Task task = new Task(Integer.parseInt(taskID[i]));
            if (task.getStatus(iDWorker)==1) {
                tasklist1.add(task);
            }
        }
        Task[] array = tasklist1.toArray(new Task[tasklist1.size()]);
        return array;
    }
    
    public Task[] fillTasksStatus2(){
        String[] taskID = db_abfrage.getCorrespondingTaskID(this.iDWorker);
        List <Task> tasklist1 = new ArrayList<>();
        for (int i = 0; i < taskID.length; i++) {
            Task task = new Task(Integer.parseInt(taskID[i]));
            if (task.getStatus(iDWorker)==2) {
                tasklist1.add(task);
            }
        }
        Task[] array = tasklist1.toArray(new Task[tasklist1.size()]);
        return array;
    }
    
    
}