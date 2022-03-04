package day14;

import java.util.ArrayList;

public class ArraylistConcepts
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        for (int a: arrayList)
        {
            System.out.println(a);
        }

        //java 8 concepts

        arrayList.forEach(a-> System.out.println(a));

        // To retrive first element
        System.out.println(arrayList.get(0));

        //To leanth of the array list
        System.out.println(arrayList.size());

        //Before update
        System.out.println("Before update:" +arrayList);

        //To update the element
        arrayList.set(3,500);

        //After update
        System.out.println("After update:"+arrayList);

        // to remove the element
        arrayList.remove(3);
        System.out.println("After removal:"+arrayList);

    }
}
