package java12features.stringfeatures;

public class StringFeaturesDemo {

    public static void main(String[] args) {

        String s1 = "  All power is within you";

        /*
            indent(int n) - will add or remove specified number of white spaces
                            if n is positive it will add n no of white spaces to the beginning of the string.
                            if n is negative it will try to remove that many white spaces from the beginning of the string, if those many spaces exists
                                else it will ignore and try to remove as much white spaces exists at the beginning of the string.
         */
        System.out.println("\nAfter removing indent:" + s1.indent(-5));// there are only 2 spaces in string s1, but we are trying to remove 5 spaces. so it will remove 2 and ignore.
        System.out.println("After adding indent:" + s1.indent(5));// adds 5 spaces to the beginning of the string s1.


        String s2 = "10";

        //If you want to invoke any method on a string, you can do that using transform
        // best part is method reference is allowed. Because it accepts Functions.
        Integer value = s2.transform(Integer::parseInt);

        System.out.println("Integer value: " + value);
    }
}
