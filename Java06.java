// Day : 06 Exercise 1 CBSE Board Percentage Calculator

// WAP to calculate percentage of a given student in CBSE board Exam. His marks from 5 subjects must be taken as input from the keyboard (Marks are out of 100)?

import java.util.Scanner;

public class Java06
{
    public static void main(String[] args)
    {
        Scanner marks = new Scanner(System.in);

        System.out.println("Enter your marks in English : ");
        int english = marks.nextInt();
        System.out.println("Enter your marks in Hindi : ");
        int hindi = marks.nextInt();
        System.out.println("Enter your marks in Mathematics : ");
        int mathematics = marks.nextInt();
        System.out.println("Enter your marks in Science : ");
        int science = marks.nextInt();
        System.out.println("Enter your marks in Social Science : ");
        int socialScience = marks.nextInt();

        int sum = english + hindi + mathematics + science + socialScience;

        System.out.print("Total marks of a Student = ");
        System.out.println(sum);

        // int avg = (sum*100)/500;
        float avg = sum; // Automatic type-casting: int to float
        avg = (avg*100)/500;

        System.out.print("Percentage of Student is = ");
        System.out.print(avg);
        System.out.println("%");
    }
}
