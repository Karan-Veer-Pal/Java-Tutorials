// Day : 98 The Calendar Class

import java.util.Calendar;
import java.util.TimeZone;

public class Java98
{
    public static void main(String[] args)
    {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType() + " Calendar Type.");

        System.out.println("Time Zone = " + c.getTimeZone().getID());

        System.out.println();

        Calendar d = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singaore"));
        System.out.println(d.getCalendarType() + " Calendar Type.");

        System.out.println("Time Zone = " + d.getTimeZone().getID());


    }
}
