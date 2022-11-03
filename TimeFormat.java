package src;

import java.util.*;

public class TimeFormat {

    public static String DisplayDateTime() {                        // Used to determine the time of day. Is called on in the final message constructed.
            GregorianCalendar time = new GregorianCalendar();
            int hour = time.get(Calendar.HOUR_OF_DAY);
            String greet;
            if (hour < 12)
                greet = ("Good Morning");
            else if (hour < 17 && !(hour == 12))
                greet = ("Good Afternoon");
            else
                greet = ("Good Evening");
        return greet;
        }
    }
