package fileIO;

import jdk.nashorn.internal.objects.NativeError;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) {

            //writing to the existing file
            try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/FileRead_Write.text"));
            bufferedWriter.write("Hello Batch 3");
            bufferedWriter.write("\nselinium webdriver");
            bufferedWriter.write("\nwe r learning automation stuff");
            bufferedWriter.write("\nwe are total 46 students in class");
            bufferedWriter.close();

            BufferedReader bufferedreader = new BufferedReader (new FileReader("src/main/resources/FileRead_Write.text"));
            //String line
            String line;
             while ((line = bufferedreader.readLine()) != null)
             {
                        System.out.println(line);
                }
                bufferedreader.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
         catch (Exception ex)
         {
            ex.printStackTrace();
         }

    }
}