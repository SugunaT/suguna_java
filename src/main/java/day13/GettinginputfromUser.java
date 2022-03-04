package day13;


import java.util.Scanner;
public class GettinginputfromUser
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String firstname;
        String lastname;
        int age;
        double weight;
        String name;
        System.out.println("please enter your first name");
        firstname = input.nextLine();

        System.out.println("please enter your last name");
        lastname = input.nextLine();


        System.out.println("please enter your age");
        age = input.nextInt();
        while(age>1) ;

        {
            System.out.println("please enter valid age ");


            age = input.nextInt();}

        System.out.println("please enter your weight");

        weight = input.nextDouble();
        while(weight>40.5)
        {
            System.out.println("please enter correct weight");
            weight = input.nextDouble();

        }
    }



}
