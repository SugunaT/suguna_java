package demo1.package2;

import demo1.package1.Class1;
import demo1.package1.Class2;

//public
public class Class3 {

    public static void main(String args[]) {
        Class3 obj = new Class3();
        obj.method();
    }

    public void method() {
        Class1 obj = new Class1();
        //System.out.println(obj.privateVar); //it is not accessible in this class
        System.out.println(obj.publicVar);
        // System.out.println(obj.protectedVar);//it is not accessible outside package
        //  System.out.println(obj.defaultVar); //it is not accessible outside package

    }
}
