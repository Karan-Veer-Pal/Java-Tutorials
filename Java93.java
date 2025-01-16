// Day : 93 Java ArrayDeque

import java.util.ArrayDeque;

public class Java93
{
    public static void main(String[] args)
    {
        // Deque : Double Ended Queue
        // ArrayDeque() : Constructs an empty array deque with an initial capacity sufficient to hold 16 elements.
        // ArrayDeque( int number) : Constructs an empty array deque with an initial capacity sufficient to hold the specified number of elements.

        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(8);
        ad1.addFirst(77);
        ad1.addLast(87);
        System.out.println("First Element = " + ad1.getFirst());
        System.out.println("Last Element = " + ad1.getLast());
        ad1.removeFirst();
        ad1.removeLast();
        System.out.println("First Element After Deletion = " + ad1.getFirst());
        System.out.println("Last Element After Deletion = " + ad1.getLast());
    }
}
