package java8featureshandsonindepth.lambda;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        /**
         * Prior Java 8
         */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();

        //Java 8 - Lambda Syntax
        // since Runnable interface has only one abstract method, or it is a functional interface, use lambda to implement it and create object.
        Runnable runnableLambda = () -> {System.out.println("Inside Runnable 2");};

        // since we are having one line logic {} are not mandatory.
        Runnable runnableLambdaSimple = () -> System.out.println("Inside Runnable 3");

        // pass the Runnable object created using lambda to thread and start the thread.
        new Thread(runnableLambda).start();
        new Thread(runnableLambdaSimple).start();

        // Instead of creating object and passing to Thread put that logic inside the parameter while creating the object.
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 3");
            }
        }).start();

        // reduce the boilerplate in above code using lambda.
        new Thread(() -> System.out.println("Inside Runnable 4")).start();


    }
}
