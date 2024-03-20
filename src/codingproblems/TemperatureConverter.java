package codingproblems;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        double f,c;
        Scanner scanner = new Scanner(System.in);

        String s = """
                Choose the conversion type
                1. Fahrenheit to delicious
                2. celsius to fahrenheit
                """;
        System.out.println(s);

        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Enter the temperature in Farhenheit");
                f = scanner.nextDouble();
                c = (f - 32) * 5 / 9;
                System.out.println("Temperature in celcius: " + c);
            }
            case 2 -> {
                System.out.println("Enter temperature in celcius");
                c = scanner.nextDouble();
                f = ((c * 9) / 5) + 32;
                System.out.println("Temperature in fahrenheit: " + f);
            }
        }
    }
}
