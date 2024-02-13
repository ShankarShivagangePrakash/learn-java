package collection.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

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

        //create iterator and attach to a collection object you want to iterate.
        Iterator<Integer> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            // print and remove elements from collection.
            iterator.remove();
        }

        //contents of collection after removing all elements from iterator.
        System.out.println("Array list contents: " + arrayList);

    }
}
