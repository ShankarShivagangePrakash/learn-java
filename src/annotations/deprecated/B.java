package annotations.deprecated;

public class B {

    public static void main(String[] args) {

        // when you try to create object you get warning.
        A a = new A();
        a.myMethod();
        System.out.println(a);
    }
}
