package java10features;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class VarKeyWordDemo {

    // var cannot be used to create class level variables
    // var c = "abc";

    public static void main(String[] args) {

        var a = 10;

        //Note: assigning var variable to null is not allowed
        // var b = null;

        // below line is not allowed, once var type variable is assigned a value, it cannot have value of different data type.
        // a = "abc";

        // other real time usage of var
        // var makes code more readable
        // In below code hash map is of type String holding list of strings,
        // that is shown in a simple way, even we can use var while iteration.
        var map = new HashMap<String, List<String>>();
        map.put("abc", Arrays.asList("abc, def"));

        for (var entry : map.entrySet()) {
            // returns the value of the key.
            System.out.println("key " + entry.getKey());
            System.out.println("value " + entry.getValue());
        }

    }

}
