package java8featureshandsonindepth.imperativevsdeclarative;

import java.util.stream.IntStream;

/*
    Sum of numbers from 0 to 100
 */
public class ImperativeVsDeclarativeExample1 {

    public static void main(String[] args) {

        // sum of integers for the range from 0 to 100
        /**
         * Imperative Style - how style of programming
         *
         * Advantage:
         *          Easy to write code
         *          Easy to test
         *
         * Disadvantage:
         *          We usually have mutable variable (int sum), which will not work properly in multithreaded environment.
         *          Need to read code line by line to understand, if logic is big it is headache.
         *          boilerplate code
         *
         */
        int sum=0;
        for(int i=0;i<=100;i++){
                sum+=i; // shared mutable state and its sequential anf it will go step by step
                    // and it will have issues if we try to run the code in multithreaded environment
        }
        System.out.println("Sum using imperative approach is : "+sum);


        /**
         * Declarative style. (Functional programming uses the same style)
         * Advantage:
         *      Focus on result,
         *      You let the system do the job for you and get the result using built in libraries.
         */
        int sum1= IntStream.rangeClosed(0,100)
                //.parallel()
                //.map(Integer::new)
                .sum();

        System.out.println("sum using declarative approach is : " + sum1);

    }

}
