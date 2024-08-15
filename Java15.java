// Day : 15 Chapter : 03 Practice Set

import java.util.Scanner;

public class Java15
{
    public static void main(String[] args)
    {
        Scanner variable = new Scanner(System.in);

        // Qs1.) WAP to convert a string to lowercase?
        System.out.println("Program to convert the string into lowercase : ");

        String name1 = "KARAN VEER PAL";
        name1 = name1.toLowerCase(); // Update Variable
        System.out.println(name1);

        System.out.println("----------------------------------------");

        // Qs2.) WAP to replace spaces with underscores?
        System.out.println("Program to replace white spaces to underscores : ");

        String name2 = "i m karan veer pal __";
        System.out.println(name2.replace(" ", "_"));

        System.out.println("----------------------------------------");

        // Qs3.) WAP to fill in a letter template which looks like below : letter = "Dear <|name|>, Thanks a lot" :: Replace <|name|> with a String (so name)?
        System.out.println("Program to repalce the particular word : ");

        String letter1 = "Dear <|name|>, Thanks a lot";
        letter1 = letter1.replace("<|name|>", "Avinash"); // Update Variable
        System.out.println(letter1);

        System.out.println("----------------------------------------");

        // Qs4.) WAP to detect double and triple spaces in a string?
        System.out.println("Program to detect double and triple spaces in a string : ");

        String name3 = "i  m karan   veer  pal   ___";
        System.out.println("To find double spaces at which index = " + name3.indexOf("  "));
        System.out.println("To find triple spaces at which index  = " + name3.indexOf("   "));
        System.out.println("To find four spaces at which index  = " + name3.indexOf("    "));
        System.out.println("If string does not contain spaces the it return -1");

        System.out.println("----------------------------------------");

        // Qs5.) WAP to format the following letter using escape sequence characters. : letter = "Dear Karan, This Java Course is Nice. Thanks".?
        System.out.println("Program to formatting a text using escape sequence character : ");

        String letter2 = "Dear Karan, \nThis Java Course is Nice. \nThanks.";
        System.out.println(letter2);
    }
}
