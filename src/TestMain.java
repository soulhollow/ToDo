package projektuitest;

//import UILogin.java;

public class TestMain {
    public static void main(String[] args) {
        //Kreirt die Oberflächen sollte im Main Konstruktor stehen oder darunter.
        GUILogin GUILogin1 = new GUILogin();
        GUITaskAnsicht GUITaskAnsicht1 = new GUITaskAnsicht();
        GUINewTask GUINewTask1 = new GUINewTask();
        GUIToUser GUIToSubject1 = new GUIToUser();
        
        //Login Screen Test:
        //muss im Programm irgendwo ganz weit oben stehen.
        GUILogin1.setVisible(true);
        
        //Task Ansicht Test:
        //sollte nach dem Login Automatisch gestartet werden
        GUITaskAnsicht1.setVisible(true);
        
        
        //NewTask Test:
        //sollte mit dem Button Neue Aufgabe visible gemacht werden.
        GUINewTask1.setVisible(true);
        
        //GUIToSubject Test:
        //Sollte geöffnet werden beim klicken auf "" in "GUINewTask"
        GUIToSubject1.setVisible(true);
    }
    
}
