package com.mycompany.raptortodo;


public class Worker {
    
    private String firstName;
    private String name;
    private int workerStatus;
    private int position;
    private double salary;
    private final int iDWorker;
    private String username;
    private String passwort;
    DB_abfrage db_abfrage;
    
    // herauslesen von exestierenden Worker
    public Worker(int iD_Worker){
        db_abfrage = new DB_abfrage();
        this.iDWorker = iD_Worker;
        this.firstName = db_abfrage.getFirstName(iD_Worker);
        this.name = db_abfrage.getName(iD_Worker);
        this.workerStatus = db_abfrage.getWorkerStatus(iD_Worker);
        this.position = db_abfrage.getPosition(iD_Worker);
        this.salary = db_abfrage.getSalary(iD_Worker);
        this.username = db_abfrage.getUsername(iD_Worker);
        this.passwort = db_abfrage.getPassword(iD_Worker);
    }
    
    // herauslesen eines exestierende Workers nach Anmeldung
    public Worker(String username){
        db_abfrage = new DB_abfrage();
        this.username = username;
        this.iDWorker = db_abfrage.getID_Worker(username);
        this.firstName = db_abfrage.getFirstName(this.iDWorker);
        this.name = db_abfrage.getName(this.iDWorker);
        this.workerStatus = db_abfrage.getWorkerStatus(this.iDWorker);
        this.position = db_abfrage.getPosition(this.iDWorker);
        this.salary = db_abfrage.getSalary(this.iDWorker);
        this.passwort = db_abfrage.getPassword(this.iDWorker);
    }

    // zum erstellen eines Workers
    public Worker(double salary, int position, int workerStatus, String name, String firstName, String email, String username, String passwort){
        db_abfrage = new DB_abfrage();
        this.firstName = firstName;
        this.name = name;
        this.workerStatus = workerStatus;
        this.position = position;
        this.salary = salary;
        this.username = username;
        this.passwort = passwort;
        db_abfrage.createWorker(salary, position, workerStatus, name, firstName, email, username, passwort);
        this.iDWorker = db_abfrage.getID_Worker(this.username);
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

    public void setUsername(String username) throws UsernameIsAlreadyTaken{
        if (db_abfrage.getMaxUser() != 0){
            for (int i = 1; i < db_abfrage.getMaxUser(); i++) {
                if (db_abfrage.getUsername(i).equals(username)) {
                    throw new UsernameIsAlreadyTaken();
                }
            }
            db_abfrage.setUsername(username, this.iDWorker);
            this.username = username;
        }
    }

    public void setPassword(String password){
        db_abfrage.setPassword(password, iDWorker);
        this.passwort = password;
    }

}