// Day : 5 Chapter : 07 Practice Set

import java.util.Scanner;

public class Java35
{
    // Table Method :
    static void table(int num)
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(num + " X " + i + " = " + num*i);
        }
    }

    // Pattern Method : 1
    static void pattern1()
    {
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < i + 1; j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    // Sum first n natural number :
    static int sum(int n)
    {
        // Base Condition
        if (n == 1) { // Base case: if n is 1, return 1
            return 1;
        } else {
            return n + sum(n - 1); // Recursive case
        }
    }

    // Pattern Method : 2
    static void pattern2()
    {
        for(int i = 0; i < 4; i++)
        {
            for(int j = 4; j > i; j--)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    // Fibonacci Term :
    static int fibonacci(int n)
    {
        if(n == 1)
        {
            return 0;
        }
        else if(n == 2)
        {
            return 1;
        }
        else
        {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Average :
    static int avg(int ...a)
    {
        int add = 0;
        int count = 0;
        for(int element : a)
        {
            add += element;
            count++;
        }
        add = add/count;
        return add;
    }

    // Pattern Method : 3
    static void pattern3(int n)
    {
        if (n == 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        pattern3(n - 1);
    }

    // Pattern Method : 4
    static void pattern4(int n)
    {
        if(n > 0)
        {
            pattern4(n - 1);
            for(int i = 0; i < n; i++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    // Running :
    // pattern(3)
    // pattern(2) + 3 times star and new line
    // pattern(1) + 3 times star and new line + 2 times star and new line
    // pattern(0) + 3 times star and new line + 2 times star and new line + 1 times star and new line --> Terminate

    // Celsius to Fahrenheit :
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Sum first n natural number
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner variable = new Scanner(System.in);

        // Qs1.) WAP to print multiplication table of a number n using methods?
        System.out.println("Program to print multiplication table of a number n :");
        System.out.println("Enter a number for print the Table of that number :");
        int n = variable.nextInt();
        table(n);

        System.out.println("----------------------------------------");

        // Qs2.) WAP using functions to print the following pattern :
        // *
        // * *
        // * * *
        //* * * *
        System.out.println("Program to print pattern : ");
        System.out.print("Pattern =");
        pattern1();

        System.out.println("----------------------------------------");

        // Qs3.) WAP of recursive function to calculate sum of first n natural numbers?
        System.out.println("Program to print sum of first n natural numbers : ");
        int num = 10;
        System.out.println("Sum of first " + num + " natural numbers is: " + sum(num));

        System.out.println("----------------------------------------");

        // Qs4.) WAP using functions to print the following pattern :
        // * * * *
        // * * *
        // * *
        // *
        System.out.println("Program to print pattern : ");
        System.out.println("Pattern =");
        pattern2();

        System.out.println("----------------------------------------");

        // Qs5.) Write a function to print nth term of fibonacci series using recursion?
        System.out.println("Program to print nth term of fibonacci series : ");
        System.out.println("Enter a number place : ");
        int term = variable.nextInt();
        System.out.println(fibonacci(term));

        System.out.println("----------------------------------------");

        // Qs6.) Write a function to find average of a set of numbers passed as arguments?
        System.out.println("Program to calculate average of a set of numbers : ");
        System.out.println("Average " + avg(1,2,3,4,5));

        System.out.println("----------------------------------------");

        // Qs7.) Repeat 4 using Recursion?
        System.out.println("Program to print pattern using recursion : ");
        System.out.println("Pattern = ");
        pattern3(4);

        System.out.println("----------------------------------------");

        // Qs8.) Repeat 2 using Recursion?
        System.out.println("Program to print pattern using recursion : ");
        System.out.println("Pattern = ");
        pattern4(4);

        System.out.println("----------------------------------------");

        // Qs9.) Write a function to convert celsius temperature into fahrenheit?
        System.out.println("Program to convert celsius temperature into fahrenheit :");
        double celsius = 25.0; // Example Celsius temperature
        System.out.println(celsius + "°C is equal to " + celsiusToFahrenheit(celsius) + "°F");

        System.out.println("----------------------------------------");

        // Qs10.) Repeat 3 using iterative approach?
        System.out.println("Program to print sum of first n natural numbers using iterative approach: ");

        System.out.println("Enter a positive integer: ");
        int num1 = variable.nextInt();
        if (num1 > 0) {
            int sum = calculateSum(num1); // Calculate sum
            System.out.println("The sum of the first " + num1 + " natural numbers is: " + sum);
        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}
