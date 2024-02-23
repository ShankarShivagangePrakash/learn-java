package java8features.functionalinterface.diamondrpoblem;

public interface C {

    default void method1() {
        System.out.println("Inside C.method1()");
    }
}
