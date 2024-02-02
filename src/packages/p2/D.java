package packages.p2;


public class D {
    public static void main(String[] args) {

        A.a1();//since this class is in same package there is no need to import.
        packages.p1.A.a1();
    }
}
