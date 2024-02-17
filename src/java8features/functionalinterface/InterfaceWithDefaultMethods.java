package java8features.functionalinterface;

public interface InterfaceWithDefaultMethods {

    default void method1() {
        System.out.println("Inside InterfaceWithDefaultMethods");
    }
}
