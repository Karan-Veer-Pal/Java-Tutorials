// Day : 16 If-Else Statement/Conditions : All these are decisions which depends on a certain condition being met.

import java.util.Scanner;

public class Java16
{
    public static void main(String[] args)
    {
        Scanner variable = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = variable.nextInt();
        if(age >= 18)
        {
            System.out.println("Yes! You can eligible for Drive.");
        }
        else // else is optional
        {
            System.out.println("No! You cannot eligible for Drive.");
        }
    }
}
