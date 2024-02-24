package java16features.datetime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatDemo {

    public static void main(String[] args) {

        // Let's create time object using LocalTime
        LocalTime time = LocalTime.parse("11:30:25.1324");

        // Let's create object of DateTimeFormat, which represents time as hour (Morning/evening/afternoon)
        // example time is 13:45 will be displayed as 1 in the afternoon
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h B");
        // B here stands for evening/afternoon/morning
        // h hours in the time

        System.out.println(time.format(formatter));
    }
}
