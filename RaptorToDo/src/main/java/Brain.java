//author florian.gorshoefer ++ florian.ruffner ++ moritz.rothert


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Brain {
    
    //Variablen 
    private Worker[] allWorkers;
    private List<Task> allTasks;
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
        Task value = allTasks.get(i);
        return value;
    }
    
    
    //Funktionen
    
    //alle worker in ein array
    public void fillWorkerArray(){
        int iMax = db_abfrage.getMaxUser();
        allWorkers = new Worker[iMax+1];
        for(int i = 0; i <= iMax ; i++){
            if(db_abfrage.getWorkerStatus(i) != 4){
                allWorkers[i] = new Worker(i);
            }
        }
    }
    
    // alle Tasks für einen Worker in ein Array
    public void fillTaskArrayforWorker(int iD_Worker) {
        int iMax = db_abfrage.getMaxID_Task();
        allTasks = new ArrayList<>();
        for(int i = 0; i <= iMax ; i++){
            if(db_abfrage.getStatus(i, iD_Worker) != 3){
            int[] correspondingWorkerID = db_abfrage.getCorrespondingWorkerID(i);
                for (int j = 0; j < correspondingWorkerID.length; j++) {
                    if (correspondingWorkerID[j] == iD_Worker) {
                        allTasks.add(new Task(i));
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

    public String[] getallTaskSubjects(int iID){
            this.fillTaskArrayforWorker(iID);
            if (allTasks.isEmpty()) {
                String[] nichtsdrin = new String[0];
                return nichtsdrin;
            }
            String[] sListData;
            sListData = new String[this.allTasks.size()];
            for(int j = 0;j<this.allTasks.size(); j++){
                sListData[j] = this.allTasks.get(j).getTaskSubject();
            }
            return sListData;
    }
    
    public Task[] getallTask(int iD_Worker){
        fillTaskArrayforWorker(iD_Worker);
        Task[] array = allTasks.toArray(new Task[allTasks.size()]);
        return array;
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
    
    public void exit(){
        db_abfrage.close();
    }

    public void sendAccountMail(Worker worker){
        String adress = worker.getEmail();
        try {
            GMailer gMailer = new GMailer();
            gMailer.setToEmailAddress(adress);
            gMailer.setSubject("Account Daten");
            gMailer.setMessage("Your username is: " + worker.getUsername() + " Your Password is: " + worker.getPasswort()+""
                    + System.lineSeparator()
                    + System.lineSeparator()
                    + System.lineSeparator()
                    + "Bitte ändern sie schnell möglichst ihr Password in ihr eignes.");
            gMailer.sendMail();
        } catch (Exception ex) {
            Logger.getLogger(GUINewTask.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void sendTaskMail(Worker worker, String subject, String description, int zeitaufwand){
        String adress = worker.getEmail();
        try {
            GMailer gMailer = new GMailer();
            gMailer.setToEmailAddress(adress);
            gMailer.setSubject(subject);
            gMailer.setMessage(description+""
                    + System.lineSeparator()
                    + System.lineSeparator()
                    + System.lineSeparator()
                    +"_______________________________________" + System.lineSeparator()
                    + "estimated time for this task will be : " + zeitaufwand);
            gMailer.sendMail();
        } catch (Exception ex) {
            Logger.getLogger(GUINewTask.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void SendInvoiceMail(Task task){
        Worker worker = new Worker(task.getCreator());
        String adress = worker.getEmail();
        try {
            GMailer gMailer = new GMailer();
            gMailer.setToEmailAddress(adress);
            gMailer.setSubject("Invoice for Task : #" + task.getiD_Task());
            gMailer.setMessage("In the attachment you can find the invoice of the task #"+ task.getiD_Task() 
                    + System.lineSeparator());
            gMailer.sendMailWithAttachment();
        } catch (Exception ex) {
            Logger.getLogger(GUINewTask.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public String[] getallUsers(){
        this.fillWorkerArray();
        String[] sUsers = new String[allWorkers.length];
        Worker wTemp;
        int j = 0;
        for(int i = 0; i < allWorkers.length;i++){
            wTemp = allWorkers[i];
            if(worker1.getPosition()<= wTemp.getPosition()){

                sUsers[j] = wTemp.getName() + wTemp.getFirstName() + "";
                j++;
            }
        }
        return sUsers;
    }
    
}
