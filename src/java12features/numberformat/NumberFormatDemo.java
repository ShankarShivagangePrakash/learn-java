package java12features.numberformat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

    public static void main(String[] args) {

        Long number = 1000l;

        // this will give number format instance with default locale.
        NumberFormat numberFormat = NumberFormat.getCompactNumberInstance();

        // To actually format a number in this number format style.
        System.out.println(numberFormat.format(number));

        // Let's create number format object with different locales

        NumberFormat numberFormatUS = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        NumberFormat numberFormatChinese = NumberFormat.getCompactNumberInstance(Locale.CHINESE, NumberFormat.Style.SHORT);

        System.out.println("Number in US format: " + numberFormatUS.format(number));
        System.out.println("Number in Chinese format: " + numberFormatChinese.format(number));

        // change style to LOng instead of short
        numberFormatUS = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
        numberFormatChinese = NumberFormat.getCompactNumberInstance(Locale.CANADA, NumberFormat.Style.LONG);

        System.out.println("Number in US LONG number format: " + numberFormatUS.format(number));
        System.out.println("Number in Chinese LONG number format: " + numberFormatChinese.format(number));
    }
}
