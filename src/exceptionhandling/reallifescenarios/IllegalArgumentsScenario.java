package exceptionhandling.reallifescenarios;

import java.util.Scanner;

public class IllegalArgumentsScenario {

    public static void main(String[] args) {

        System.out.println("Enter two numbers");

        Scanner scanner = new Scanner(System.in);
        int a = 0; int  b = 0;

        //If user didn't enter number properly below code might throw error. or it is zero it would throw error.
        // Check that here itself
        a = Integer.parseInt(scanner.next());
        b = Integer.parseInt(scanner.next());

        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("Either a or b cannot be zero");
        }

        System.out.println( a / b);

    }
}
