package day5;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        //area = length * width
        //perimeter = 2 * (length+width)

        Scanner scanner = new Scanner(System.in);

        int length = 0;
        int width = 0;
        int area = 0;
        int perimeter = 0;

        System.out.println(("enter the length of rectangle"));
        length = scanner.nextInt();

        System.out.println("enter the width of rectangle");
        width = scanner.nextInt();

        area = length * width;
        perimeter = 2 * (length + width);

        System.out.println("the area of rectangle is : " + area);
        System.out.println("the perimeter of rectangle is :" + perimeter);


    }

}

