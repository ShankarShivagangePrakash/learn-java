package java11features;

import java.util.List;
import java.util.stream.Collectors;

public class StringUpdates {

    public static void main(String[] args) {

        String a = "     abcd";
        // empty string
        String b = "";
        // string with one space.
        String c = " ";
        // string with a lot of white spaces.
        String d = "     ";

        // isBlank() will identify above all cases
        System.out.println("Is String blank? a = " + a.isBlank());
        System.out.println("Is String blank? b = " + b.isBlank());
        System.out.println("Is String blank? c = " + c.isBlank());
        System.out.println("Is String blank? d = " + d.isBlank());

        // string.lines()
        // This method will split the string based on \n character and returns a stream object
        // we can store that stream to list after processing.
        String e = "abcd\nefgh\njklmn";
        List<String> list = e.lines().collect(Collectors.toList());

        System.out.println("\nString:\n" + e);
        System.out.println();
        System.out.println("String converted to list:\n" + list);

        // In early versions, string.trim() will not trim if white space is represented as unicode
        // But in new version trim() will remove unicode white spaces also.
        // string.strip() can trim unicode and normal white space also
        String f = "\u0020Hi how are you?\u0020";
        System.out.println(f);
        System.out.println("eliminate white space using trim(): \n" + f.trim());
        System.out.println("eliminate white space using strip(): \n" + f.strip());

    }
}
