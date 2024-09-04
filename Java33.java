// Day : 33 Variable Arguments

public class Java33
{
    static int sum1(int a, int b)
    {
        return a+b;
    }
    static int sum2(int ...arr) // It is like an array; Available as int [] arr
    {
        int add = 0;
        for(int element : arr)
        {
            add += element;
        }
        return add;
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to VarArgs Tutorial!");
        System.out.println("The sum of 4 and 5 is = " + sum1(4,5));
        // System.out.println("The sum of 4, 3 and 5 is = " + sum1(4,3, 5)); it give an error, because method is only take 2 arguments
        // So we solve this problem by using VarArgs

        System.out.println("");

        // By using VarArgs
        System.out.println("By using VarArgs : ");
        System.out.println("The sum of 1 and 2 is = " + sum2(1,2));
        System.out.println("The sum of 1, 2 and 3 is = " + sum2(1,2,3));
        System.out.println("The sum of 1, 2, 3 and 4 is = " + sum2(1,2,3,4));
        System.out.println("The sum of 1, 2, 3, 4 and 5 is = " + sum2(1,2,3,4,5));
        System.out.println("The sum of 1, 2, 3, 4, 5 and 6 is = " + sum2(1,2,3,4,5,6));
        System.out.println("The sum of 1, 2, 3, 4, 5, 6 and 7 is = " + sum2(1,2,3,4,5,6,7));

        System.out.println("The sum of Nothing is = " + sum2());
    }
}
