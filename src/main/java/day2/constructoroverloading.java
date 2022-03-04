package day2;

public class constructoroverloading {
    //creating the instancevariable

    int a = 50;
    int b = 100;
    int c = 150;
    String d = "hey";

    //creating the zero constructor

    constructoroverloading() {
        System.out.println("it is zero constructor");
    }

    //creating one parameter constructor

    constructoroverloading(int a) {
        System.out.println(a);
    }

    //creating two parameter constructor

    constructoroverloading(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }
    //creating three parameter constructor

    constructoroverloading(int a, int b, int c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    //creating four parameter constructor

    constructoroverloading(int a, int b, int c, int d) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


    }

    public static void main(String[] args) {


        constructoroverloading obj1 = new constructoroverloading(9);
        constructoroverloading obj2 = new constructoroverloading(1, 5);
        constructoroverloading obj3 = new constructoroverloading(10, 5, 3);
        constructoroverloading obj4 = new constructoroverloading(3, 4, 6, 7);
        constructoroverloading obj = new constructoroverloading();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }


}

