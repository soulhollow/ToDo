//import java.util.List;
//import java.util.ArrayList;
//import java.util.Collection;

public class ControlGUI {
    
    //Deklarieren von Variablen
    private GUITaskAnsicht GUITaskAnsicht1;
    private GUINewTask GUINewTask1;
    private GUIToUser GUIToUser1;
    private GUILogin GUILogin1;
    
    private String Username;
    private String Password;
    
    
    
    public ControlGUI(){
        
        //Erstellt die Login-Oberflächen
        GUILogin1 = new GUILogin(this);
        
        //macht den Login Screen Sichtbar:
        GUILogin1.setVisible(true);
        
        //Erstellt alle anderen GUI Elemente
        GUITaskAnsicht1 = new GUITaskAnsicht(this);
        GUINewTask1 = new GUINewTask(this);
        GUIToUser1 = new GUIToUser(this);
        
        //macht alle anderen GUIElemente Standartmäßig Unsichtbar
        GUITaskAnsicht1.setVisible(false);
        GUINewTask1.setVisible(false);
        GUIToUser1.setVisible(false);
        
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
        }
        
        
        //GUILogin Funktionzugriffe
        
        //Überprüfen aus der db ob Login Daten richtig sind und boolean an GUILogin btnLogin geben
        public boolean dbLoginCheck(){
            boolean bLoginRichtig = false;
            String User = GUILogin1.getUser();
            String Password = GUILogin1.getPassword();
            
            //hier muss auf ControlDB zugegriffen werden
            //Ins if muss rein ob User und Password ZUSAMMEN bei einem Account richtig sind
            int ieins = 1;
            if(1 == ieins){
                bLoginRichtig = true;
            }
            return bLoginRichtig;
        }
        
        public void loginLoginBtn(){
            //Wenn Passwort richtig dann wird GUITaskAnsicht sichtbar gemacht und GUILogin unsichtbar
            boolean bPwRichtig = false;
            bPwRichtig = this.dbLoginCheck();
        
        if(bPwRichtig==true){
            this.setTaskAnsichtVisible();
            this.setGUILoginInvisible();
        }else{
            //Evtl. Fehlermeldung am Bildischirm Ausgeben das Password oder USername falsch ist
            GUILogin1.resetUser();
            GUILogin1.resetPassword();
            }
        
        }
        // GUITaskansicht Funktionzugriffe
        public void setVonUser(String sUser) {
            GUITaskAnsicht1.setVonUser(sUser);
        }
        
        public void setEstimatedTime(int iEstimatedTime){
            GUITaskAnsicht1.setEstimatedTime(iEstimatedTime);
        }
        
        //String[] muss durch Listentyp ersetzt werden
        public void setlstAllTasks(String[] listData){
            GUITaskAnsicht1.setlstAllTasks(listData);
        }
        
        //fehlerbehandlung muss noch gemacht werden momentan ist einfach Zeit -1 gesetzt
        public int getBearbeitungszeit(){
            return GUITaskAnsicht1.getBearbeitungszeit();
        }
        
        //String muss schon Formatiert sein mit Zeilenumbrüchen
        public void setTaskDescription(String sTaskDescription){
            GUITaskAnsicht1.setTaskDescription(sTaskDescription);
        }
        
        //refresht die Aufgaben die Angezeigt werden
        public void btnMyTaskRefresh(){
            
        }
        
        //bekommt aus der db die Information zu der Task und setzt sie entsprechend
        //das db zeugs muss noch geadded werden
        public void showTaskBtn(){
            
            
        }
        // öffnet ebenfalls ein GUINewTask Fenster allerdings mit der Ausgewählten Task bereits drin und An ist die Person welche die Aufgabe gestellt hat
        public void openNewTaskbtnQuestion(){
            String sUser, sTaskDescription;
            int iEstimatedTime;
            
            //Hier das db Funktion schreiben
            sUser = "";
            sTaskDescription = "";
            iEstimatedTime = -1;
            
            this.setVonUser(sUser);
            this.setEstimatedTime(iEstimatedTime);
            this.setTaskDescription(sTaskDescription);
        }
        
        //Idk wie man das mit dem User macht, hier wird er auf jedenfall ausgeloggt
        public void logoutBtnTaskAnsicht(){
            
        }
        
        //Momentan offene Aufgabe wird abgegeben
        public void taskFinisBtnTaskAnsicht(){
            
        }
        
        //GUINewTask Funktionszugriffe
        
        //get alle ausgewählte User hintereinander als String
        //evtl String aufspalten? Hier oder wo anders? 
        public String getUseres(){
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
        public void setUseres(String[] Users){
            String sUsers = "";
            for(int i = 0; Users.length >= i;i++){
                sUsers = sUsers + Users[i] + " ";
            }
            GUINewTask1.setUsers(sUsers);
        }
        
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
            
        }
        
        //"Verschickt" die neue Aufgabe
        //Idk db Stuff fehlt noch?
        public void sendTask(){
            
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
        
        
        public void uebernehmeSelectedUserNachNewTask(){
            String[] SelectedUseres = this.getlstSelectedUseres();
            this.setUseres(SelectedUseres);
        }
        
}
