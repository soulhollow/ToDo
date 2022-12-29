package com.mycompany.raptortodo;

//import java.util.List;

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
    
    private String username;
    private String password;
    private Brain brain;
    Worker worker1;
    Task[] tasklist;
    
    
    
    public ControlGUI(){
        
        //Erstellt die Login-Oberflächen
        GUILogin1 = new GUILogin(this);
        
        //macht den Login Screen Sichtbar:
        GUILogin1.setVisible(true);
        
        //Erstellt alle anderen GUI Elemente
        GUITaskAnsicht1 = new GUITaskAnsicht(this);
        GUINewTask1 = new GUINewTask(this);
        GUIToUser1 = new GUIToUser(this);
        GUIBenutzerErstellen1 = new GUIBenutzerErstellen(this);
        
        //macht alle anderen GUIElemente Standartmäßig Unsichtbar
        GUITaskAnsicht1.setVisible(false);
        GUINewTask1.setVisible(false);
        GUIToUser1.setVisible(false);
        GUIBenutzerErstellen1.setVisible(false);
        this.brain = new Brain();
    }

        //setter um die verschiedene GUI Elemente sichtbar/unsichtbar zu schalten
        public void setTaskAnsichtVisible (){
             GUITaskAnsicht1.setVisible(true);
        }
        public void setTaskAnsichtInvisible(){
            GUITaskAnsicht1.setVisible(false);
        }
        
        public void setGUILoginVisible(){
            GUILogin1.setVisible(true);
        }
        public void setGUILoginInvisible(){
            GUILogin1.setVisible(false);
        }
        
        public void setGUINewTaskVisible(){
            GUINewTask1.setVisible(true);
            Draft draft = brain.getdraft();
            if(!(draft.getEmpfaenger() == null || draft.getBetreff()==null || draft.getBody()==null)){
                System.out.println(draft.getEmpfaenger());
                GUINewTask1.setUsers(draft.getEmpfaenger());
                GUINewTask1.setZeitaufwand(draft.getZeit());
                GUINewTask1.setSubject(draft.getBetreff());
                GUINewTask1.setDescription(draft.getBody());
            }
        }
        public void setGUINewTaskInvisible(){
            GUINewTask1.setVisible(false);
        }
        
        public void setGUIToUserVisible(){
            GUIToUser1.setVisible(true);
        }
        public void setGUIToUserInvisible(){
            GUIToUser1.setVisible(false);
        }
        
        
        //funktion zum schließen des Programms
        public void exitProgramm(){
            System.exit(0);
            DB_Connection dB_Connection = new DB_Connection();
            dB_Connection.close();
        }
        
        
        //GUILogin Funktionzugriffe
        
        //Überprüfen aus der db ob Login Daten richtig sind und boolean an GUILogin btnLogin geben
        
        public void loginLoginBtn(){
            username = GUILogin1.getUser();
            password = GUILogin1.getPassword();
            if(brain.checkKey(username, password)){
                this.setTaskAnsichtVisible();
                this.setGUILoginInvisible();
                worker1 = new Worker(username);
            }
            else{
                GUILogin1.resetUser();
                GUILogin1.resetPassword();
            }
            
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
            int iID = this.worker1.getiDWorker();
            GUITaskAnsicht1.setlstAllTasks(brain.getallTasktags(iID));
        }
        
        public void setlstAllTasksEmpty(){
            //Erstellt halt nen String Array was genau nulol groß ist. Kp ob das Sinnig ist aber es funktioniert hoffentlich.
            String[] sListData;
            sListData = new String[0];
            GUITaskAnsicht1.setlstAllTasks(sListData);
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
            Task shownTask;
            Worker wCreator;
            iWhichTask = GUITaskAnsicht1.getListAllTasksSelection();
            shownTask = brain.getTask(iWhichTask);
            
            iIDWorker = shownTask.getCreator();
            wCreator = brain.getWorker(iIDWorker);
            sUser = wCreator.getName()+" "+wCreator.getFirstName();
            sTaskDescription = shownTask.getTaskSubject();
            iEstimatedTime = shownTask.getEstimatedTime();
            
            GUITaskAnsicht1.setEstimatedTime(iEstimatedTime);
            GUITaskAnsicht1.setTaskDescription(sTaskDescription);
            GUITaskAnsicht1.setVonUser(sUser);
        }
        
        //öffnet New Task nur das schon vorausgefüllt die Task drin steht. Der Creator wird zum Empfänger hinzugefügt
        public void taskBearbeitenBtn(){
            //das ist fast eine Copie von eins drüber Idk ob man das zusammenfassen will.
            int iWhichTask, iEstimatedTime, iIDWorker;
            String sTaskDescription, sUser, sTaskTag;
            Task shownTask;
            Worker wCreator;
            iWhichTask = GUITaskAnsicht1.getListAllTasksSelection();
            shownTask = brain.getTask(iWhichTask);
            
            iIDWorker = shownTask.getCreator();
            wCreator = brain.getWorker(iIDWorker);
            sUser = wCreator.getName()+" "+wCreator.getFirstName();
            sTaskDescription = shownTask.getTaskSubject();
            iEstimatedTime = shownTask.getEstimatedTime();
            sTaskTag = shownTask.getTaskTag();
            
            //Ab hier ist es signifikant anders
            this.resetNewTask();
            this.setGUINewTaskVisible();
            GUINewTask1.setDescription(sTaskDescription);
            GUINewTask1.setSubject(sTaskTag);
            GUINewTask1.setZeitaufwand(iEstimatedTime);
           
            //Das ToUser Feld muss noch gefüllt werden mit einem String[] an Personen + dem Creator
            
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
            
        }
        
        
        //GUINewTask Funktionszugriffe
        
        //get alle ausgewählte User hintereinander als String
        //evtl String aufspalten? Hier oder wo anders? 
        public String[] getUseres(){
            return GUINewTask1.getUseres();
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
            String[] user = GUINewTask1.getUseres();
            String betreff = GUINewTask1.getSubject();
            String body = GUINewTask1.getDescription();
            int zeit = GUINewTask1.getZeitaufwand();
            brain.Savedraft(user, betreff, body, zeit);
        }
        
        //"Verschickt" die neue Aufgabe
        //Idk db Stuff fehlt noch?
        public void sendTask(){
            int[] iD_User = new int[GUINewTask1.getUseres().length];
            Worker worker;
            
            for (int i = 0; i < GUINewTask1.getUseres().length; i++) {
                worker = new Worker (GUINewTask1.getUseres()[i]);
                
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
        
        //bekommt alle selected Users als String List
        public String[] getlstSelectedUseres(){
            return GUIToUser1.getlstSelectedUseres();
        }
        
        
        public int getSelectedUserIndex(){
            return GUIToUser1.getSelectedUserIndex();
        }
        
        //Hier müsste wie auch immer der Selected User removed werden geht aber nicht weil kack listen
        public void deleteOneSelectedUser(){
            //int iIndex = this.getSelectedUserIndex();
            //ArrayList<String> sAllSelectedUsers = new ArrayList<>();
            //this.getlstSelectedUseres();
            //sAllSelectedUsers.addAll(cAllSelectedUsers);
            //sAllSelectedUsers.remove(iIndex);
        }
        
        //setzt die User auf die die man angeklickt hat, weiß noch nicht wie man das macht, das auch die bleiben, welche man davor angeklickt hat.
        public void btnAnFunktion(){
            String[] sSelectedUseres = this.getlstSelectedUseres();
            this.setlstSelectedUseres(sSelectedUseres);
        }
        
        public void OpenbenutzerErstellen (){
            if (worker1.getPosition()<2){
                GUIBenutzerErstellen1.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(GUIBenutzerErstellen1, "Du hast nicht die befunisse dies zu tun");
            }
                
        }
        
        public void benutzerErstellen (){
            int salary = GUIBenutzerErstellen1.getGehalt();
            int position = GUIBenutzerErstellen1.getPosition();
            String email = GUIBenutzerErstellen1.getEmail();
            String name = GUIBenutzerErstellen1.getName();
            String firstName = GUIBenutzerErstellen1.getVorname();
            Worker worker = new Worker(salary, position, 0, name, firstName, email, firstName+"."+name, "123");
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
}
