// Day : 86 Chapter : 14 Practice Set

import java.util.Scanner;

class maxTriesOver86 extends Exception
{
    @Override
    public String toString()
    {
        return "Maximum try to access the array is over!";
    }

    @Override
    public String getMessage()
    {
        return "Maximum try to access the array is over!";
    }
}

public class Java86
{
    public static void main(String[] args)
    {
        Scanner variable = new Scanner(System.in);

        // Qs1.) WAP to demonstrate the syntax, logical and runtime errors?
//        System.out.println("Program to demonstrate the syntax, logical and runtime errors : ");
//
//        // a = 5; It is known as Syntax Error coz int is missing.

//        // Logical Error : In which 0 and 12 is not need to print here, so it is a logical error.
//        System.out.println("Even number form 1 to 10 : ");
//        int i = 0;
//        while(i < 7)
//        {
//            System.out.println(2*i);
//            i++;
//        }

//        // Runtime Error : If we entered a one integer and another is string then it produce a runtime error.
//        System.out.println("Enter two number of sum : ");
//        int a = variable.nextInt();
//        int b = variable.nextInt();
//        int c = a+b;
//        System.out.println("Result = " + c);
//
//        System.out.println("----------------------------------------");

        // Qs2.) WAP that prints "HELLO" during arithmetic exception and "HEY" during an illegal argument exception?
//        System.out.println("Program to prints \"HELLO\" during arithmetic exception and \"HEY\" during an illegal argument exception :");
//
//        System.out.println("Enter any two number for divide : ");
//        int x = variable.nextInt();
//        int y = variable.nextInt();
//        try
//        {
//            int z = x/y;
//            System.out.println("Result = " + z);
//        }
//        catch(ArithmeticException e)
//        {
//            System.out.println("HELLO");
//            System.out.println(e);
//        }
//        catch(IllegalArgumentException e)
//        {
//            System.out.println("HEY");
//            System.out.println(e);
//        }

        System.out.println("----------------------------------------");

        // Qs3.) WAP that allows you to keep accessing an array until a valid index is given. If max retries exceed 5 print "ERROR"?
//        System.out.println("Program that is allows you to keep accessing an array until a valid index is given : ");
//
//        boolean flag = true;
//        int [] marks = new int[3];
//        marks[0] = 67;
//        marks[1] = 77;
//        marks[2] = 98;
//        int index;
//        int max_retries = 0;
//        while(flag && max_retries < 5 )
//        {
//            try
//            {
//                System.out.println("Enter the value of index : ");
//                index = variable.nextInt();
//                System.out.println("The value of marks[index] is " + marks[index]);
//                break;
//            }
//            catch(Exception e)
//            {
//                System.out.println("ERROR! Invalid Index.");
//                max_retries++;

//            }
//        }
//        if(max_retries >= 5)
//        {
//            System.out.println("ERROR! Your max try is over.");
//        }

        System.out.println("----------------------------------------");

        // Qs4.) Modify program in Q3 to throw a custom exception if max retries are reached?
        System.out.println("Program to modify Q3 to throw a custom exception if max retries are reached: ");

//        System.out.println("----------------------------------------");

        // Qs5.) Wrap the program is Q3 inside a method which throws your custom exception?
        System.out.println("Wrap the program is Q3 inside a method which throws your custom exception : ");

        System.out.println("----------------------------------------");
    }
}
