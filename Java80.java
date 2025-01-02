// Day : 80 Exception Handling & Try Catch Block

public class Java80
{
    public static void main(String[] args)
    {
        int a = 6000;
        int b = 0;
        // Without try :
        // int c = a/b; // Here, exception occur because b is zero.
        // System.out.println("The result is : " + c);
        // End of the program is not print coz int c = a/b; is produce an exception
        // Then we used try catch block

        // Simply means try to run a code line, if exception is occur then catch the exception and print the exception.
        // try said : if we have done divide then print try block
        // catch said : if try not print then catch the exception and print the exception.

        // With try :
        try
        {
            int c = a/b;
            System.out.println("The result is : " + c);
        }
        catch(Exception e)
        {
            System.out.println("We failed to divide. Reason : ");
            System.out.println(e);
        }

        System.out.println("End of the Program!");

        // try catch block is protect from an unexpected interrupt.
    }
}
