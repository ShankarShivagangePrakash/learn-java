package java8featureshandsonindepth.lambda;


import java8featureshandsonindepth.data.Bike;
import java8featureshandsonindepth.data.Student;
import java8featureshandsonindepth.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FunctionalInterfaceWithStreamsAndLambda {

    public static void main(String[] args) {

        /*
               Consumer functional interface.
               Consumer functional interface will be used in forEach()
         */
        System.out.println("Consumer interface example using streams\n");
        // gets list of students.
        List<Student> studentList = StudentDataBase.getAllStudents();
        // Iterate through each student, print student name in upper case and student object
        // Note: when you use forEach(), if you pass single parameter to it, it uses Consumer interface the definition you give using lambda is for consumer interface accept() just an fyi.
        studentList.stream().forEach((student -> System.out.println(student.getName().toUpperCase() + ": " + student )));

        /*
            BiConsumer Functional interface.
            accepts two parameters and returns nothing.
            It is used in multiMap. but along with consumer.
         */
        System.out.println("\nBiConsumer interface example:\n");
        Bike bike = new Bike("Hero Honda", "2008");

        //Consumer accepts only one parameter, if we want to pass two values then we can use BiConsumer.
        BiConsumer<String, String> biConsumer  = (a, b) -> System.out.println(a + " ------> " +  b);
        // invoke biConsumer by invoking it's abstract method accept()
        biConsumer.accept(bike.getName(), bike.getModel());

        System.out.println("\nBiConsumer interface example in streams:\n");
        //BiConsumer usage in streams.
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        double percentage = .01;
        List<Double> evenDoubles = integers.stream()
                .<Double>mapMulti((integer, consumer) -> {
                    if (integer % 2 == 0) {
                        consumer.accept((double) integer * ( 1 + percentage));
                    }
                })
                .collect(Collectors.toList());
        System.out.println("BiConsumer example in streams: " + percentage);

        /*
            Predicate functional interface, accpets input and check the condition return true or false.
         */
        Predicate<Integer> predicate = (i) -> { return i%2 == 0; };
        System.out.println("Is 4 even? " + predicate.test(4));

        // predicate will be used when we use filter()
        List<Integer> evenNumbersList = IntStream.rangeClosed(0,10)
                .filter((i) -> i % 2 == 0)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("even numbers list: " + evenNumbersList);

        /*
            Function, functional interface
            Function interface has an abstract method which accepts single value and returns single value.
            map() uses it.
         */
        System.out.println("\nFunctional, function interface in streams\n");
        List<String> inputList = Arrays.asList("hi", "hello", "how");

        List<String> outputList = inputList.stream().map((s) -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(outputList);

        /*
            BiFunction, functional interface
            BiFunction interface accepts two inputs and produce one output
            reduce() uses BiFunction interface.
         */
        System.out.println("\nBiFunctional, function interface in streams\n");
        int sum = IntStream.range(5, 25).reduce(0, (a, b) -> a + b);
        System.out.println("Sum from 5 to 25 using reduce: " + sum);

        /*
            UnaryOperator Functional interface
            UnaryOperator is used when both input and output are of same type.
            iterate() uses it.

         */
        // initial value 0, second parameter is the unary operator input and output are same.
         System.out.println("\nUnary Operator, function interface in streams\n");
        Stream.iterate(0, n-> n+1)
                .limit(10)
                .forEach(i -> System.out.print(i + ","));

        /*
            Supplier Functional interface
            supplier functional inteface doesn't accept any input, but returns output.
            generate() method uses Supplier interface.
         */
        System.out.println("\nSupplier Operator, function interface in streams\n");
        // generates 5 random numbers.
        List<Integer> integerList = Stream.generate(new Random()::nextInt)
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(integerList);
    }
}
