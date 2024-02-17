package java8features.predicate;

import java.util.function.Predicate;

public class PredicateJoins {

    public static void main(String[] args) {

        int[] x = {10, 20, 25, 28, 30, 40, 50, 76, 80};

        // checks whether the number is greater than 10 or not?
        Predicate<Integer> p = (i) -> {
            return (i > 10);
        };

        // checks whether the number is even or not?
        Predicate<Integer> p2 = (i)->{
            return (i%2 == 0);
        };

        // Here we are passing predicate to a method.
        System.out.println("Numbers greater than 10:");
        method1(p, x);

        System.out.println("Even numbers:");
        method1(p2, x);

        System.out.println("Numbers less than 10 using Predicate negate()");
        //predicate p checks for numbers greater than 10, apply negate() on it, you will get numbers less than 10
        method1(p.negate(), x);

        System.out.println("Numbers greater than 10 an even:");
        // predicate p checks for number greater than 10
        // predicate p2 checks for number is even or not
        // apply both to get the result we are looking for
        method1(p.and(p2), x);

        System.out.println("number greater than 10 or even");
        method1(p.or(p2), x);
    }

    public static void method1(Predicate<Integer> p, int[] x) {
        for (int eachElement : x) {
            // by using predicate object, we are invoking test() of predicate class for every object of the array.
            System.out.println(p.test(eachElement));
        }

    }
}
