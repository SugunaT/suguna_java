package day3;

public class SamePackageClass {

    public static void main(String args[]) {
        Variables2 obj1 = new Variables2();
        System.out.println("calling public varaible from other Class: " + obj1.name);

        // System.out.println("calling private varaible from other Class: "+obj1.a);

        System.out.println("calling default varaible from other Class: " + obj1.b);

        System.out.println("calling protected varaible from other Class: " + obj1.working);
    }

    public static class DifferentPackageClass {

        public static void main(String args[]) {
            Variables2 obj1 = new Variables2();
            System.out.println("calling public varaible from other Class: " + obj1.name);

            // System.out.println("calling default varaible from other Class: "+obj1.b);

            // System.out.println("calling protected varaible from other Class: "+obj1.working);
        }


    }
}
