// Day : 24 Break & Continue

public class Java24
{
    public static void main(String[] args)
    {
        // break and continue using loops!

        // break :
        System.out.println("Break Demonstration : ");
        for(int i = 0; i < 5; i++)
        {
            System.out.println(i);
            System.out.println("Java is Great!");
            if(i == 2)
            {
                System.out.println("Ending the loop!");
                break; // break executing the code and go outside the block
            }
        }

        System.out.println("--------------------------------------");

        // continue :
        System.out.println("Continue Demonstration : ");
        for(int i = 0; i < 5; i++)
        {
            if(i == 2)
            {
                System.out.println("When i == 2 then don't print the next line of code, go back to next iteration; means stop run for 2 and start run for 3 or next!");
                continue; // continue tells skip the new line of code, return the update the next iteration.
            }
            System.out.println(i);
            System.out.println("Java is Great!");
        }
    }
}

// Mostly break statement used in switch-case statement!
