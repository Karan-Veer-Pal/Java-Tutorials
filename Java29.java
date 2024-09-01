// Day : 29 Chapter : 06 Practice Set

import java.util.Scanner;

public class Java29
{
    public static void main(String[] args)
    {
        Scanner variable = new Scanner(System.in);

        // Qs1.) Create an array of 5 floats and calculate their sum?
        System.out.println("Program to create array and display their elemant's sum :");

        float [] arr1 = new float[5];
        float sum = 0;

        System.out.println("Enter 5 floating element into this array :");
        for(int i = 0; i < arr1.length; i++)
        {
            arr1[i] = variable.nextFloat();
        }

        System.out.println("Print entered array : ");
        for(int i = 0; i < arr1.length; i++)
        {
            System.out.println(arr1[i]);
        }

        for(float element : arr1)
        {
            sum = sum + element;
        }
        System.out.println("Sum of element's array is = " + sum);

        System.out.println("----------------------------------------");

        // Qs2.) WAP to find out whether a given integer is present in n array or not?
        System.out.println("Program to find the number's existence : ");

        int [] arr2 = {1, 5, 8, 3, 9};
        boolean found = false;

        System.out.println("Enter a number between 1 to 10 for existence:");
        int num = variable.nextInt();

        for(int i = 0; i < arr2.length; i++)
        {
            if(arr2[i] == num)
            {
                found = true;
            }
        }
        if(found)
        {
            System.out.println("Yes! This number is exist in this array.");
        }
        else
        {
            System.out.println("No! This number is not exist in this array.");
        }

        System.out.println("----------------------------------------");

        // Qs3.) Calculate the average marks from an array containing marks of all students in physics using for each loop?
        System.out.println("Program to print average of the one subject : ");

        System.out.println("Enter the number of students :");
        int size1 = variable.nextInt();

        float [] marks = new float[size1];

        System.out.println("Enter the Physics marks of " + size1 + " students :");
        for(int i = 0; i < size1; i++)
        {
            marks[i] = variable.nextFloat();
        }

        System.out.println("The Physics marks of students is : ");
        for(int i = 0; i < size1; i++)
        {
            System.out.println(marks[i]);
        }

        float add = 0;
        for(int i = 0; i < size1; i++)
        {
            add += marks[i];
        }
        float avg = add/size1;
        System.out.println("The average of class of student is = " + avg + " in Physics");

        System.out.println("----------------------------------------");

        // Qs4.) WAP to add two matrices of size : 2 X 3?
        System.out.println("Program to add two matrix : ");

        System.out.println("Enter the size of the matrix for size2 and size3: ");
        int size2 = variable.nextInt();
        int size3 = variable.nextInt();

        int [][] arr3 = new int[size2][size3];
        System.out.println("Enter the " + size2*size3 + " element for FIRST matrix of size " + size2 + " X " + size3 + " : ");
        for(int i = 0; i < size2; i++)
        {
            for(int j = 0; j < size3; j++)
            {
                arr3[i][j] = variable.nextInt();
            }
        }

        int [][] arr4 = new int[size2][size3];
        System.out.println("Enter the " + size2*size3 + " element for SECOND matrix of size " + size2 + " X " + size3 + " : ");
        for(int i = 0; i < size2; i++)
        {
            for(int j = 0; j < size3; j++)
            {
                arr4[i][j] = variable.nextInt();
            }
        }

        System.out.println("FIRST Matrix = ");
        for(int i = 0; i < size2; i++)
        {
            for(int j = 0; j < size3; j++)
            {
                System.out.print(arr3[i][j]+ "\t");
            }
            System.out.println("");
        }

        System.out.println("SECOND Matrix = ");
        for(int i = 0; i < size2; i++)
        {
            for(int j = 0; j < size3; j++)
            {
                System.out.print(arr4[i][j]+ "\t");
            }
            System.out.println("");
        }

        int [][] arr5 = new int[size2][size3];
        for(int i = 0; i < size2; i++)
        {
            for(int j = 0; j < size3; j++)
            {
                arr5[i][j] = arr3[i][j] + arr4[i][j];
            }
        }

        System.out.println("ADDITION of Matrix is = ");
        for(int i = 0; i < size2; i++)
        {
            for(int j = 0; j < size3; j++)
            {
                System.out.print(arr5[i][j]+ "\t");
            }
            System.out.println("");
        }

        System.out.println("----------------------------------------");

        // Qs5.) WAP to reverse an array?
        System.out.println("Program to reverse an array : ");

        int [] arr6 = {1, 2, 3, 4};

        System.out.println("The default array is = ");
        for(int i = 0; i < arr6.length; i++)
        {
            System.out.println(arr6[i]);
        }

        System.out.println("Reverse array is = ");
        for(int i = arr6.length - 1; i >= 0; i--)
        {
            System.out.println(arr6[i]);
        }

        System.out.println("----------------------------------------");

        // Qs6.) WAP to find the maximum element in an array?
        System.out.println("Program to find MAXIMUM & MINIMUM element in an array : ");

        int [] arr7 = new int[5];

        System.out.println("Enter the " + arr7.length + " element into an array : ");
        for(int i = 0; i < arr7.length; i++)
        {
            arr7[i] = variable.nextInt();
        }

        int max = arr7[0];
        for(int i = 0; i < arr7.length; i++)
        {
            if(arr7[i] > max)
            {
                max = arr7[i];
            }
        }
        System.out.println("Maximum number is = " + max);

        System.out.println("----------------------------------------");

        // Qs7.) WAP to find the minimum element in an array?
        System.out.println("Program to find MAXIMUM & MINIMUM element in an array : ");

        int min = arr7[0];
        for(int i = 0; i < arr7.length; i++)
        {
            if(arr7[i] < min)
            {
                min = arr7[i];
            }
        }
        System.out.println("Maximum number is = " + min);

        System.out.println("----------------------------------------");

        // Qs8.) WAP to find whether an array is sorted or not?
        System.out.println("Program to find array is sorted or not");

        int [] arr8 = new int[6];

        System.out.println("Enter the " + arr8.length + " element into an array : ");
        for(int i = 0; i < arr8.length; i++)
        {
            arr8[i] = variable.nextInt();
        }

        boolean isSorted = true;
        for (int i = 1; i < arr8.length; i++) {
            if (arr8[i] < arr8[i - 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted in ascending order.");
        }

        System.out.println("----------------------------------------");

        // Qs9.) WAP to reverse the array using swap?
        System.out.println("Program to to reverse the array using swap");

        // int a = Math.floorDiv(5,2); -> 5/2 = 2.5 but this function is ignore decimal number. So this return 2.
        int [] a = {1, 2, 3, 4, 5, 6, 7};
        int len = a.length;
        int number = Math.floorDiv(len,2);
        int temp;

        for(int i = 0; i < number; i++)
        {
            // Swap a[i] = a[l-1-i];
            temp = a[i];
            a[i] = a[len - 1 - i];
            a[len - 1 - i] = temp;
        }

        System.out.println("Swaped array is = ");
        for (int element : a)
        {
            System.out.print(element + " ");
        }

    }
}
