package regularexpressions.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcher {

    public static void main(String[] args) {

        String value = "abcdfdfsfabcfdfwteabcwer";

        // compile takes the regular expression and returns the pattern object.
        // In our case we need to match pattern abc
        Pattern pattern = Pattern.compile("abc");

        // Matcher accepts input and checks if the input string has the pattern or not?
        Matcher matcher = pattern.matcher(value);

        // find(0 returns true if there are occurrence for pattern in the input.
        while (matcher.find()) {

            // start() - starting index of the pattern in the input
            System.out.println("Starting index: " + matcher.start());

            // end() - end index of the pattern + 1 in the input
            System.out.println("last index + 1: " + matcher.end());

            // group() - pattern value from input
            System.out.println("pattern: " + matcher.group());
        }
    }
}
