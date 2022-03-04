package day3;

public class Variables2 {


    // creating instance variables

    private int a = 20;
    int b = 30;
    public String name = "ganga";
    protected boolean working = true;

    private static int c = 40;

    public static void main(String[] args) {
        Variables2 obj1 = new Variables2();
        obj1.printMethod();
        System.out.println("Inside main method: " + c);
    }

    public void printMethod() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);
        System.out.println(working);
        System.out.println("Inside printMethod: " + c);
    }


}
