package fileIO;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;


public class Readingexcel
{
      public static void main(String[] args) throws FilloException {

            Fillo fillo =new Fillo();
            Connection connection = fillo.getConnection("src/main/resources/Exelfilehandling.csv");

            String strquery="select * from Excelfilehandling";
            Recordset recordset= connection.executeQuery(strquery);

            while (recordset.next())
            {
                System.out.println(recordset.getField("TestcaseID"));
                System.out.println(recordset.getField("Result"));

            }
        }
    }

