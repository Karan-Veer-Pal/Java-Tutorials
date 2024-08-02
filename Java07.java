// Day : 07 Chapter : 01 Practice Set

import java.util.Scanner;

// Qs1.) WAP to sum three numbers in Java?
public class Java07
{
    public static void main(String[] args)
    {
        // Qs1.) WAP to sum of three numbers in Java?
        System.out.println("Program to calculate sum : ");

        Scanner variable = new Scanner(System.in);

        System.out.println("Enter the value of number one : ");
        int num1 = variable.nextInt();
        System.out.println("Enter the value of number two : ");
        int num2 = variable.nextInt();
        System.out.println("Enter the value of number three : ");
        int num3 = variable.nextInt();

        int sum;
        sum = num1 + num2 + num3;

        System.out.print("Sum of Three Number is : ");
        System.out.println(sum);

        System.out.println("----------------------------------------");

        // Qs2.) WAP to calculate CGPA using marks of three subject (Out of !00)?
        System.out.println("Program to calculate CGPA : ");

        System.out.println("Enter marks of Physics : ");
        int physics = variable.nextInt();
        System.out.println("Enter marks of Chemistry : ");
        int chemistry = variable.nextInt();
        System.out.println("Enter marks of Mathematics : ");
        int mathematics = variable.nextInt();

        int Total = physics + chemistry + mathematics;
        float percent = Total;
        percent = percent/3;

        System.out.print("Percentage of Student is = ");
        System.out.print(percent);
        System.out.println("%");

        //float cgpa = (physics+chemistry+mathematics)/30; // Direct way to calculate
        double cgpa = (percent)/(9.5);
        System.out.print("CGPA of a Student is = ");
        System.out.println(cgpa);

        System.out.println("----------------------------------------");

        // Qs3.) WAP which asks the user to enter his/her name and greets them with "Hello <name>, have a nice day" text?
        System.out.println("Program to Greeting by asking his/her name : ");

        System.out.println("What is your name? : ");
        String name = variable.next();

        System.out.println("Hello " + name + "! Have a nice day"); // Another way to print; like a concatenation

        System.out.println("----------------------------------------");

        // Qs4.) WAP to convert kilometers to miles?
        System.out.println("Program to convert kilometers into miles : ");

        System.out.println("Enter Kilometers here : ");
        float kilometer = variable.nextFloat();

        double miles = (kilometer)/1.609344;
        System.out.print(kilometer);
        System.out.print("km is equal to ");
        System.out.println(miles);

        System.out.println("----------------------------------------");

        // Qs4.) WAP to detect whether a number entered by the user is integer or not?
        System.out.println("Program to check number is integer or not : ");

        System.out.println("Enter any number to check is interger or not : ");
        int isInt = variable.nextInt();

        if (-2147483647  < isInt && isInt < 2147483647)
        {
            System.out.println("Yes! Entered number is an Integer.");
        }
        else
        {
            System.out.println("No! Entered number is not an Integer.");
        }

        // Another way to check :
        System.out.println("Enter any number to check is interger or not by using Another way: ");
        System.out.println(variable.hasNextInt());
    }
}
