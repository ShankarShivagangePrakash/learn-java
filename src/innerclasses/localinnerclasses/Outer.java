package innerclasses.localinnerclasses;

public class Outer {

    public void f1() {

        System.out.println("Inside Outer class f1()");

        class LocalInner {
            public void f2() {
                System.out.println("Inside Inner class f2()");
            }
        }

        //Invoking Local inner class non static method
        LocalInner localInner = new LocalInner();
        localInner.f2();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.f1();
    }
}
