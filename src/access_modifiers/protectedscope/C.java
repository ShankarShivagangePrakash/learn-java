package access_modifiers.protectedscope;

import access_modifiers.privatescope.A;

public class C extends A {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.d); //Only public variables can be accessed outside the package, for parent class object

        //To access protected variables, you need to create the object of the child class which inherits the parent class.
        C obj2 = new C();
        System.out.println(obj2.c);//Class A protected member variable accessed from child class.
        System.out.println(obj2.d);
    }
}
