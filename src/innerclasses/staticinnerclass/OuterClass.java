package innerclasses.staticinnerclass;

public class OuterClass {

    static void f1() {
        System.out.println("Outer class static method");
    }

    static class Inner {

        static void f2() {
            System.out.println("Inner class static method");
        }

        public void f3() {
            System.out.println("Inside static inner class not static method");
        }
    }

    public static void main(String[] args) {
        OuterClass.f1();

        //Invoking Inner class static method.
        OuterClass.Inner.f2();

        //To invoke static inner class, non static method, you need to create object of the inner class.
        OuterClass.Inner inner = new OuterClass.Inner();
        inner.f3();
    }
}
