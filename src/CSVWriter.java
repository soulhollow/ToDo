import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter {
 public static void main(String[] args) {
    String[][] data = {
      {"John", "Smith", "34"},
      {"Jane", "Doe", "28"},
      {"Bob", "Johnson", "42"}
    };

    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter("Test.csv"));

      for (String[] row : data) {
        String rowString = String.join(",", row);
        writer.write(rowString);
        writer.newLine();
      }

      writer.close();
    } catch (IOException e) {
      // handle exception
    }
  }
}

