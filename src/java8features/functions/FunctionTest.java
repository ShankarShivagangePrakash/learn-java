package java8features.functions;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {

        /*Function<String, Integer> function = (s)->{
            return s.length();
        };*/

        // the same lambda logic can be written in one line as below
        // s first character is the input, logic after s.length() is the implementation and the result will be returned back.
        Function<String, Integer> function = s-> s.length();

        // apply method is the abstract method of Function interface
        // we need to invoke that method for the above logic to execute.
        System.out.println(function.apply("ABC"));
        System.out.println(function.apply("ABCDEFG"));
    }
}
