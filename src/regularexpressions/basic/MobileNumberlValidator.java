package regularexpressions.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberlValidator {

    public static void main(String[] args) {

        /*
             If you use ^ (caret) symbol before square bracket at the beginning of regular expression
             it means that pattern should start with it contents inside the [] square bracket next to it.

             Similarly, $ symbol at the end after [] specifies pattern how pattern should end
             $ symbol says pattern should end with fields mentioned inside square bracket just before it.
         */
        /*
             In our case
             gmail should start with numbers and should be exactly 10 digits
         */

        Pattern pattern = Pattern.compile("^\\d{10}");
        Matcher matcher = pattern.matcher("1245675321");

        if (matcher.matches()) {
            System.out.println("valid Mobile number");
        } else{
            System.out.println("invalid mobile number");
        }
    }
}
