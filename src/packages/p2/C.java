package packages.p2;

import packages.p1.A;

public class C {

    public static void main(String[] args) {

        A.a1(); //Note: C is in different package. so if you want to access any member of Class A, you need to import the class. Check line 3

        // If you don't use import statement, then you need to use full qualifier name
        packages.p1.A.a1();
    }
}
