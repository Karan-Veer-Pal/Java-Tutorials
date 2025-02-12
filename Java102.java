// Day : 102 Chapter : 15 Practice Set

import java.awt.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Java102
{
    public static void main(String[] args)
    {
        // Qs1.) Create an ArrayList and store names of 10 students inside it. Print it using a for-each loop?
        System.out.println("Program to make array list and print the data using for each loop : ");

        ArrayList<String> array = new ArrayList<>();
        array.add("Karan Veer Pal");
        array.add("Avinash");
        array.add("Prashant");
        array.add("Lokendra");
        array.add("Abhishek");
        array.add("Yogesh");
        array.add("Saurav");
        array.add("Jannat");
        array.add("Usra");
        array.add("Unnati");
        array.add("Harsh");

        for(Object student : array)
        {
            System.out.println("Student = " + student);
        }

        System.out.println("----------------------------------------");

        // Qs2.) Use the Date class in Java to print time in the following format : hour:minute:second?
        System.out.println("Program to print time with your customization :");

        Date now = new Date();
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        System.out.println("Formatted Time: " + timeFormat.format(now));
        System.out.println("Formatted Time = " + now.getHours() + ":" + now.getMinutes() + ":" + now.getSeconds()); // Deprecated

        System.out.println("----------------------------------------");

        // Qs3.) Repeat 2 using the calendar class?
        System.out.println("Program to repeat 2 using calendar class : ");

        Calendar c = Calendar.getInstance();
        System.out.println("Formatted Time = " + c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        System.out.println("----------------------------------------");

        // Qs4.) Repeat 2 using the java.time API?
        System.out.println("Program to repeat 2 using java.time API : ");

        LocalTime ld = LocalTime.now();
        System.out.println("Time = " + ld);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("h:m:s");
        String d = ld.format(dtf);
        System.out.println("Formatted Time = " + d);

        System.out.println("----------------------------------------");

        // Qs5.) Create a set in java. Try to store duplicate elements inside this set and verify that only one instance is stored?
        System.out.println("Program to make a set with duplicate element and make sure the single instance is showed : ");

        HashSet<Integer> hs = new HashSet();
        hs.add(1);
        hs.add(1); // Duplicate element
        hs.add(2);
        hs.add(2); // Duplicate element
        hs.add(3);
        hs.add(3); // Duplicate element
        hs.add(4);

        System.out.println("Without Duplicacy = " + hs);

        System.out.println("----------------------------------------");
    }
}
