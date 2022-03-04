package practice;

public class Returning_nonreturningvalues {
    public void Nonreturning() {

        System.out.println("Nonreturning value");

    }

    public String concat(String a, String b) {
        return a + b;

    }

    public static void main(String args[]) {
        Returning_nonreturningvalues obj = new Returning_nonreturningvalues();

        obj.Nonreturning();

        System.out.println(obj.concat("  suguna  ", "  bolikonda  "));
    }
}