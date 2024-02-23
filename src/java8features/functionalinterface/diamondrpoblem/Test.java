package java8features.functionalinterface.diamondrpoblem;

public class Test implements B, C {

    // You have to override the common default method to avoid compilation error.
    @Override
    public void method1() {
        System.out.println("Inside Test.method1()");
    }
}
