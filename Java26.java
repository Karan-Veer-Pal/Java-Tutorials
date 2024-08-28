// Day : 26 Arrays

public class Java26
{
    public static void main(String[] args)
    {
        // Classroom of 500 hundred Students - You need to store marks of these students : using ARRAY or Creating 500 variables individually.
        // Array is a easy way to store the multiple value of similar type.

        int [] marks; // Declaration!
        marks = new int[5]; // memory allocation for 5 elements!

        // Storation :
        marks[0] = 56;
        marks[1] = 86;
        marks[2] = 46;
        marks[1] = 89; // Over-write is allowed here!

        // Printation :
        System.out.println("Access array at index 0 = " + marks[0]);
        System.out.println("Access array at index 1 = " + marks[1]);
        System.out.println("Access array at index 2 = " + marks[2]);
    }
}
