package codingproblems;

public class WordReversal {

    public static void main(String[] args) {

        String s = "Java is awesome!!";
        // output expected:
        // avaJ si !!emosewa

        //Solution:

        // split the string into word array using space as delimiter
        String[] s1 = s.split(" ");

        // stores output.
        String result = "";

        int i = 0;
        while (i < s1.length) {

            // iterate through each word in array, reverse and add space to differentiate.
            result += new StringBuffer(s1[i]).reverse().toString() + " ";
            i++;
        }

        // print, trim() to remove additional spaces.
        System.out.println(result.trim());

    }
}
