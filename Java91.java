// Day : 91 Java ArrayList Demo + Methods

import java.util.*;

public class Java91
{
    public static void main(String[] args)
    {
        ArrayList<Integer>  l1 = new ArrayList<>(); // It is a Syntax of Generics.
        l1.add(10);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);
        l1.add(10);

        // add 5 at index 0
        l1.add(0,5);
        l1.add(0,1);

        l1.set(4,566);

        System.out.println("Print the Demo ArrayLiat : ");
        for(int i = 0; i < l1.size(); i++)
        {
            System.out.print(" " + l1.get(i));
        }

        System.out.println();
        System.out.println();

        // If it exist in lq then contain return true otherwise return false
        System.out.println("18 is exist or not in l1 array : " + l1.contains(18));
        System.out.println("9 is exixt or not in l1 array : " + l1.contains(9));

        System.out.println();
        System.out.println();

        System.out.println("Index on 8 element : " + l1.indexOf(8)); // Check from starting
        System.out.println("Index on 5 element : " + l1.indexOf(5));
        System.out.println("Index on 150 element : " + l1.indexOf(150));
        System.out.println("Index on 10 element : " + l1.lastIndexOf(10)); // Check from last.

        System.out.println();
        System.out.println();

        ArrayList<Integer>  l2 = new ArrayList<>(); // It is a Syntax of Generics.
        l2.add(16);
        l2.add(17);
        l2.add(18);
        l2.add(19);
        l2.add(20);

        l2.add(0,15);
        l2.add(0,11);

        System.out.println("Print the another Demo ArrayLiat : ");
        for(int i = 0; i < l2.size(); i++)
        {
            System.out.print(" " + l2.get(i));
        }

        System.out.println();
        System.out.println();

        System.out.println("In which we can add l1+l2 in ArrayList Wise : ");
        l1.addAll(l2);
        for(int i = 0; i < l1.size(); i++)
        {
            System.out.print(" " + l1.get(i));
        }

        System.out.println();
        System.out.println();

        System.out.println("In which we can add l1+l2 in ArrayList Wise : we can index for printing the l2 Array List First : ");
        l1.addAll(0, l2);
        for(int i = 0; i < l1.size(); i++)
        {
            System.out.print(" " + l1.get(i));
        }

        l1.clear();
        l2.clear();
    }
}
