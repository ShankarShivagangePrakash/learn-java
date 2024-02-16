package collection.otherconcepts.generics;

import java.util.ArrayList;
import java.util.List;

public class TypeCastingProblem {

    public static void main(String[] args) {

        String[] strings = new String[10];

        strings[0] = "A";

        // below line is not allowed in primitive type arrays they strictly check for data type of the input. Gives compilation error.
        // strings[0] = 50;

        // Prior to java 1.5 there was no rule that for List Wrapper class name should be mentioned while creating.
        // So it could accept multiple types of input
        // but at runtime while parsing it will create problem
        List list = new ArrayList();
        list.add("A");
        list.add(50);

        String s1 = (String) list.get(0);

        // Below line will not give compilation error but throws runtime error.
        String s2 = (String) list.get(1);

        //To avoid this generics were introduced.
     }
}
