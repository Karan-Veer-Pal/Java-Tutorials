// Day : 25 Chapter : 05 Practice Set

import java.util.Scanner;

public class Java25
{
    public static void main(String[] args)
    {
        Scanner variable = new Scanner(System.in);

        // Qs1.) WAP to print the following pattern : ?
        // * * * *
        // * * *
        // * *
        // *

        System.out.println("Program to print the following pattern :");
        int rows1 = 4;
        for (int i = rows1-1; i >= 0 ; i--)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------");

        // Qs2.) WAP to sum first n even numbers using while loop?
        System.out.println("Program to print n Even Number : ");

        int even1 = 0;
        while(even1 <= 10)
        {
            if(even1 % 2 == 0)
            {
                System.out.println(even1);
            }
            even1++;
        }

        System.out.println("----------------------------------------");

        // Qs3.) WAP to print multiplication table of a given number n?
        System.out.println("Program to print Table : ");

        System.out.println("Enter a number to print a Table :");
        int num1 = variable.nextInt();

        for(int i = 1 ; i <= 10; i++)
        {
            System.out.println(num1 + " X " + i + " = " + num1 * i);
        }

        System.out.println("----------------------------------------");

        // Qs4.) WAP to print multiplication table of 10 in reverse order?
        System.out.println("Program to print Table in reverse order : ");

        int num2 = 10;
        for(int i = 10; i != 0; i--)
        {
            System.out.println(num2 + " X " + i + " = " + num2 * i);
        }

        System.out.println("----------------------------------------");

        // Qs5.) WAP to find factorial of a given number using for loop?
        System.out.println("Program to find Factorial of a given number using for loop : ");

        System.out.println("Enter any number to find factorial : ");
        int num3 = variable.nextInt();
        int fact1 = 1;
        for(int i = 1; i <= num3; i++)
        {
            fact1 = fact1 * i;
        }
        System.out.println("Factorial of " + num3 + " is " + fact1);

        System.out.println("----------------------------------------");

        // Qs6.) Repeat 5 using while loop?
        System.out.println("Program to find Factorial of a given number using while loop : ");

        System.out.println("Enter any number to find factorial : ");
        int num4 = variable.nextInt();
        int fact2 = 1;
        int j = 1;
        while(j <= num4)
        {
            fact2 = fact2 * j;
            j++;
        }
        System.out.println("Factorial of " + num4 + " is " + fact2);

        System.out.println("----------------------------------------");

        // Qs7.) Repeat 1 using while loop?
        System.out.println("Program to print the following pattern using while loop : ");

        int rows2 = 4;
        int k1 = rows2-1;
        while(k1 >= 0)
        {
            int k2 = 0;
            while(k2 <= k1)
            {
                System.out.print("*" + " ");
                k2++;
            }
            System.out.println();
            k1--;
        }

        System.out.println("----------------------------------------");

        // Qs8.) What can be done using one type of loop can also be done using the other two types of loops?
        System.out.println("It is TRUE, we can done the same work by using different loops.");

        System.out.println("----------------------------------------");

        // Qs9.) WAP to calculate the sum of the numbers occuring in the multiplication table of 8?
        System.out.println("Program to generate the sum of occuring Table 8 : ");

        int num5 = 8;
        int sum = 0;
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(num5 + " X " + i + " = " + num5 * i);
            sum = sum + (num5 * i);
        }
        System.out.println("Total sum of Table 8 is = " + sum);

        System.out.println("----------------------------------------");

        // Qs10.) A do-while loop is executed : At Least Once; At Least Twice; At Most Once?
        System.out.println("In do-while loop is always executed At Least Once either the condition is true or false.");

        System.out.println("----------------------------------------");

        // Qs11.) Repeat 2 using for loop?
        System.out.println("Program to print n Even Number : ");


        for(int even2 = 0; even2 <= 10; even2++)
        {
            if(even2 % 2 == 0)
            {
                System.out.println(even2);
            }
        }
    }
}
