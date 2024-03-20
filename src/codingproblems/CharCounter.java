package codingproblems;

import java.util.HashMap;

public class CharCounter {

    public static void main(String[] args) {

        String s = "I am the creator of my destiny";

        HashMap<Character, Integer> map = new HashMap<>();

        int i = 0;

        while (i < s.length()) {

            char currentChar = s.charAt(i);

            /*
            //If there is an entry in map for that character just increment
            if (map.containsKey(currentChar)) {
                map.put(currentChar, map.get(currentChar) + 1);
            }
            // else add entry with counter as 1
            else {
                map.put(currentChar, 1);
            }*/

            // above logic combined into 1 line, if there is a value get that, else get the default value
            // when there is no entry for a character in map, default value 0 will come we add + 1 to it and add to map
            // normal case, value will come add 1 to it and put to map
            if(currentChar != ' ') {
                map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
            }

            i++;
        }

        System.out.println(map);
    }
}
