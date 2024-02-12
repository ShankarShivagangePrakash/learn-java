package stringhandling;

public class StringMethods {

    public static void main(String[] args) {

        String s1 = "Hello World";

        //Length of the string
        System.out.println("Length of the string: " + s1.length());

        //index of a particular character in string
        System.out.println("Index of a character in string: " + s1.indexOf('e'));

        // find the character at a given index
        System.out.println("Character at a given index: " + s1.charAt(2));

        //get substring
        System.out.println("Substring with beginning index: " + s1.substring(2));
        System.out.println("Substring with beginning index and end index: " + s1.substring(2, 5));

        //split the string based on regex pattern
        String[] s2 = s1.split(" ");
        for (int i = 0; i < s2.length; i++) {
            System.out.println(s2[i]);
        }

        //replace all characters with new character
        System.out.println("string replace: " + s1.replace('l', 'k'));

        //To upper and to lower
        System.out.println("To upper case: " + s1.toUpperCase());
        System.out.println("To lower case: " + s1.toLowerCase());

    }
}
