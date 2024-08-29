// Day : 27 For Each Loop

public class Java27
{
    public static void main(String[] args)
    {
        int [] marks = {98, 72, 67, 89, 66};
        System.out.println("Length of the array is = " + marks.length);

        System.out.println("--------------------------------------");

        // Displaying of array in easy way :
        System.out.println("Printing array using For Loop :");
        String [] student = {"Karan", "Avinash", "Abhishek"};
        System.out.println(student.length);
        for(int i = 0; i < student.length; i++)
        {
            System.out.println("Student = " + student[i]);
        }

        System.out.println("--------------------------------------");

        // Quick Quiz : WAP to print the elements of an array in reverse order?
        System.out.println("Quick Quiz : Printing the element of array in reverse order : ");
        for(int i = student.length - 1; i >= 0 ; i--)
        {
            System.out.println("Student = " + student[i]);
        }

        System.out.println("--------------------------------------");

        System.out.println("Printing using For Each Loop :");
        for(String element : student)
        {
            System.out.println(element);
        }
    }
}
