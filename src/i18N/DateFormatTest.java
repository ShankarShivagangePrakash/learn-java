package i18N;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

    public static void main(String[] args) {

        Date date = new Date();
        DateFormat dateFormat1 = DateFormat.getDateInstance();
        DateFormat dateFormat2 = DateFormat.getDateInstance(0, Locale.US);
        DateFormat dateFormat3 = DateFormat.getDateInstance(0, Locale.UK);

        System.out.println("Date in default format: " + dateFormat1.format(date));
        System.out.println("Date in US format: " + dateFormat2.format(date));
        System.out.println("Date in UK format: " + dateFormat3.format(date));
    }
}
