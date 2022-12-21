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
        
        //Überprüfen aus der db ob Login Daten richtig sind und boolean an GUILogin btnLogin geben
        public boolean dbLoginCheck(){
            boolean bLoginRichtig = false;
            
            //hier muss auf ControlDB zugegriffen werden
            
            return bLoginRichtig;
        }
        
        
        
}
