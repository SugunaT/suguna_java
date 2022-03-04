package demo1.package1;

public class Class2

//default
{

    public static void main(String args[]) {
        Class2 obj = new Class2();
        obj.method();
    }

    public void method() {
        Class1 obj = new Class1();
        //System.out.println(obj.privateVar); //it is not accessible in this class
        System.out.println(obj.publicVar);
        System.out.println(obj.protectedVar);
        System.out.println(obj.defaultVar);
    }
}
