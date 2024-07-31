// Day : 05 Getting User Input

// Scanner :- In order to read data from the keyboard, Java has a Scanner class.
// Scanner class has a lot of methods to read the data from the keyboard.

import java.util.Scanner; // Import Scanner class for taking user input

public class Java05
{
    public static void main(String[] args)
    {
        System.out.println("Taking input from the user : ");
        Scanner sc = new Scanner(System.in); // It is a object of the Scanner class

        System.out.println("Enter the value of number 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of number 2 : ");
        int b = sc.nextInt();

        int sum = a + b;

//        System.out.println("Enter the value of number 1 : ");
//        float a = sc.nextFloat();
//        System.out.println("Enter the value of number 2 : ");
//        float b = sc.nextFloat();
//
//        float sum = a + b;

        System.out.println("The sum of two number is :");
        System.out.println(sum);

        System.out.println("Enter your name : ");
        String str1 = sc.next(); // It only take a one word not take white spaces
        System.out.println("You entered your name is : ");
        System.out.println(str1);

        // Doubt------------------------------------------------------>>>>>>>>>>
        System.out.println("Enter your address : ");
        String str2 = sc.nextLine(); // used to take a full line also take white spaces
        System.out.println("You entered your address is : ");
        System.out.println(str2);

        System.out.println("Enter number to check the number is integer or not : ");
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
    }
}
