// Day : 43 Exercise : 3 Guess the Number (OOPs Edition) : Solve by Me :

import java.util.Random;
import java.util.Scanner;

class Guess
{

    private int Random;
    Scanner variable = new Scanner(System.in);

    public void setRandom(int Rand)
    {
        Random = Rand;
//        System.out.println("Random Number = " + Random);
    }

    public void crossCheck()
    {
        int maxtries = 6;
        System.out.println("Guess the number in between 1 to 10");
        for(int i = 1; i <= maxtries; i++)
        {
            System.out.println("Turn = " + i);
            int Input = variable.nextInt();
            if(Random == Input)
            {
                System.out.println("Yes! You got right Number! in " + i + " Times!");
                break;
            }
            else if(Random > Input)
            {
                System.out.println("You Entered too Small number, Please Try Larger Number!");
            }
            else
            {
                System.out.println("You Entered too Large number, Please Try Smaller Number!");
            }
        }
    }
};

public class Java43
{
    public static void main(String[] args)
    {
        Random random = new Random();

        Guess obj = new Guess(); // Object Making

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("You have 6 Turns to found the number!");

        int check_rand = random.nextInt(1, 11); // Random Number Generator!
        obj.setRandom(check_rand);

        obj.crossCheck();
    }
}
