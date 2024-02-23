package java8features.lambda;

import java8features.functionalinterface.A;

public class LambdaDemo {

    public static void main(String[] args) {

        /* Instead of creating a new class and implementing the method1()
         with lambda we can do that with less lines of code
         since in functional interface there is only one abstract method which we need to implement
         () -> specifies that we are providing implementation for that abstract method of interface A
         if that method was expecting any parameters () would have that parameters -> rest of the thing is the logic we are providing*/
        A a = () -> System.out.println("Inside method1");
        // finally invoke the method
        a.method1();

    }
}
