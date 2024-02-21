package regularexpressions.basic;

import java.util.regex.Pattern;

public class CharactersAndQuantifiers {

    public static void main(String[] args) {

        // Pattern.matchers() first parameter - regular expression, second parameter input

        // returns tru as a contains either a or b or c
        System.out.println(Pattern.matches("[abc]", "a"));

        // returns false, since either a or b or c can occur not more than 1
        System.out.println(Pattern.matches("[abc]", "ab"));

        // returns true, since a character can occur zero or one time
        System.out.println(Pattern.matches("[abc]?", "a"));

        // returns true, since a character can occur more than once
        System.out.println(Pattern.matches("[abc]+", "aa"));
        System.out.println(Pattern.matches("[abc]+", "ab"));

        // returns true, since a character can occur more than once
        System.out.println(Pattern.matches("[abc]*", "aabc"));
        System.out.println(Pattern.matches("[abc]*", ""));

        // meta characters

        // digit
        System.out.println(Pattern.matches("\\d", "0"));
        // not digit
        System.out.println(Pattern.matches("\\D", "a"));

        // allow all characters from a to z and numbers from 0 to 9, but only 5 characters this is done using {5}
        // {} represents the number of characters
        System.out.println(Pattern.matches("[a-zA-Z0-9]{5}", "test1"));

        // alphanumeric with minimum 2 and max 5 characters
        System.out.println(Pattern.matches("[a-zA-Z0-9]{2,5}", "te"));

    }
}
