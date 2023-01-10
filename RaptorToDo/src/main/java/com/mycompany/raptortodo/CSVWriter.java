package com.mycompany.raptortodo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter {

    public void writeToFile( String[][] data ) {
        try {
            try ( BufferedWriter writer = new BufferedWriter(new FileWriter("Invoice.csv"))) {
                for (String[] row : data) {
                    String[] quotedValues = new String[row.length];
                    for (int i = 0; i < row.length; i ++) {
                        if (row[i].contains(" ")) {
                            quotedValues[i] = "\"" + row[i] + "\"";  // enclose value in quotes if it contains a comma
                        }else {
                            quotedValues[i] = row[i];
                        }
                    }
                    String rowString = String.join(",", quotedValues);
                    writer.write(rowString);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            // handle exception
        }
    }
}
