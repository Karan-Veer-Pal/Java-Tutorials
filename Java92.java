// Day : 92 LinkedList Demo + Methods

import java.util.LinkedList;

public class Java92
{
    public static void main(String[] args)
    {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l2.add(56);
        l2.add(66);
        l2.add(76);

        l1.add(45);
        l1.add(55);
        l1.add(65);
        l1.add(75);
        l1.add(85);

        l1.add(0,5);
        l1.add(3,9);

        l1.addLast(676);
        l1.addFirst(788);

        System.out.println(l1.contains(27));
        System.out.println(l1.contains(85));

        System.out.println(l1.indexOf(65));
        System.out.println(l1.indexOf(55));

        System.out.println(l1.lastIndexOf(85));

        l1.set(1,566);

        for(int i = 0; i < l1.size(); i++)
        {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }

    }
}
