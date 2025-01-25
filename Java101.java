// Day : 101 Java.Time DateFormatter

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Java101
{
    public static void main(String[] args)
    {
        LocalDateTime ldt = LocalDateTime.now(); // This is date.
        System.out.println("Local Date Time = " + ldt);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // This is a format.
        String myDate1 = ldt.format(dtf1); // Creating date string using date and format.
        System.out.println("After Format = " + myDate1);

        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_DATE; // This is a format.
        String myDate2 = ldt.format(dtf2); // Creating date string using date and format.
        System.out.println("After Format = " + myDate2);

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E"); // This is a format.
        String myDate3 = ldt.format(dtf3); // Creating date string using date and format.
        System.out.println("After Format = " + myDate3);

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("h:m:s a");

        String myDate4 = ldt.format(dtf4);
        System.out.println("After Format = " + myDate4);
    }
}
