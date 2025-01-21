// Day : 97 The Date Class

import java.sql.SQLOutput;
import java.util.Date;

public class Java97
{
    public static void main(String[] args)
    {
        // Quick Quiz : Is it safe to store the no of ms in a variable of type long
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());

        System.out.println();

        Date d = new Date();
        System.out.println("Current Date = " + d);

        System.out.println("Time = " + d.getTime());
        System.out.println("Date = " + d.getDate());
        System.out.println("Second = " + d.getSeconds());
        System.out.println("Year = " + d.getYear()); // Returns a value that is the result of subtracting 1900 from the year
        // that contains or begins with the instant in time represented by this Date object, as interpreted in the local time zone.
    }
}
