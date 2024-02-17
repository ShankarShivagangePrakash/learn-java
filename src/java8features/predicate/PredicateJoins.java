package java8features.predicate;

import java.util.function.Predicate;

public class PredicateJoins {

    public static void main(String[] args) {

        int[] x = {10, 20, 25, 28, 30, 40, 50, 76, 80};

        Predicate<Integer> p = (i) -> {
            return (i > 10);
        };

        // Here we are passing predicate to a method.
        method1(p, x);

    }

    public static void method1(Predicate<Integer> p, int[] x) {
        for (int eachElement : x) {
            // by using predicate object, we are invoking test() of predicate class for every object of the array.
            System.out.println(p.test(eachElement));
        }

    }
}
