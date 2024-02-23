package i18N;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTimeTest {

    public static void main(String[] args) {

        Date date = new Date();

        // To get time instance
        DateFormat dateFormat = DateFormat.getTimeInstance();
        DateFormat dateFormat2 = DateFormat.getTimeInstance(0);

        System.out.println("Time format in default style: " + dateFormat.format(date));
        System.out.println("Time format in complete style: " + dateFormat2.format(date));

        // To get date time instance.
        DateFormat dateFormat3 = DateFormat.getDateTimeInstance();
        DateFormat dateFormat4 = DateFormat.getDateTimeInstance(0, 0);

        System.out.println("Date Time format in default style: " + dateFormat3.format(date));
        System.out.println("Date Time format in complete style: " + dateFormat4.format(date));
    }
}
