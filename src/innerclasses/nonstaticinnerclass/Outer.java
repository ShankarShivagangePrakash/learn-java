package innerclasses.nonstaticinnerclass;

import innerclasses.staticinnerclass.OuterClass;

public class Outer {

    private static int x = 50;
    private int y;

    Outer() {
        this.y = 0;
    }

    Outer(int y) {
        this.y = y;
    }

    public void f1() {
        System.out.println("Inside Outer clas non static method f1()");
    }

    class Inner {

        /* creating non-static methods inside non-static inner class is not allowed.
        static f3() {
        }*/

        private int y;

        Inner() {
            this.y = 0;
        }

        Inner(int y) {
            this.y = y;
        }

        public void f2() {
            System.out.println("Inside Inner class non static method f2()");
            //Outer class static variable accessing is straight forward.
            System.out.println("Outer class static member X: " + Outer.x);
            //Outer class non-static variable should be accessed by specifying className.this.variableName
            System.out.println("Outer class non static member Y: " + Outer.this.y);
            //Inner class non static variable.
            System.out.println("Inner class non static member X: " + this.y);
        }
    }

    public static void main(String[] args) {

        //Creating Outer class instance
        Outer outer = new Outer();
        // Invoke Outer class non-static method
        outer.f1();

        //Create Inner class object using Outer class object
        Outer.Inner inner = outer.new Inner();
        //invoking inner class non-static method
        inner.f2();

        System.out.println("Accessing inner class and outer Class Static and non static variables");

        Outer outer1 = new Outer(80);
        Outer.Inner inner1 = outer1.new Inner(20);
        inner1.f2();

    }

}
