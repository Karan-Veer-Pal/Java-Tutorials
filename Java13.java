// Day : 13 Introduction to Strings : String is a sequence of Characters and immutable(means can't be changed).

import java.util.Scanner;

public class Java13
{
    public static void main(String[] args)
    {
        Scanner variable = new Scanner(System.in);

        // String name = new String("Karan");
        String name = "Karan";
        System.out.println(name);

        // Different way to print in Java :
        System.out.print(name); // No newline at the end
        System.out.println(name); // Prints a newline at the end
        int a = 9;
        float b = 5.34632f;
        System.out.printf("The value of a is %d and the value of b is %.2f", a, b); // %d and %f is a format specifier
        System.out.format("The value of a is %d and the value of b is %f", a, b); // format = printf

        System.out.println("\n Enter any string : ");
        // String str1 = variable.next(); --> Return only first word of the string
        String str1 = variable.nextLine(); // --> Return full string
        System.out.println(str1);
    }
}

// Format Specifier : Format specifiers tell the compiler about the type of data that must be given or input and the type of data that must be printed on the screen : %c -> for Character, %d -> for Integer, %f -> for Float/Double, %s -> for String.
// String is a sequence of characters. A string is instantiated as follows :
// String name;
// name = new String("Karan");

// In Java, String is a class, it is not a primitive data type. But Java has a special support for string that's why you can use it like a primitive data type in java(like a normal data type).
// String a immutable, they can't be changed. Eg : We want to make a "string" then you can't changed the same object, Yes you can make a copy of it and change it.
