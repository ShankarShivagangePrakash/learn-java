package innerclasses.nonstaticinnerclass;

import innerclasses.staticinnerclass.OuterClass;

public class Outer {

    public void f1() {
        System.out.println("Inside Outer clas non static method f1()");
    }

    class Inner {

        /* creating non-static methods inside non-static inner class is not allowed.
        static f3() {
        }*/

        public void f2() {
            System.out.println("Inside Inner class non static method f2()");
        }
    }

    public static void main(String[] args) {

        //Creating Outer class instance
        Outer outer = new Outer();
        // Invoke Outer class non static method
        outer.f1();

        //Create Inner class object using Outer class object
        Outer.Inner inner = outer.new Inner();
        //invoking inner class non-static method
        inner.f2();
    }

}
