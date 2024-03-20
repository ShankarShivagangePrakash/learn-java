package codingproblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateCharactersFromString {

    public static void main(String[] args) {

        String s = "afadfbbfaed";

        // Approach1: use set, since it stores only unique element, but order is not guaranteed.
        Set<Character> uniqueCharacter = new HashSet<>();

        int i = 0;
        while (i < s.length()) {

            uniqueCharacter.add(s.charAt(i));
            i++;
        }

        String result = uniqueCharacter.stream().map(Objects::toString).collect(Collectors.joining());
        System.out.println("Answer using approach 1: " + result);

        //Approach 2: contains() - take more time but order maintained.
        ArrayList<Character> arrayList = new ArrayList<>();
        int j = 0;
        while (j < s.length()) {

            if (!arrayList.contains(s.charAt(j))) {
                arrayList.add(s.charAt(j));
            }
            j++;
        }
        String result2 = arrayList.stream().map(Objects::toString).collect(Collectors.joining());
        System.out.println("answer using approach 2: " + result2);
    }
}
