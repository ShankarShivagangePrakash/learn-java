package java8features.optional;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        // Create empty optional object
        Optional<String> empty = Optional.empty();

        // to check optional is empty or not, means having some data or not?
        System.out.println("Is present: " + empty.isPresent());

        // create optional with some data
        Optional<String> data = Optional.of("Optional with data");
        System.out.println("Is present: " + data.isPresent());

        // get() - returns value of the Optional object, throws NoSuchElement exception if Optional object is empty
        System.out.println("Value: " + data.get());

        if(empty.isPresent())
            System.out.println("Value: " + empty.get());

        // streams filter() is available in Optional also.
        System.out.println(data.filter(s-> s.equals("Optional with data")));

        // orElse - returns value if available else returns the default value we specify
        System.out.println(empty.orElse("Default value"));

        // ifPresent() - if value is present then if performs the action we specify
        data.ifPresent(System.out::println);


    }
}
