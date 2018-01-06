package com.example.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by I M O H on 6/26/2016.
 */
public class Main {
    public static void main(String[] args){
 String sourceFile = "files/akum ukom.txt";
 String targetFile = "files/target.txt";

      try(
              FileReader fReader = new FileReader(sourceFile);
              BufferedReader bReader =  new BufferedReader(fReader);
              FileWriter  writer = new FileWriter(targetFile);


              ) {
          while (true){
              String line = bReader.readLine();
              if (line == null){
                  break;
              } else {
                  writer.write(line + "\n");
              }
          }
          System.out.println("File copied! ");
      }catch (Exception e){
        e.printStackTrace();
      }

    }

}


