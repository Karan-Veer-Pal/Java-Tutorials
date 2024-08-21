// Day : 19 Chapter : 04 Practice Set

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Java19
{
    public static void main(String[] args)
    {
        Scanner variable = new Scanner(System.in);

        // Qs1.) What will be the output of this program : int a = 10; if(a = 11) System.out.println("I'm 11"); else System.out.println("I'm not 11"); ?
        // OUTPUT -> I'm not  11 coz of using assignment operator(=) not using equals operator(==), if(a = 11) This will also generate en error.

        System.out.println("Program of checking Output : ");
        int a = 10;
        if(a == 11) // if(a = 11) This will also generate en error.
        {
            System.out.println("I'm 11");
        }
        else
        {
            System.out.println("I'm not 11");
        }

        System.out.println("----------------------------------------");

        // Qs2.) WAP to find out whether a student is pass or fail; if it requires total 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as an input from the user?
        System.out.println("Program to check Pass or Fail : ");

        System.out.println("Enter the marks of Mathematics : ");
        int mathematics = variable.nextInt();
        System.out.println("Enter the marks of Physics : ");
        int physics = variable.nextInt();
        System.out.println("Enter the marks of Chemistry : ");
        int chemistry = variable.nextInt();

        float avg = (mathematics + physics + chemistry)/3.0f;
        System.out.println("Percentage of student is = " + avg + "%");

        if(avg < 33 )
        {
            System.out.println("Student is Fail.");
        }
        else if(avg >= 33 && avg < 50)
        {
            System.out.println("Student is Pass.");
        }
        else if(avg >= 50 && avg < 60)
        {
            System.out.println("Student is Pass with Third Division.");
        }
        else if(avg >= 60 && avg < 70)
        {
            System.out.println("Student is Pass with Second Division.");
        }
        else if(avg >= 70 && avg <= 100)
        {
            System.out.println("Student is Pass with First Division.");
        }
        else
        {
            System.out.println("Student is Fail.");
        }

        System.out.println("----------------------------------------");

        // Qs3.) Calculate income tax by an employee to the government as per the slabs mentioned below : ?
        // Income           Tax
        // 2.5L - 5.0L      5%
        // 5.0L - 10.0L     20%
        // Above 10.0L      30%
        System.out.println("Program to calculate income tax of an employee to the government : ");

        System.out.println("Enter your yearly income : (Lakhs)");
        float income = variable.nextFloat();
        float tax = 0;
        if(income <= 2.5f)
        {
            tax = tax + 0;
            System.out.println("Not need to pay the income tax to government.");
        }
        else if(income > 2.5f && income <= 5.0f)
        {
            tax = tax + 0.05f * (income - 2.5f); // 5% Tax
            System.out.println("You need to pay 5% of income as a tax which is = " + tax);
        }
        else if(income > 5f && income <= 10f)
        {
            tax = tax + 0.05f * (5.0f - 2.5f); // 5% Tax
            tax = tax + 0.2f * (income - 5.0f); // 20% Tax
            System.out.println("You need to pay 20% of income as a tax which is = " + tax);
        }
        else
        {
            tax = tax + 0.05f * (5.0f - 2.5f); // 5% Tax
            tax = tax + 0.2f * (10.0f - 5.0f); // 20% Tax
            tax = tax + 0.3f * (income - 10.0f); // 30% Tax
            System.out.println("You need to pay 30% of income as a tax which is = " + tax);
        }

        System.out.println("----------------------------------------");

        // Qs4.) WAP to find out the day of the week given the number [1 for Monday, 2 for Tuesday... and so on!]?
        System.out.println("Program of generate Week Day by it's consecutive number : ");

        System.out.println("Enter a number from 1 to 7 : ");
        int num = variable.nextInt();
        switch (num)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Entered number is invalid.");
        }

        System.out.println("----------------------------------------");

        // Qs5.) WAP to find whether a year entered by the user is a leap year or not?
        System.out.println("Program to check entered year is leap year on not ");

        System.out.println("Enter any Year : ");
        int year = variable.nextInt();
//        year = ((year % 4 == 0 && year % 100 != 0)||(y%400==0))?1:0;
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println("Yes! This is Leap Year.");
        }
        else
        {
            System.out.println("No! This is not a Leap Year.");
        }

        System.out.println("----------------------------------------");

        // Qs6.) WAP to find out the type of website from the "url": .com->commertial Website; .org->organization website; .in->indian website etc?
        System.out.println("Program to find out the website type by its url : ");

        System.out.println("Enter url domain : ");
        String url = variable.next();
        switch(url)
        {
            case ".com" -> System.out.println("It is Commertial Website.");
            case ".org" -> System.out.println("It is Organization Website.");
            case ".in" -> System.out.println("It is Indian Website.");
            case ".gov" -> System.out.println("It is Government Website.");
            case ".edu" -> System.out.println("It is Education Website.");
            case ".mil" -> System.out.println("It is Military Website.");
            case ".ai" -> System.out.println("It is Artificial Intelligence Website.");
        }

        // Another Way :
        System.out.println("Enter website url : ");
        String website = variable.next();
        if(website.endsWith(".com")){
            System.out.println("This is a Commercial Website.");
        }
        else if(website.endsWith(".org")){
            System.out.println("This is a Organization Website.");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is a Indian Website.");
        }

    }
}
