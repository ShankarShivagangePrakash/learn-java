package packages.p1;

public class B {
    public static void main(String[] args) {

        A.a1(); //directly accessible because it is a static method inside the same package.
        //But note you didn't add any import statement, because B is the same package where A is there.

        A obj = new A();
        obj.a2();
    }
}
