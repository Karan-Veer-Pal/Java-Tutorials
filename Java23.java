// Day : 23 For Loop

public class Java23
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Demonstration of for loop : " + i);
        }

        System.out.println("--------------------------------");

        // Quick Quiz 1 : WAP to print first n natural numbers using a for loop?
        for(int i = 0; i <= 10; i++)
        {
            if(i % 2 != 0)
            {
                System.out.println("First n odd number is : " + i);
            }
        }
        // 2*i = 2, 4, 6, 8 -> where n is natural number (even numbers)
        // 2*i+1 = 3, 5, 7, 9 -> where n is natural number (odd numbers)

        System.out.println("--------------------------------");

        // Decrementing of for loop :
        System.out.println("Decrementing of for loop :");
        for(int i = 3; i != 0; i--)
        {
            System.out.println(i);
        }

        System.out.println("--------------------------------");

        // Quick Quiz 2 : WAP to print first n natural numbers in reverse order?
        int n;
        for(n = 6; n != 0; n--)
        {
            System.out.println("Reverse order : " + n);
        }
    }
}