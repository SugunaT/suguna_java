package practice;

public class Variables {


    //instance variables
    int a = 10;
    String name = "suguna";
    boolean correct_name = true;


    public void method() {
        //local variables
        float b = 5;

        char one_char = 'b';

        System.out.println(b);
        System.out.println(one_char);
    }
    //static variables

    static int c = 10;

    public static void main(String args[]) {
        Variables obj = new Variables();

        obj.method();

        System.out.println(obj.a);
        System.out.println(obj.name);
        System.out.println("correct_name");
        System.out.println(c);
    }

}
