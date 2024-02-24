package java13and14features.switchexpressions;

public class SwitchExpressionDemo {

    public static void main(String[] args) {

        // Switch with case
        int input = 1;
        int a = 1;
        int b = 2;
        int c = 0;

        String switchWithCaseResponse = switch (input) {
            case 1:
                c = a + b;
                yield "choice 1 is for Addition: " + c;

            case 2:
                c = a - b;
                yield "Choice 2 is for subtraction: " + c;

            default:
                yield "invalid choice";

        };

        System.out.println("Switch with case output for input 1: " + switchWithCaseResponse);


    }
}
