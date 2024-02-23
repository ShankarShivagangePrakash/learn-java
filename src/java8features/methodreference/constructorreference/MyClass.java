package java8features.methodreference.constructorreference;

public class MyClass {

    private String name;

    MyClass(String name) {
        this.name = name;
        System.out.println("Inside constructor: " + name);
    }
}
