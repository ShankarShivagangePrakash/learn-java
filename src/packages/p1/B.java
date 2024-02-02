package packages.p1;

import packages.p1.subpackage.E;

public class B {
    public static void main(String[] args) {

        A.a1(); //directly accessible because it is a static method inside the same package.
        //But note you didn't add any import statement, because B is the same package where A is there.

        A obj = new A();
        obj.a2();

        E e = new E();//even for classes inside the subpackage, you need to import it.
        e.e1();
    }
}
