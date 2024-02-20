package i18N;

import java.util.Locale;

public class LocaleTest {

    public static void main(String[] args) {

        Locale locale = Locale.getDefault();
        System.out.println("Local object info:\t country code: " + locale.getCountry() + "\tlanguage code: " + locale.getLanguage());
        System.out.println("Local object info:\t country name: " + locale.getDisplayCountry() + "\tlanguage name: " + locale.getDisplayLanguage());

        // set default locale
        Locale.setDefault(Locale.UK);

        String[] isoCountries = Locale.getISOCountries();

        String[] isoLanguages = Locale.getISOLanguages();



    }
}
