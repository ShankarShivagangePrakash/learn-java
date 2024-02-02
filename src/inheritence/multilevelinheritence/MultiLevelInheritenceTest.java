package inheritence.multilevelinheritence;

public class MultiLevelInheritenceTest {

    public static void main(String[] args) {

        Child child = new Child();

        child.f2(); //Child class method
        child.f1(); //Parent class method, available by inheritance

        child.hashCode(); //note: Java doesn't allow multiple inheritance means class A extends A, B is not allowed
        //so Class Child extends Parent, Java.lang.Object is not possible
        //still if i can access hashCode() method from Object class is because of multi level inheritance.
        //Class Parent has inherited Object class, class Child inherited Parent through which it is able to access Object class method via parent.

        //checking order of execution of constructors in case of multi-level inheritance.
        GrandChild grandChild = new GrandChild();
    }
}
