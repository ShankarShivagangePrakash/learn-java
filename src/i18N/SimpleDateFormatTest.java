package i18N;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

    public static void main(String[] args) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm/dd/yyyy");
        // formats the date in mm/dd/yyyy as mentioned above
        // Note: format will return string representation of the date.
        String format = simpleDateFormat.format(new Date());
        System.out.println( "String format: " + format);

        // To convert string representation of date to date object.
        String dateAsString = "19-12-2023";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd-mm-yyyy");
        try {
            Date date1 = simpleDateFormat1.parse(dateAsString);
            System.out.println("Date object: " + date1);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        // Date format with time
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("mm/dd/yyyy hh:mm:ss");
        System.out.println( "String format of date and time: " + simpleDateFormat2.format(new Date()));
    }
}
