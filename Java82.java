// Day : 82 Nested Try Catch BLock

import java.sql.SQLOutput;
import java.util.Scanner;

public class Java82
{
    public static void main(String[] args)
    {
        int [] marks = new int[3];
        marks[0] = 45;
        marks[1] = 89;
        marks[2] = 33;
        Scanner variable = new Scanner(System.in);
        System.out.println("Enter the value of index ; ");
        int index1 = variable.nextInt();
        try
        {
            System.out.println("Welcome to class 82");
            try
            {
                System.out.println(marks[index1]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Sorry, this index does not exist!");
                System.out.println("Exception in level 2");
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception in level 1");
        }

        // Quick Quiz : WAP that allow you to keep accessing an array until a valid index is given by the user?
        boolean flag = true;
        while(flag)
        {
            System.out.println("Enter the value of index for another program : ");
            int index2 = variable.nextInt();
            try
            {
                System.out.println("Welcome to class 82");
                try
                {
                    System.out.println(marks[index2]);
                    flag = false;
                }
                catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Sorry, this index does not exist!");
                    System.out.println("Exception in level 2");
                }
            }
            catch(Exception e)
            {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Thanks for using this program!");
    }
}
