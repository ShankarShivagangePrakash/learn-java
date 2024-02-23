package regularexpressions.basic;

public class StringEmailValidator {

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

        String email = "Shankar@gmail.com";

        // Instead of creating pattern an matcher objects, String class provides the same functionality with less lines of code.
        if (email.matches("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9_.-]+$")) {
            System.out.println("valid email id");
        } else{
            System.out.println("invalid email id");
        }
    }
}
