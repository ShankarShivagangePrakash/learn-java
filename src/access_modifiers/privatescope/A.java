package access_modifiers.privatescope;

public class A {

    private int a = 30;
            int b = 40;
    protected int c = 50;
    public int d = 60;

    public static void main(String[] args) {

        A obj = new A();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}
