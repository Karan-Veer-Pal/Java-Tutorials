// Day : 20 Exercise : 2 Rock, Paper & Scissors Game by Me

import java.util.Scanner;
import java.util.Random;

public class Java20
{
    public static void main(String[] args)
    {
        System.out.println("Lets Play the Rock, Paper, Scissors. This is 5 Match Series You need to win 3 Matches for wins the Series.");

        Scanner variable = new Scanner(System.in);
        Random random = new Random();

        // For Count :
        int draw_count = 0;
        int win_count = 0;
        int lose_count = 0;

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Choose & Enter 1 for *Rock, 2 for *Paper and 3 for *Scissors. || (rock-1/paper-2/scissors-3)");
            int user_input = variable.nextInt();


            //generate random integer with origin 1 to upper bound 4 ; means start from 1 to 4 but 4 is not included.
            //generate random integer between 1 to 4
            int check_rand = random.nextInt(1, 4);
            System.out.println("Computer choose : "+ check_rand);

            if(user_input == check_rand)
            {
                System.out.println("You choose the same thing so,");
                System.out.println("Draw the Match.");
                draw_count++;
            }
            else if(user_input < 1 || user_input > 3)
            {
                System.out.println("User entered INVALID Number You are Disqualified.");
                break;
            }
            else if(user_input == 1 && check_rand == 2)
            {
                System.out.println("You choose Rock and Bot choose Paper so,");
                System.out.println("You lose the Match.");
                lose_count++;
            }
            else if(user_input == 2 && check_rand == 3)
            {
                System.out.println("You choose Paper and Bot choose Scissors so,");
                System.out.println("You lose the Match.");
                lose_count++;
            }
            else if(user_input == 3 && check_rand == 1)
            {
                System.out.println("You choose Scissors and Bot choose Rock so,");
                System.out.println("You lose the Match.");
                lose_count++;
            }
            else
            {
                System.out.println("You win the Match.");
                win_count++;
            }
        }
        System.out.println("Total = You win " + win_count + " Matches and lose " + lose_count + " Matches and Total draw match is " + draw_count);
        if(win_count == lose_count)
        {
            System.out.println("Series is DRAW.");
        }
        else if(win_count > lose_count)
        {
            System.out.println("You WINS the Series.");
        }
        else
        {
            System.out.println("You LOSE the Series.");
        }
    }
}
