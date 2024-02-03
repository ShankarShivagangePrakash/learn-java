package exceptionhandling.demo;

public class NullPointerExceptionDemo {
    static ExceptionDemo exceptionDemo;

    public static void main(String[] args) {
        //below line will throw null pointer exception,
        // cause, exceptionDemo is not instantiated and you are trying to access a method in that class.
       NullPointerExceptionDemo.exceptionDemo.method1();
    }
}
