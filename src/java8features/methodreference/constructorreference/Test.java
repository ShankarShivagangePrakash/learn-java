package java8features.methodreference.constructorreference;

public class Test {

    public static void main(String[] args) {

        // First do it using lambda expression
        // when get() method is invoked below logic will be implemented. this logic will internally invoke constructor.
        MyInterface i = s -> new MyClass(s);
        i.get("Using lambda");

        // Let's do the same thing using Constructor reference.
        // Here my need is when we invoke get(), we need to create object and invoke the constructor
        // To do that just say ClassName::new
        MyInterface myInterface = MyClass::new;
        myInterface.get("Using Constructor reference");
    }
}
