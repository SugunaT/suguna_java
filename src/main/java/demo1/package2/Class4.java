package demo1.package2;

import demo1.package1.Class1;

//protected

public class Class4 extends Class1 {

    public static void main(String args[]) {
        Class4 obj = new Class4();
        // System.out.println(obj.privateVar); //it is not accessible in this class
        System.out.println(obj.publicVar);
        System.out.println(obj.protectedVar);
        //System.out.println(obj.defaultVar); //it is not accessible outside package
    }


}
