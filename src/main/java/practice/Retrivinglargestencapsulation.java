package practice;

public class Retrivinglargestencapsulation
{
    public static void main(String[] args)
    {
        LargestNoencapsulation obj =new LargestNoencapsulation();
        obj.setA(100);
        obj.setB(50);
        obj.setC(200);
        //obj.getA();
        //obj.getB();
        //obj.getC();

        String val =obj.checklargestNo(obj.getA() ,obj.getB() , obj.getC());

        System.out.println(val);
    }
}
