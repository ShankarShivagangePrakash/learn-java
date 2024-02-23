package java8features.lambda;

import java8features.functionalinterface.InterfaceWithDefaultMethods;

public class InterfaceWithDefaultMethodsTest implements InterfaceWithDefaultMethods {

    public static void main(String[] args) {

        // since this class has implemented interface we can create object of this class and invoke default method of the interface.
        InterfaceWithDefaultMethods interfaceWithDefaultMethods = new InterfaceWithDefaultMethodsTest();
        interfaceWithDefaultMethods.method1();
    }
}
