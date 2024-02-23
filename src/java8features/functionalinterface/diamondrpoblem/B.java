package java8features.functionalinterface.diamondrpoblem;

public interface B {

    default void method1() {
        System.out.println("Inside B.method1()");
    }
}
