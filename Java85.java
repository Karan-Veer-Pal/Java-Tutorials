// Day : 85 Finally Block

// Finally Block simple means executed the finally part by hook and crook

public class Java85
{
    public static int greet85()
    {
        try
        {
            int a = 50;
            int b = 10;
            int c = a/b;
            return c; // In this line we write to return here but after this return finally block will be executed.
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        // Without finally block This is the end of the function! - This line is not executed
        finally
        {
            System.out.println("This is the end of the function!");
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int k = greet85();
        System.out.println(k);

        int x = 7;
        int y = 9;
        while(true)
        {
            try
            {
                System.out.println(x/y);
            }
            catch(Exception e)
            {
                System.out.println(e);
                break;
            }
            finally
            {
                System.out.println("I am finally for value of y = " + y);
            }
            y--;
        }

        // Only try is not valid by we use try with finally block
        try
        {
            System.out.println(50/10);
        }
        finally
        {
            System.out.println("Yes this is finally block!");
        }
    }
}
