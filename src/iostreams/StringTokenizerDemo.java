package iostreams;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

    public static void main(String[] args) {

        String s = "hello,how,are,you?";

        StringTokenizer stringTokenizer = new StringTokenizer(s, ",");

        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
