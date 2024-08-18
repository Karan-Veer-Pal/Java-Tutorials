// Day : 18 Switch Case Statements

import java.util.Scanner;

public class Java18
{
    public static void main(String[] args)
    {
        Scanner variable = new Scanner(System.in);

        // else if clause :
        System.out.println("Enter Your Age : ");
        int age = variable.nextInt();

        if(age > 40)
        {
            System.out.println("You are experienced.");
        }
        else if(age > 36)
        {
            System.out.println("You are semi experienced.");
        }
        else if(age > 26)
        {
            System.out.println("You are under experienced.");
        }
        else
        {
            System.out.println("You are not experienced.");
        }

        // switch-case :
        switch(age)
        {
            case 18:
                System.out.println("You are going to become an Adult!");
                break;
            case 23:
                System.out.println("You are going to join a Job!");
                break;
            case 60:
                System.out.println("You are going to get Retired!");
                break;
            default:
                System.out.println("You are going to enjoy your Life!");
        }

        // switch for string of char : It is a enhanced switch-case statement in which we don't need to write break keyword to stop the execution of program.
        String name = "Karan Veer";
        switch (name)
        {
            case "Avinash" -> System.out.println("It is Avinash!");
            case "Abhishek" -> System.out.println("It is Abhishek!");
            case "Lokendra" -> System.out.println("It is Lokendra!");
            case "Karan Veer" -> System.out.println("It is Karan Veer!");
            default -> System.out.println("It is Another Person!");
        }
    }
}

// break means stop execution of switch block and going outside the switch-case block. If we not write a break keyword in switch case then case are matched by the variables then all the cases are run and print the answer, it is not a way to uses the switch case

