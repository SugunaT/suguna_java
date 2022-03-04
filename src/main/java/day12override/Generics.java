package day12override;

public class Generics <T>
{
    T printer;
    Generics(T printer)
    {
        this.printer =printer;

    }
     public void printvallue()
     {
         System.out.println(printer);
     }
}
