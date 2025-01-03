// Day : 81 Handling Specific Exceptions

import java.util.Scanner;

public class Java81
{
    public static void main(String[] args)
    {
        int [] marks = new int[3];
        marks[0] = 96;
        marks[1] = 46;
        marks[2] = 76;

        Scanner variable = new Scanner(System.in);

        System.out.println("Enter the array index : ");
        int index = variable.nextInt();

        System.out.println("Enter amy number to divide the indexed value : ");
        int number = variable.nextInt();

        try
        {
            System.out.println("The value at array index entered is : " + marks[index]);
            System.out.println("The value of array-value/number is : " + marks[index]/number);
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException Occured!");
            System.out.println(e); // Add this line to print the exception.
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException Occured!");
            System.out.println(e); // Add this line to print the exception.
        }
        catch(Exception e)
        {
            System.out.println("Some Other Exception Occured!");
            System.out.println(e); // Add this line to print the exception.
        }
    }
}
