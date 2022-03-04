package fileIO;

import java.io.*;

public class Filehandling1 {
    public static void  main (String []args) {

        //writing to the existing file
        try {
            BufferedReader bufferedreader = new BufferedReader (new FileReader("src/main/resources/FileRead_Write.text"));
            BufferedReader reader = null;
            {
                //String line
                String line;
                while ((line = reader.readLine()) != null)
                    System.out.println(reader.readLine());

                reader.close();
            }
        }
             catch(IOException e){

            e.printStackTrace();
             }
    }
    }