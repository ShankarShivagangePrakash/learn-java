package exceptionhandling.demo;

import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {
        int a, b, c;

        Scanner scanner = new Scanner(System.in);
        //If a or b value is provided as alphabet characters, it throws number format exceptions.
        a = Integer.parseInt(scanner.next());
        b = Integer.parseInt(scanner.next());

        // if b is 0, division fails and programs stops with an exception. Arithmetic exception
        c = a / b;
        System.out.println(c);

        //array index out of bounds exception
        int arr[] = {10, 20, 30};

        System.out.println("Elements of the array are:");

        //we are trying to go beyond the array size, it will throw array index out of bounds exception.
        for(int i = 0; i <= arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    void method1() {
    }
}
