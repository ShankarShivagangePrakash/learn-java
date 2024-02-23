package i18N;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {

    public static void main(String[] args) {

        Double d = 123456.1245;

        // Get Number format object by passing the locale of your choice, if you don't pass anything it will take Local.US by default
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.FRANCE);
        // Number of decimal digits to be displayed
        numberInstance.setMinimumFractionDigits(4);

        // Below line will format double value local to France specific.
        System.out.println(numberInstance.format(d));

    }
}
