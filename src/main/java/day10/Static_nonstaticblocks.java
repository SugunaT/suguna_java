package day10;


public class Static_nonstaticblocks {
    int a;
    static int b;

    //creating constructor

   /* this.a =a;

    {
        System.out.println(a);
    }*/

    // creating comnstructor
    Static_nonstaticblocks() {
        System.out.println("I am  constructor");
    }

    //creating nonstatic ()
    public void method1() {

        System.out.println(" i am nonstatic block");

        a = 5;
        // creating onemore nonstatic block

        {
            System.out.println("i am in nonstatic block");
        }
        a = 10;
    }

    //creating static block
    static {
        System.out.println("i am static block");
    }


    public static void main(String[] args) {
        System.out.println("hi all");

        Static_nonstaticblocks obj1 = new Static_nonstaticblocks();
        obj1.method1();
    }
}
