package java8features.predicate;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        Predicate<Integer> predicate = (i) -> {
            return (i > 20);
        };

        // To test invoke that functional method of Predicate
        System.out.println(predicate.test(15));
        System.out.println(predicate.test(20));
        System.out.println(predicate.test(25));
    }
}
