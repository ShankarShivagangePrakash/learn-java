package collection.list.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        /* Generics, you specify the type of data that this arrayList will store.
         In this case, it will store integers,
         if you don't specify this you can add other type data float or string.
         but in runtime while fetching data you get errors.*/
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(new Integer(20));

        //autoboxing, automatically converts primitive type to object type.
        arrayList.add(10);

        System.out.println("ArrayList: " + arrayList);

    }
}
