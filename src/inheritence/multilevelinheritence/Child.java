package inheritence.multilevelinheritence;

public class Child extends Parent{

    Child() {
        System.out.println("Child Constructor " + this);
    }

    public void f2() {
        System.out.println("Inside f2()");
    }
}
