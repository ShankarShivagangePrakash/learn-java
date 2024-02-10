package innerclasses.staticinnerclass;

public class OuterClass {

    static void f1() {
        System.out.println("Outer class static method");
    }

    static class Inner {

        static void f2() {
            System.out.println("Inner class static method");
        }
    }

    public static void main(String[] args) {
        OuterClass.f1();

        //Invoking Inner class static method.
        OuterClass.Inner.f2();
    }
}
