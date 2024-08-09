
// Day : 07 Chapter : 02 Practice Set

import java.util.Scanner;

public class Java12
{
    public static void main(String[] args)
    {
        Scanner variable = new Scanner(System.in);

        // Qs1.) What will be the result of the following expression : float a = 7/4 * 9/2 ?

        // float exp1 = ((7 / 4) * 9) / 2; --> It return the wrong value because 7/4 = 1.75 but, it is a int, so it, return 1 only, same for all, so we use to find the right answer
        float exp1 = 7 / 4.0f * 9 / 2.0f;
        System.out.println("The result of the following expression : float a = 7/4 * 9/2 : return result by using associativity : " + exp1);

        System.out.println("----------------------------------------");

        // Qs2.) WAP to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade?
        System.out.println("Program to Encrypt and Decrypt the Grade : ");

        System.out.println("Enter a number between A to E as a grade : ");
        char grade = variable.next().charAt(0);
        grade = (char)(grade + 8);
        System.out.println("Encrypted grade is = " + grade);
        grade = (char)(grade - 8);
        System.out.println("Decrypted grade is = " + grade);

        System.out.println("----------------------------------------");

        // Qs3.) Use comparison operators to find out whether a given number is greater than the user entered number or not?
        System.out.println("Program to check the greater number : ");

        int default_number = 6;
        System.out.println("Please enter a number between 1 to 10 for checking the entered number is greater than the default number or not : ");
        int user_number = variable.nextInt();
        if(default_number > user_number)
        {
            System.out.println("Default number is greater than the user number.");
        }
        else if(default_number == user_number)
        {
            System.out.println("User number and Default number are equal.");
        }
        else
        {
            System.out.println("User number is greater than the Default number.");
        }

        System.out.println("----------------------------------------");

        // Qs4.) WAP expression in a given program : (v*v - u*u)/2a5?
        System.out.println("Program of expression execution (v*v - u*u)/2a5 : ");

        System.out.println("Enter the value of v, u and a : ");
        float v = variable.nextFloat();
        float u = variable.nextFloat();
        float a = variable.nextFloat();
        float exp2 = (v*v - u*u)/(2*a*5);
        System.out.println("(v*v - u*u)/(2*a*5) =" + exp2);

        System.out.println("----------------------------------------");

        // Qs5.) Find the value of the following expression : int x = 7; int a = 7 * 49 / 7 + 35 / 5?
        System.out.println("Program to execute the expression int x = 7; int a = 7 * 49 / 7 + 35 / 5 : ");

        int exp3 = 7 * 49 / 7 + 35 / 7;
        System.out.println("x = 7 * 49 / 7 + 35 / 7 = " + exp3);
    }
}
