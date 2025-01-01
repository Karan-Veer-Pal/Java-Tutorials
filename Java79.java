// Day : 79 Types of Errors : Syntax Errors, Logical Errors and Runtime Errors

import java.util.Scanner;

public class Java79
{
    public static void main(String[] args)
    {
        // SYNTAX ERROR DEMO :
        // int a = 5 --> It is called Syntax Error. Semicolon ; is missing.
        // c = 3; --> It is called Syntax Error. int is missing.

        //LOGICAL ERROR DEMO
        //WAP to print all prime numbers between 1 - 10?
        System.out.println(2);
        int i = 1;
        while(i < 5)
        {
            System.out.println("Prime Numnber = " + ((2*i)+1));
            i++;
        }
        // In which 9 is print which is not a prime number, So it is a logical error.

        // Syntax error is highlighted by IDE but Logical error is not highlighted by IDE.

        //RUNTIME ERROR DEMO : Exception
        int k;
        Scanner variable = new Scanner(System.in);
        System.out.println("Enter a number : ");
        k = variable.nextInt();
        System.out.println("Integer part of 1000 divided by k is : " + 1000/k);
        // k take a integer value; when user enters a floating point number then runtime error occurs.
    }
}
