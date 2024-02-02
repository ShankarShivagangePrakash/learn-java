package read_write_to_console_static_imports;

import java.util.Scanner;


//static methods imported, so parseInt and out.println can be used without className prefix
import static java.lang.Integer.parseInt;
import static java.lang.Math.sqrt;
import static java.lang.System.out;

public class AddTwoNumbers {

    public static void main(String[] args) {

        out.println("Enter two numbers");

        //System is a class available in java lang package to work with console, it provides ability to both read from console .in and write to console .out
        //in and out are the static members of System class, in is reading input from console, out to display output in the console.
        Scanner scanner = new Scanner(System.in);

        //scanner.next() will read the input line
        int num1 = parseInt(scanner.next());
        int num2 = parseInt(scanner.next());

        int result = num1 + num2;
        //writes/displays the output to console.
        out.printf("Addition of two numbers: %d\n", result);

        out.printf("Square root of result %f\n",sqrt(result));

    }
}
