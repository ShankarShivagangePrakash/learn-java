package exceptionhandling.reallifescenarios;

public class RecursiveError {

    public static void method1() {
        System.out.println("Method 1");
        method2();
    }

    public static void method2() {
        System.out.println("Method 2");
        method1();
    }

    public static void main(String[] args) {

        // In this program, method1 is invoked by main(),
        // then method 1 invokes method 2 -> method 2 again invokes method 1
        // function calls keep adding to stack, after stack is filled, it will throw the error.
        // In case of recursion having exit condition is must.
        method1();
    }
}
