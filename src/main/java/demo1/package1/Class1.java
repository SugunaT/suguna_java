package demo1.package1;

public class Class1
        //private
{
    private String privateVar = "i am private variable";
    public String publicVar = "i am public variable";
    protected String protectedVar = "i am protected variable";
    String defaultVar = "i am default variable";


    public static void main(String[] args) {
        Class1 obj = new Class1();
        System.out.println(obj.privateVar);
        System.out.println(obj.publicVar);
        System.out.println(obj.protectedVar);
        System.out.println(obj.defaultVar);
    }
}

