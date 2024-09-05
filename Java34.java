// Day : 34 Recursion
import java.util.Scanner;

public class Java34
{
    // By using Iterative Approach
    static int fact_iter(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
            int product = 1;
            for(int i = 1; i <= n; i++)
            {
                product = product * i;
            }
            return product;
        }
    }

    // By using Recursion :
    static int factorial(int n)
    {
        // Factorial(n) : n * (n - 1) * .....1
        if(n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
            return n * factorial(n-1);
        }
    }

    // Fibonacci Series :
    static int fibonacci_series(int n)
    {
        if(n <= 1)
        {
            return n;
        }
        else
        {
            return fibonacci_series(n-1) + fibonacci_series(n-2);
        }
    }

    public static void main(String[] args)
    {
        Scanner variable = new Scanner(System.in);

        System.out.println("Enter a number for find the factorial of that number : ");
        int num = variable.nextInt();
        System.out.println("The value of factorial " + num + " is : " + fact_iter(num) + " using Iterative Method!");

        // Quick Quiz 1 : WAP to calculate the factorial of a given number by using Recursion?
        System.out.println("The value of factorial " + num + " is : " + factorial(num) + " using Recursion");

        // Quick Quiz 2 : WAP to print the Fibonacci Series using recursion ?
        System.out.println("Enter two numbers to start the print of a Fibonacci Series : ");
        int num1 = variable.nextInt();

        System.out.println("Fibonacci Series = ");
        for(int i = 0; i < num1; i++)
        {
            System.out.print(fibonacci_series(i) + " ");
        }
        variable.close();
    }
}
