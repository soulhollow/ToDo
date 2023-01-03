

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter {
  public void writeToFile(String[][] data) {
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter("Invoice.csv"));

      for (String[] row : data) {
        String[] quotedValues = new String[row.length];
        for (int i = 0; i < row.length; i++) {
          quotedValues[i] = "\"" + row[i] + "\"";  // enclose value in quotes if it contains a comma
        }
        String rowString = String.join(",", quotedValues);
        writer.write(rowString);
        writer.newLine();
      }

      writer.close();
    } catch (IOException e) {
      // handle exception
    }
  }
}




// ID ,Name, First Name, Salary/h, Postion, E-Mail, "" , TaskID, TaskSubject, EstimatedTime, Cost -> (Salary/60)*EstimatedTime