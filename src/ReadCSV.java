import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
    public static void main(String[] args) {
    try {
      BufferedReader reader;
      reader = new BufferedReader(new FileReader("Test.csv"));

      String line;
      while ((line = reader.readLine()) != null) {
        String[] values = line.split(",");
        for (String value : values) {
          System.out.print(value + "\t");
        }
        System.out.println();
      }

      reader.close();
    } catch (IOException e) {
      // handle exception
    }
  }
}
   

