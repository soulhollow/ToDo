package com.mycompany.raptortodo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
  public void readFile(String filePath) {
    BufferedReader reader = null;
    String line = "";

    try {
      reader = new BufferedReader(new FileReader(filePath));
      while((line = reader.readLine()) != null) {
        String[] row = line.split(",");
        // String[] row = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)"); 
        // use this if your values already contain commas
        for(String index : row) {
          System.out.printf("%-10s", index);
        }
        System.out.println();
      }
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
      try {
        reader.close();
      } catch (IOException e) {
        // handle exception
      }
    }
  }
}
