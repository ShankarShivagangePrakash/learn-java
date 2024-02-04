package exceptionhandling.methods.runtimeexception.trycatch;

import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        int a, b, c;
        a = b = c = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        try {
            //If a or b value is provided as alphabet characters, it throws number format exceptions.
            a = Integer.parseInt(scanner.next());
            b = Integer.parseInt(scanner.next());
        } catch (NumberFormatException e) {
            System.out.println("enter number properly");
        }
        //Finally block executes even if try block fails to execute completely, () and when try block successfully executes.
        // It is usually used to free the resources, like jdbc connection or some hardware connection.
        finally {
            System.out.println("Executing finally block");
        }

        try {
            // if b is 0, division fails and programs stops with an exception. Arithmetic exception
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("second number cannot be zero");
        }

        //array index out of bounds exception
        int[] arr = {10, 20, 30};

        System.out.println("Elements of the array are:");

        try {
            //we are trying to go beyond the array size, it will throw array index out of bounds exception.
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }

        System.out.println(c);
    }
}
