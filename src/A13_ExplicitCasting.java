public class A13_ExplicitCasting {

    public static void main(String[] args) {
        int a = 100;

        byte b = (byte) a;
        System.out.println(b);

        int c = 97;
        char d = (char)c;
        System.out.println(d);

        //Explicit type casting beyond range
        int e = 150;
        byte f = (byte) e;
        System.out.println(f);

        int g = 612;
        byte h = (byte) g;
        System.out.println(h);
    }
}
