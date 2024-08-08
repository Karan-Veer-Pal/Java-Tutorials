// Day : 06 Exercise 1 CBSE Board Percentage Calculator : Solution by Tutor :

// WAP to calculate percentage of a given student in CBSE board Exam. His marks from 5 subjects must be taken as input from the keyboard (Marks are out of 100)?


import java.util.Scanner;

public class Java11
{
    public static void main(String[] args)
    {
        System.out.println("CBSE PERCENTAGE CALCULATOR USING JAVA");
        System.out.println("Enter the marks of the students of each subjects: ");
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;

        for (int i = 0; i < 5; i++ )
        {
            System.out.println("Enter the marks of "+(i+1) +" subject ");
            marks[i] = sc.nextInt();
            total = marks[i] + total;
        }

        System.out.println("The total of the marks: "+total);
        float percentage = (total*100.0f)/500;
        System.out.println("The percentage is: "+percentage+"%");
    }
}
