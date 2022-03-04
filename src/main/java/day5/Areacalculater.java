package day5;

import java.util.Scanner;

public class Areacalculater {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Areacalculater areacalculater = new Areacalculater();

        System.out.println("choose the type of object to find area");

        System.out.println("\t1 . Rectangle");
        System.out.println("\t2 . square");
        System.out.println("\t3 . triangle");
        System.out.println("\t4 . circle");

        int option = scan.nextInt();
        if (option == 1) ;

        {

            System.out.println("enter the dimensions of the rectangle");
            int width = scan.nextInt();
            int length = scan.nextInt();
            double area = length * width;

            System.out.println("the area of the rectangle is " + area);

            areacalculater.getDimension(length, width);


        }

        if (option == 2) ;
        {
            System.out.println("enter the dimensions of the square");

            int side1 = scan.nextInt();
            int side2 = scan.nextInt();
            double area = side1 * side2;
            System.out.println("the area of the square is " + area);

            areacalculater.getDimension(side1);
        }

        if (option == 3) ;
        {

            System.out.println("Enter the dimensions of the triangle");

            int base = scan.nextInt();
            int height = scan.nextInt();
            double area = (0.5 * base * height);
            System.out.println(("The area of the triangle is " + area));
        }

        if (option == 4) {
            System.out.println("Enter the dimensions of the circle");
            double PI = 3.51;
            int radius = scan.nextInt();
            double area = PI * radius * radius;
            System.out.println("The area of the circle is " + area);
        }

        //creating overload method
    }

    public void getDimension(int length, int width) {
        double area = length * width;

        System.out.println("inside method - calculated rectangle is " + area);
    }

    public void getDimension(int side) {
        double area = side * side;
        System.out.println("Inside method - calculate square is " + area);
    }

    public void getdimension(int base, int height) {

        {
            double area = base * height;
            System.out.println("Inside method - calculate triangle is " + area);
        }
    }
}