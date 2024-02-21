package regularexpressions.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    public static void main(String[] args) {

        /*
             If you use ^ (caret) symbol before square bracket at the beginning of regular expression
             it means that pattern should start with it contents inside the [] square bracket next to it.

             Similarly, $ symbol at the end after [] specifies pattern how pattern should end
             $ symbol says pattern should end with fields mentioned inside square bracket just before it.
         */
        /*
             In our case
             gmail should start with any of these characters [a-zA-Z0-9_.-] that is achieved by ^[a-zA-Z0-9_.-]
             after that we need @ symbol, achieved by +@
             then it should end with [a-zA-Z0-9_.-] achieved using [a-zA-Z0-9_.-]+$
         */

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9_.-]+$");
        Matcher matcher = pattern.matcher("Shankar@gmail.com");

        if (matcher.matches()) {
            System.out.println("valid email id");
        } else{
            System.out.println("invalid email id");
        }
    }
}
