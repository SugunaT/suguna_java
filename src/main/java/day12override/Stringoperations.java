package day12override;

public class Stringoperations
{
    public static void main(String[] args)
    {
      String val= " This is batch 3 Team A ";

      // To find the length of the string

        System.out.println(val . length());

        //To remove the spaces of the string from beginning to ending

        String removedspaces = val.trim();

        System.out.println(val);

        System.out.println("This is batch 3 Team A");

        //To convert to lower case letters

        System.out.println(val.toLowerCase());

        //To convert to uppercase letters

        System.out.println(val.toUpperCase());

        //To retrive part of string value

        String subval=val.substring(0 , 15);

        System.out.println(subval);
        //to replace a string portion
         String replacedString =val.replace("java"  , "c#");
        System.out.println(replacedString);

        //To check whether String contains
        System.out.println(val.contains("java"));

        //To check the position of java
        System.out.println(val.lastIndexOf("j"));

        //To check whether it is empty
        System.out.println(val.isEmpty());

        System.out.println(val.concat(val));




    }
}
