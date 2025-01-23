// Day : 99 Gregorian Calendar Class

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Java99
{
    public static void main(String[] args)
    {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println("Date =" + c.get(Calendar.DATE));
        System.out.println("Second =" + c.get(Calendar.SECOND));
        System.out.println("Hour =" + c.get(Calendar.HOUR));
        System.out.println("Time =" + c.get(Calendar.HOUR_OF_DAY) + ":" +c.get(Calendar.MINUTE) + ":" +c.get(Calendar.SECOND));

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println("2000 is a leap year or not = " + gc.isLeapYear(2000));
        System.out.println("2001 is a leap year or not = " + gc.isLeapYear(2001));

        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    }
}
