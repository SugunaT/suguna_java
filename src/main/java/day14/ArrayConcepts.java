package day14;

public class ArrayConcepts
{
    public static void main(String[] args)
    {
      // creating array of 6 numbers
       int [] arr = new int [6];
       arr[0] =1;
        arr[1] =2;
        arr[2] =3;
        arr[3] =4;
        arr[4] =5;
        arr[5] =6;

         /*// size of the array
          int arrsize = arr.length;

          for (int i = 0 ;i<arrsize ;i++)
          {
            System.out.println(arr[i]);}*/

           for(int a :arr)
           {
               System.out.println(a);

        }
    }
}
