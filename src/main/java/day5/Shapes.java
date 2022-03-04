package day5;

import java.util.Scanner;

public class Shapes {
    public static void main(String[] args) {
        // To do auto-generated method stub
        //calculate the area of the rectangle

        System.out.println("this program calculate the area of rectangle");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the width of the rectangle");
        System.out.println("Enter the length of the rectangle");

        int width = sc.nextInt();
        int length = sc.nextInt();

        int area = width * length;

        // System.out.println("this is our first program");
        //System.out.println("printing Hello every one ");


        // int width =10;
        // int length =20;


        System.out.println(("The width of rectangle is " + args[0]));
        System.out.println(("The length of rectangle is " + args[1]));

        // int width = Integer.parseInt(args[0]);
        // int length = Integer.parseInt(args[1]);


        // int area =width*length;

        System.out.println("The area of rectangle is " + area);


    }

}
