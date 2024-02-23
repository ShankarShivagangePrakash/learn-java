package annotations.supresswarnings;

import java.util.ArrayList;
import java.util.List;

public class B {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        // when you try to create object you get warning.
        A a = new A();
        a.myMethod();
        System.out.println(a);

        List list = new ArrayList();
        System.out.println(list);
    }
}
