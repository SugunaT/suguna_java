package day2;

public class initializevariables {

    //instance variable
    int a;
    String b;


    //creating the parametrized constructor
    initializevariables(int x, String y) {
        this.a = x;
        this.b = y;
    }

    public static void main(String[] args) {

        initializevariables obj = new initializevariables(10, "day2");
        System.out.println(obj.a);
        System.out.println(obj.b);


    }
}