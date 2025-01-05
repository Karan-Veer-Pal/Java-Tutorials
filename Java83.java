// Day : 83 The Exception Class

import java.util.Scanner;

class MyException extends Exception
{
    @Override
    public String toString()
    {
        return "I am toString()";
    }

    @Override
    public String getMessage()
    {
        return "I am getMessage()";
    }
}

public class Java83
{
    public static void main(String[] args)
    {
        int a;
        Scanner variable = new Scanner(System.in);
        System.out.println("Enter any number : ");
        a = variable.nextInt();
        if(a < 9)
        {
            try
            {
                // throw new MyException();
                throw new ArithmeticException("This is an Exception!");
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace(); // It is not a error.
                System.out.println("Finished!");
            }
            System.out.println("Yes 4Finished!");
        }
    }
}
