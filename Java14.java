// Day : 14 String Methods

import java.sql.SQLOutput;

public class Java14
{
    public static void main(String[] args)
    {
        String name = "Karan";
        System.out.println(name);

        // length() :
        System.out.println("Length = " + name.length());

        // toLowerCase() :
        System.out.println("toLowerCase = " + name.toLowerCase());

        // toUpperCase() :
        System.out.println("toUpperCase = " + name.toUpperCase());

        // trim() :
        String nonTrimString = "     Karan     ";
        System.out.println("Non Trim String = " + nonTrimString);
        System.out.println("Trimmed String = " + nonTrimString.trim());

        // substring(int start(index)) :
        System.out.println("substring = ");
        System.out.println(name.substring(2));
        System.out.println(name.substring(3));
        System.out.println(name.substring(4));

        System.out.println(name.substring(0)); // substring(0) is redundant because if we want to return the full string then simply call by string name

        // substring(int start_index, int end_index) :
        System.out.println(name.substring(1,4));
        System.out.println(name.substring(1,5));
        System.out.println(name.substring(0,5));

        // replace('char'/"string", 'char'/"string") :
        System.out.println("Replace = ");
        System.out.println(name.replace('K', 'T')); // It replace all the occurnces
        System.out.println(name.replace("aran", "odex"));
        System.out.println(name.replace("a", "odex"));

        // startsWith('Starting_Char'/"Starting_String") :
        System.out.println("Name start with Ka = " + name.startsWith("Ka"));
        System.out.println("Name start with Ta = " + name.startsWith("Ta"));

        // endsWith('End_Char'/"End_String") :
        System.out.println("Name end with an = " + name.endsWith("an"));
        System.out.println("Name end with ar = " + name.endsWith("ar"));

        // charAt(index) :
        System.out.println("Name at 2 index = " + name.charAt(2));
        System.out.println("Name at 3 index = " + name.charAt(3));
        System.out.println("Name at 4 index = " + name.charAt(4));

        // indexOf(char/string) : start finding by the starting
        System.out.println("Index on n = " + name.indexOf("n"));
        System.out.println("Index on ar = " + name.indexOf("ar")); // return first's occurence index

        // indexOf(char/string, index) : means giving index to start find the chat/string after the given starting index
        System.out.println("Index on n = " + name.indexOf("n", 3));
        System.out.println("Index on ra = " + name.indexOf("ra", 1)); // return first's occurence index
        System.out.println("Index on Har = " + name.indexOf("Har", 1)); // when the given index is not found then return the -1

        // lastIndexOf(char/string) : start finding by the end
        System.out.println("Return last index of the string : ran = " + name.lastIndexOf("ran"));

        // lastIndexOf(char/string, index) : start finding by the end
        System.out.println("Return last index of the string : ran = " + name.lastIndexOf("ran", 3)); // start search between 0 to 3 index / start search after 3

        // equals("Full_Stirng") :
        System.out.println("Name is equal to Karan = " + name.equals("Karan"));
        System.out.println("Name is equal to Harsh = " + name.equals("Harsh"));
        System.out.println("Name is equal to karan = " + name.equals("karan")); // Case Sensitive

        // equalsIgnoreCase("Full_string") :
        System.out.println("Name is equal to karAn = " + name.equalsIgnoreCase("karAn")); // Ignore the case sensitivity

        // Escape Sequence Characters :
        System.out.println("I am Escape Sequence \"Double Quote\" Characters."); // -> for Double Quote : \" or \' for single quote
        System.out.println("I am Escape Sequence \\Back Slash\\ Characters."); // -> for Back Slash : \\
        System.out.println("I am Escape Sequence \n New Line Characters."); // -> for New Line : \n
        System.out.println("I am Escape Sequence \t Tab Characters."); // -> for Tab : \t


    }
}
