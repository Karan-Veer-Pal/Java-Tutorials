// Day : 22 Do-While Loop : First perform the code then check the condition

public class Java22
{
    public static void main(String[] args)
    {
        int i = 0;
        do
        {
            System.out.println("Demonstration of do-while loop = " + i);
            i++;
        }while(i < 5);

        System.out.println("-----------------------------------");

        System.out.println("First perform the code then check the condition; here condition is false but the do-while loop code's run at least one time.");
        int j = 10;
        do
        {
            System.out.println(j);
        }while(j < 5);

        System.out.println("-----------------------------------");

        // Quick Quiz : WAP to print first n natural numbers using do-while loop?
        int num = 1;
        do
        {
            System.out.println("First n natural number = " + num);
            num++;
        }while(num <= 10);
    }
}
