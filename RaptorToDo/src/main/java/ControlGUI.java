

//import java.util.List;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


//import java.util.ArrayList;
//import java.util.Collection;

public class ControlGUI {
    
    //Deklarieren von Variablen
    private GUITaskAnsicht GUITaskAnsicht1;
    private GUINewTask GUINewTask1;
    private GUIToUser GUIToUser1;
    private GUILogin GUILogin1;
    private GUIBenutzerErstellen GUIBenutzerErstellen1;
    private GUIChangePassword GUIChangePassword1;
    
    private String username;
    private String password;
    private String newPassword;
    private String repeatNewPassword;
    private Brain brain;
    Worker worker1;
    Task task1;
    Task[] taskarr1;
    Task[] taskarr2;
    
    public ControlGUI(){
        
        try {
            //Erstellt die Login-Oberflächen
            GUILogin1 = new GUILogin(this);
            
            //macht den Login Screen Sichtbar:
            GUILogin1.setVisible(true);
            
            //Erstellt alle anderen GUI Elemente
            GUITaskAnsicht1 = new GUITaskAnsicht(this);
            GUINewTask1 = new GUINewTask(this);
            GUIToUser1 = new GUIToUser(this);
            GUIBenutzerErstellen1 = new GUIBenutzerErstellen(this);
            GUIChangePassword1 = new GUIChangePassword(this);
            //macht alle anderen GUIElemente Standartmäßig Unsichtbar
            GUITaskAnsicht1.setVisible(false);
            GUINewTask1.setVisible(false);
            GUIToUser1.setVisible(false);
            GUIBenutzerErstellen1.setVisible(false);
            GUIChangePassword1.setVisible(false);
            this.brain = new Brain();
        } catch (Exception ex) {
            Logger.getLogger(ControlGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

        //setter um die verschiedene GUI Elemente sichtbar/unsichtbar zu schalten
        public void setTaskAnsichtVisible (){
             GUITaskAnsicht1.setVisible(true);
        }
        public void setTaskAnsichtInvisible(){
            GUITaskAnsicht1.setVisible(false);
        }
        
        public void setGUIChangePasswordVisible (){
            GUIChangePassword1.setVisible(true);
        }
        public void setGUIChangePasswordInvisible(){
            GUIChangePassword1.setVisible(false);
        }
        
        
        public void setGUILoginVisible(){
            GUILogin1.setVisible(true);
        }
        public void setGUILoginInvisible(){
            GUILogin1.setVisible(false);
        }
        
        public void setGUINewTaskVisible(){
            GUINewTask1.setVisible(true);
        }
        public void setGUINewTaskInvisible(){
            GUINewTask1.setVisible(false);
        }
        
        public void setGUIToUserVisible(){
            GUIToUser1.setVisible(true);
            setlstAllUsers();
        }
        public void setGUIToUserInvisible(){
            GUIToUser1.setVisible(false);
        }
        
        
        //funktion zum schließen des Programms
        public void exitProgramm(){
            System.exit(0);
            brain.exit();
        }
        
        
        //GUILogin Funktionzugriffe
        
        //Überprüfen aus der db ob Login Daten richtig sind und boolean an GUILogin btnLogin geben
        
        public void loginLoginBtn(){
            username = GUILogin1.getUser();
            password = GUILogin1.getPassword();
            if(brain.checkKey(username, password)){
                this.setTaskAnsichtVisible();
                this.setGUILoginInvisible();
                this.worker1 = new Worker(username);
                setlstAllTasks();
            }
            else{
                GUILogin1.resetUser();
                GUILogin1.resetPassword();
                JOptionPane.showMessageDialog(GUILogin1, "\"The username & passwords do not match.\""
                            + System.lineSeparator() + "   " +
                            "\"Check your input and try again.\""
                            + System.lineSeparator() +
                            "\"If you still cannot login consult with your admin"
                            + System.lineSeparator() + 
                            "under the following E-Mail adress : \"" );
                
                            
            }
            
        }
        
        // GUIChangePassword Funktionzugriffe
        public void ChangePasswordBtn(){
            
            username = GUIChangePassword1.getUsername();
            password = GUIChangePassword1.getOldPassword();
            newPassword = GUIChangePassword1.getNewPassword();
            repeatNewPassword = GUIChangePassword1.getNewPasswordRepeat();
            if (newPassword.equals(repeatNewPassword) ) {
                worker1.setPassword(newPassword);
                GUIChangePassword1.GUIChangePasswordClearAll();
                setGUIChangePasswordInvisible();
                JOptionPane.showMessageDialog(GUIChangePassword1, "Your Password has succesfully being changed " 
                                                                   + System.lineSeparator() + 
                                                                   "For our Security meassures please log in again with your new password");
                GUILogin1.setUser(worker1.getUsername());
                logoutBtnTaskAnsicht();
                
            } else {
                JOptionPane.showMessageDialog(GUIToUser1, "\"The new passwords do not match.\""
                            + System.lineSeparator() + 
                            "\"Check your input and try again or cancel password change.\"");                
                    
                    }
                }

        public void GUIChangePasswordsetUsername(){
            GUIChangePassword1.setUsername(worker1.getUsername());
        }
        
        // GUITaskansicht Funktionzugriffe
        
        //setzt das Feld von User in der Detail Ansicht
        public void setVonUser(String sUser) {
            GUITaskAnsicht1.setVonUser(sUser);
        }

        //setzt das Feld der eingeschätzten AUfgabenzeit in der Detailansicht
        public void setEstimatedTime(int iEstimatedTime){
            GUITaskAnsicht1.setEstimatedTime(iEstimatedTime);
        }
        
        //setzt die Taskübersicht Liste
        
        
        public void setlstAllTasks(){
            taskarr1 = worker1.fillTasksStatus1();
            taskarr2 = worker1.fillTasksStatus2();
            String[] taskSubjects1 = new String[taskarr1.length];
            String[] taskSubjects2 = new String[taskarr2.length];
            for (int i = 0; i < taskarr1.length; i++) {
                taskSubjects1[i] = taskarr1[i].getTaskSubject();
            }
            for (int i = 0; i < taskarr2.length; i++) {
                taskSubjects2[i] = taskarr2[i].getTaskSubject();
            }
            GUITaskAnsicht1.setlstAllTasks1(taskSubjects1);
            GUITaskAnsicht1.setlstAllTasks2(taskSubjects2);
        }
        
        public void setlstAllTasksEmpty(){
            //Erstellt halt nen String Array was genau nulol groß ist. Kp ob das Sinnig ist aber es funktioniert hoffentlich.
            String[] sListData;
            sListData = new String[0];
            GUITaskAnsicht1.setlstAllTasks1(sListData);
        }
        //fehlerbehandlung muss noch gemacht werden momentan ist einfach Zeit -1 gesetzt
        public int getBearbeitungszeit(){
            return GUITaskAnsicht1.getBearbeitungszeit();
        }
        
        //String muss schon Formatiert sein mit Zeilenumbrüchen
        public void setTaskDescription(String sTaskDescription){
            GUITaskAnsicht1.setTaskDescription(sTaskDescription);
        }
        
        //leert die TaskAnsichtFelder
        public void emptyTaskAnsicht(){
            this.setVonUser("");
            this.setEstimatedTime(0);
            this.setTaskDescription("");
            this.setlstAllTasksEmpty();
            GUITaskAnsicht1.setTxfTatsaechlicheZeit(0);
        }
        
        //refresht die Aufgaben die Angezeigt werden
        public void btnMyTaskRefresh(){
            this.setlstAllTasks();
        }
        
        //öffnet die Detail Ansicht einer Task bei Click eines buttons
        public void showTaskBtn(){
            
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
                sUser = wCreator.getName()+" "+wCreator.getFirstName();
                sTaskDescription = this.task1.getTaskSubject();
                iEstimatedTime = this.task1.getEstimatedTime();

                GUITaskAnsicht1.setEstimatedTime(iEstimatedTime);
                GUITaskAnsicht1.setTaskDescription(sTaskDescription);
                GUITaskAnsicht1.setVonUser(sUser);
            }
            if (GUITaskAnsicht1.istSelected2()) {
                iWhichTask = GUITaskAnsicht1.getListAllTasksSelection2();
                this.task1 = taskarr2[iWhichTask];
                iIDWorker = this.task1.getCreator();
                brain.fillWorkerArray();
                wCreator = brain.getWorker(iIDWorker);
                sUser = wCreator.getName()+" "+wCreator.getFirstName();
                sTaskDescription = this.task1.getTaskSubject();
                iEstimatedTime = this.task1.getEstimatedTime();

                GUITaskAnsicht1.setEstimatedTime(iEstimatedTime);
                GUITaskAnsicht1.setTaskDescription(sTaskDescription);
                GUITaskAnsicht1.setVonUser(sUser);
            }
            if (!GUITaskAnsicht1.istSelected2() && !GUITaskAnsicht1.istSelected1()) {
                JOptionPane.showMessageDialog(GUIToUser1, "Wähle eine Task aus.");
            }
        }
        //öffnet New Task nur das schon vorausgefüllt die Task drin steht. Der Creator wird zum Empfänger hinzugefügt
        public void taskBearbeitenBtn(){
            showTaskBtn();
            this.task1.setStatus(2,worker1.getiDWorker());
            btnMyTaskRefresh();
            
        }
        
        //Alle Felder und GUI´s werden geleert. Dann kann neu eingeloggt werden.
        public void logoutBtnTaskAnsicht(){
            
            //erstmal alles Unsichtbar machen für den Benutzer
            this.setTaskAnsichtInvisible();
            
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
            
            //last but not least das Brain zurücksetzen da fehlt noch zeugs?
            
            
            //einen Anmelde Screen wieder sichtbar machen.
            this.setGUILoginVisible();
            
        }
        
        //Momentan offene Aufgabe wird abgegeben dabei muss gecheckt werden ob Zeit Sinnvoll ist
        public void taskFinishBtnTaskAnsicht(){
            showTaskBtn();
            if (GUITaskAnsicht1.getBearbeitungszeit() == -1) {
                JOptionPane.showMessageDialog(GUIToUser1, "Bitte tragen sie ein wiel lange sie gebarucht haben.");
            }else{
                showTaskBtn();
                this.task1.setStatus(3, worker1.getiDWorker());
                this.task1.setUsedTime(GUITaskAnsicht1.getBearbeitungszeit(), worker1.getiDWorker());
                btnMyTaskRefresh();
                GUITaskAnsicht1.setEstimatedTime(0);
                GUITaskAnsicht1.setTaskDescription("");
                GUITaskAnsicht1.setVonUser("");
                GUITaskAnsicht1.setTxfTatsaechlicheZeit(0);
            }
        }
        
        
        public void SaveInvoice(){
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
            
            double cost = (worker1.getSalary()/60) * task1.getUsedTime(worker1.getiDWorker());
            String costString = String.valueOf(cost);
            
        String[][] data = {
            { "Worker ID", "First Name", "Name", "E-Mail", "Salary per h", "Position Worker", "Task ID", "Task Creator", "Task Subject", "Task Description", "Estimated time for Task in minutes", "Time used for Task in minutes", "Cost in Euro"},
            { WorkerID, WorkerFirstName, WorkerName, WorkerEmail, WorkerSalary, WorkerPostition, IDTask, TaskCreator, TaskSubect, TaskDescription, TaskEstimatedTime, TaskUsedTime, costString}
            };
            writer1.writeToFile(data);
            
            brain.SendInvoiceMail(task1);
        }
        
        //GUINewTask Funktionszugriffe
        
        //get alle ausgewählte User hintereinander als String
        //evtl String aufspalten? Hier oder wo anders? 
        public String[] getUseres(){
            return GUINewTask1.getUser();
        }
        
        //bekommt den Betreff als String zurück
        public String getSubject(){
            return GUINewTask1.getSubject();
        }
        
        //bekommt die Task Beschreibung als hoffentlich Formatierten String
        public String getDescription(){
            return GUINewTask1.getDescription();
        }
        
         //bekommt den Zeitaufwand in Minuten als Integer
        public int getZeitaufwand(){
            return GUINewTask1.getZeitaufwand();
        }
        
        //setzt die User aus ToUser ins Feld
        
        //well resettet halt New Task komplett
        public void resetNewTask(){
            GUINewTask1.resetUsers();
            GUINewTask1.resetSubject();
            GUINewTask1.resetDescription();
            GUINewTask1.resetZeitaufwand();
        }
        
        //Speichert die neue Task in der 
        //Idk db Stuff fehlt noch?
        public void saveNewTask(){
            String[] user = GUINewTask1.getUser();
            String betreff = GUINewTask1.getSubject();
            String body = GUINewTask1.getDescription();
            int zeit = GUINewTask1.getZeitaufwand();
            brain.Savedraft(user, betreff, body, zeit);
        }
        
        //"Verschickt" die neue Aufgabe
        //Idk db Stuff fehlt noch?
        public void sendTask(){
            int[] iD_User = new int[GUINewTask1.getUser().length];
            Worker worker;
            
            for (int i = 0; i < GUINewTask1.getUser().length; i++) {
                worker = new Worker (GUINewTask1.getUser()[i]);
                
                iD_User[i] =worker.getiDWorker();
            }
            worker = new Worker(username);
            brain.taskAbschicken(GUINewTask1.getZeitaufwand(), GUINewTask1.getSubject(), GUINewTask1.getDescription(), worker.getiDWorker(), iD_User);
        }
        
        
        //GUIToUser Funktionszugriffe
        
        //Setzt alle USer die von der PErson aufgaben bekommen können in eine Liste
        public void setlstAllUsers(String[] sAllUsers){
            GUIToUser1.setlstAllUsers(sAllUsers);
        }
        
        //Setzt alle Selected Users in die andere Liste
        public void setlstSelectedUseres(String[] sSelectedUsers){
            GUIToUser1.setlstSelectedUseres(sSelectedUsers);
        }
        public void setSelectedUsersEmpty(){
            String[] asEmpty = new String[1];
            GUIToUser1.setlstSelectedUseres(asEmpty);
        }
        
        //bekommt alle selected Users als String List
        public String[] getlstAllUseresSelected(){
            return GUIToUser1.getlstAllUseresSelected();
        }
        
        public String getSelectedUserSelected(){
            return GUIToUser1.getSelectedUsersSelected();
        }
        
        public String[] getSelectedUsersAll(){
            return GUIToUser1.getSelectedUsersAll();
        }
        
        //Hier müsste wie auch immer der Selected User removed werden geht aber nicht weil kack listen
        public void deleteOneSelectedUser(){
            String aUserToRemove = this.getSelectedUserSelected();
            String[] aAllUSersSelected = this.getSelectedUsersAll();
            if(aAllUSersSelected.length > 1){
                String[] newAllSelectedUsers = new String[aAllUSersSelected.length-1];
                int f = 0;
                for(int l = 0; l < aAllUSersSelected.length; l++){
                
                if(!aUserToRemove.equals(aAllUSersSelected[l])){
                    newAllSelectedUsers[f] = aAllUSersSelected[l];
                    f++;
                }
            }
            this.setlstSelectedUseres(newAllSelectedUsers);
            }else{
                this.setSelectedUsersEmpty();
            }
            
        }
        
        //setzt die User auf die die man angeklickt hat, weiß noch nicht wie man das macht, das auch die bleiben, welche man davor angeklickt hat.
        public void btnAnFunktion(){
            String[] aSelectedUsers = this.getlstAllUseresSelected();
            String[] aSelectedUsersOriginal = this.getSelectedUsersAll();
            int iList1length = aSelectedUsers.length, iList2length = aSelectedUsersOriginal.length;
            String[] aAllUSersSelected = new String[iList1length+iList2length];
            
            for(int i = 0; i< aSelectedUsersOriginal.length;i++){
                aAllUSersSelected[i] = aSelectedUsersOriginal[i];
            }
            
            //alle neuen User durchgehen
            for(int j = 0; j < aSelectedUsers.length ;j++){
                boolean bdublikat = false;
                //checken ob die noch keine drin waren
                if(aSelectedUsersOriginal != null){
                    //auf duplikate Prüfen
                    for(int k = 0; k < aSelectedUsersOriginal.length;k++){
                        if(aSelectedUsersOriginal[k]==aSelectedUsers[j]){
                            bdublikat = true;
                        }
                    }
                    if(bdublikat == false){
                        aAllUSersSelected[j+aSelectedUsersOriginal.length] = aSelectedUsers[j];
                    }
                }
            }
            this.setlstSelectedUseres(aAllUSersSelected);
        }
        
        //schreibt aus GUIToUser die ausgewählten User in die GUINewTask
        public void IstSelectedUseresIntotxfToUser(){
            GUINewTask1.setUsers(this.getSelectedUsersAll());
        }
        
        public void OpenbenutzerErstellen (){
            if (worker1.getPosition()<2){
                GUIBenutzerErstellen1.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(GUIBenutzerErstellen1, "Du hast nicht die befunisse dies zu tun");
            }
                
        }
        
        public void benutzerErstellen (){
            try {
              int salary = GUIBenutzerErstellen1.getGehalt();
              int position = GUIBenutzerErstellen1.getPosition();
              String email = GUIBenutzerErstellen1.getEmail();
              String name = GUIBenutzerErstellen1.getName();
              String firstName = GUIBenutzerErstellen1.getVorname();
              if (position >= worker1.getPosition()) {
                PasswordGenerator pg = new PasswordGenerator();
                Worker worker = new Worker(salary, position, 0, name, firstName, email, firstName+"."+name, pg.generatePassword(12, true, true, true, true));
                clearBenutzerGUI();
                JOptionPane.showMessageDialog(GUIToUser1, "Your username is: " + worker.getUsername() + " Your Password is: " + worker.getPasswort() + "\nEine Email wurde ihnen zu geschickt.");
                brain.sendAccountMail(worker);
              } else {
                JOptionPane.showMessageDialog(GUIToUser1, "Die Position ist höher als deine eigene");
              }
            } catch (NullPointerException pe) {
              JOptionPane.showMessageDialog(GUIToUser1, "Bitte wähle eine position aus");
            } catch (NumberFormatException ne) {
              JOptionPane.showMessageDialog(GUIToUser1, "Für das Gehalt nur posetive Zahlen eintragen keine Währungszeichen");
}
        }

        public void clearBenutzerGUI (){
            GUIBenutzerErstellen1.setGehalt(-1);
            GUIBenutzerErstellen1.setEmail("");
            GUIBenutzerErstellen1.setName("");
            GUIBenutzerErstellen1.setVorname("");
            GUIBenutzerErstellen1.setPosition(-1);
        }
        
        public void abbrechenBenutzer(){
            GUITaskAnsicht1.setVisible(true);
            GUIBenutzerErstellen1.setVisible(false);
        }
        
        
        
            public void taskAnlegen() throws NumberFormatException{
            if ("".equals(GUINewTask1.getSubject())) {
                throw new NumberFormatException();
            }
            String[] recipient  = GUINewTask1.getUser();
            List<Worker> workerlist = new ArrayList<>();
            List<Integer> indicesToRemove = new ArrayList<>();
            for (int i = 0; i < recipient.length; i++) {
              workerlist.add(new Worker(recipient[i]));
              if (workerlist.get(i).getPosition() < worker1.getPosition()) {
                JOptionPane.showMessageDialog(GUIToUser1, "Du kannst nicht " + workerlist.get(i).getUsername() + " eine Aufgabe stellen.");
                indicesToRemove.add(i);
              }
            }

            Collections.sort(indicesToRemove, Collections.reverseOrder());
            for (int index : indicesToRemove) {
              workerlist.remove(index);
            }

            if (!workerlist.isEmpty()) {
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
            } else {
            JOptionPane.showMessageDialog(GUIToUser1, "Es wurden keine Arbeiter eingetragen");
            }
        } 

        
        public void loadDraft(){
            Draft draft = brain.getdraft();
            if(!(draft.getEmpfaenger() == null || draft.getBetreff()==null || draft.getBody()==null)){
                GUINewTask1.setUsers(draft.getEmpfaenger());
                GUINewTask1.setZeitaufwand(draft.getZeit());
                GUINewTask1.setSubject(draft.getBetreff());
                GUINewTask1.setDescription(draft.getBody());
            }
        }
        
        public void setlstAllUsers(){
            GUIToUser1.setlstAllUsers(brain.getallUsers());
        }

}
