// Day : 95 HashSet

import java.util.HashSet;

public class Java95
{
    public static void main(String[] args)
    {
        HashSet<Integer> myHashSet = new HashSet<>(6, 8.5f);
        myHashSet.add(6);
        myHashSet.add(7);
        myHashSet.add(8);
        myHashSet.add(9);
        myHashSet.add(9); // In Sets, repeatation is not considered.

        System.out.println("My HashSet = " + myHashSet);

        myHashSet.remove(9);

        System.out.println("My HashSet = " + myHashSet);

        HashSet<Integer> myHashSet1 = new HashSet<>();

        System.out.println("Hash Set Empty or Not = " + myHashSet.isEmpty());
        System.out.println("Hash Set Empty or Not = " + myHashSet1.isEmpty());

        System.out.println("The size of myHashSet is : " + myHashSet.size());

        System.out.println("myHashSet before : " + myHashSet);
        myHashSet.clear(); //deletes all the elements from the hashset
        System.out.println("myHashSet after  : " + myHashSet);


    }
}

//HashSet in Java :
//HashSet class uses a hash table for storing the elements.
//It implements the set interface.
//Duplicate values are not allowed.
//Before storing any object, the hashset uses the hashCode() and equals() method to check any duplicate entry in the hash table.
//Allows null value.
//Best suited for search operations.

//Constructors Of HashSet :
//HashSet(): This constructor is used to create a new empty HashSet that can store 16 elements and have a load factor of 0.75.
//HashSet(int initialCapacity): This constructor is used to create a new empty HashSet which has the capacity to store the specified number -
//- of elements and having a load factor of 0.75.
//HashSet(int initialCapacity, float loadFactor): This constructor is used to create a new empty HashSet with the capacity & load -
//- factor equal to specified integer and float value.
//HashSet(Collection<? extends E> c): This constructor is used to create a HashSet using the elements of collection c.

