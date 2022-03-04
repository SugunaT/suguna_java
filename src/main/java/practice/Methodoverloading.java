package practice;

public class Methodoverloading {
    // declarig the instance variables
    int a;
    int b;
    String c;

    public static void main(String[] args) {

    }

    Methodoverloading() {
        System.out.println("this is zero parameter");

    }

    Methodoverloading(int a) {
        this.c = c;

        System.out.println("this is a single parameter");
    }

    Methodoverloading(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    Methodoverloading(int a, int b, String c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    Methodoverloading OBJ = new Methodoverloading();
    Methodoverloading OBJ1 = new Methodoverloading(10);
    Methodoverloading OBJ2 = new Methodoverloading(20, 30, "hi");
    Methodoverloading OBJ3 = new Methodoverloading();

    {
        System.out.println(OBJ.a);
        System.out.println(OBJ1.b);
        System.out.println(OBJ2.c);
        System.out.println(OBJ3.a);
    }
}


