package com.mycompany.raptortodo;

public class RaptorToDo {
        //Hier bitte nur die Objekte von Control Klassen deklarieren
        static private ControlGUI ControlGUI1;
        
        public static void main(String[] args) throws Exception {
            //Hier die Controleinheiten erstellen
            ControlGUI1 = new ControlGUI();
            CSVReader reader = new CSVReader();
            CSVWriter writer = new CSVWriter();
//            new GMailer().sendMail("Sie bekomme eine neue Aufgabe", """
//                username,
//                                
//                Task 1 gehoert ihnen
//                                
//                Best regards,
//                myself
//                """);
//            
           // writer.writeToFile(data);
            reader.readFile("data.csv");
        }
}