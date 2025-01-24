// Day : 100 Java.Time API

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Java100
{
    public static void main(String[] args)
    {
        LocalDate ld = LocalDate.now();
        System.out.println("Local Date = " + ld);

        LocalTime lt = LocalTime.now();
        System.out.println("Local Time = " + lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Local Date & Time = " + ldt);


    }
}
