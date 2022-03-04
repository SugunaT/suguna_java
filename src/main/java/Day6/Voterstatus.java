package Day6;

public class Voterstatus {

    public static void main(String[] args) {


        int a = 18;
        int b = 15;

        if (a >= 18) {
            System.out.println("elgible for vote");

        }
        if (a >= 15) {
            System.out.println("not elgible for vote");
        }//

        else if (a > 15 && b < 18) {
            System.out.println("elgible for vote");
        } else {
            System.out.println("not eligible for vote");
        }
    }

}

