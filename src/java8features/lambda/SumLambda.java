package java8features.lambda;

import java8features.functionalinterface.Sum;

public class SumLambda {
    public static void main(String[] args) {
        Sum sum = (a, b) -> System.out.println("sum is: " + (a + b));
        sum.add(2,3);
    }
}
