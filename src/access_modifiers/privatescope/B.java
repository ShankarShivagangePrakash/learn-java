package access_modifiers.privatescope;

public class B {
    public static void main(String[] args) {
        A obj = new A();
        // System.out.println(obj.a); //since a is a private variable in class A it cannot be access outside the class and this line gives syntax error.
        System.out.println(obj.b); // no access specifier, so can be accessed in other classes of same package.
        System.out.println(obj.d); //protected can be accessed in the package.
        System.out.println(obj.d); //public, can be accessed from anywhere.
    }
}
