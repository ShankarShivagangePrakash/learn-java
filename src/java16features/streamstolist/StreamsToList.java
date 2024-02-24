package java16features.streamstolist;

import java.util.Arrays;
import java.util.List;

public class StreamsToList {

    public static void main(String[] args) {

        List<String> ids = Arrays.asList("123", "456", "789");

        /* Convert strings list to integer list. After processing to store the result before java 16 we were using
         collect(Collectors.toList());
         List<Integer> integerIds = ids.stream().map(Integer::parseInt).collect(Collectors.toList());

         from java 16 there is no need to use .collect(Collectors.toList())
         we can directly use .toList() after processing.
         we can also use .toSet() or .toMap() directly.*/
        List<Integer> integerIds = ids.stream().map(Integer::parseInt).toList();

        System.out.println(integerIds);


    }
}
