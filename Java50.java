// Day : 50 Exercise : 3 Guess the Number Game : Solution by Tutor :

import java.io.FilterOutputStream;
import java.util.Scanner;
import java.util.Random;

class Game
{
    public int number;
    public int userInputNumber;
    public int noOfGuesses = 0;

    public void setNoOfGuesses(int num)
    {
        this.noOfGuesses = num;
    }
    public int getNoOfGuesses()
    {
        return noOfGuesses;
    }

    Game()
    {
        Random randNum = new Random();
        this.number = randNum.nextInt(1,10);
    }

    void takeUserInput()
    {
        System.out.println("Guess the Number between 1 to 10 : ");
        Scanner variable = new Scanner(System.in);
        userInputNumber = variable.nextInt();
    }

    boolean isCorrectNumber()
    {
        noOfGuesses++;
        if(userInputNumber == number)
        {
            System.out.format("Yes! You guessed the number right, it was %d You guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if (userInputNumber < number)
        {
            System.out.println("Your Guess is too low! Please Guess the High Number : ");
        }
        else if (userInputNumber > number)
        {
            System.out.println("Your Guess is too high! Please Guess the Low Number : ");
        }
        return false;
    }
}

public class Java50
{
    public static void main(String[] args)
    {
        /*
            Create a class Game, which allows a user to play "Guess the Number" game once. Game should have the following methods:
            1. Constructor to generate the random number.
            2. takeUserInput() to take a user input of number.
            3. isCorrectNumber() to detect whether the number entered by the user is true.
            4. getter and setter for noOfGuesses
            Use properties such as nOfGuesses(int), etc to get this task done!
        */

        Game g = new Game();
        boolean b = false;
        while(!b)
        {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }

    }
}