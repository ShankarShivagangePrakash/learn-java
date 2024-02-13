package collection.list.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        //defining object array
        Object[] objects = new Object[1000000];

        // definition, each index is assigned with data.
        for (int i = 0; i < objects.length; i++) {
            objects[i] = new Object();
        }

        LinkedList<Object> linkedList = new LinkedList<>();

        //store object to linked list and calculate time.

        Long start = System.currentTimeMillis();
        for (Object object : objects) {
            linkedList.add(object);
        }
        System.out.println("time taken to insert 1000000 records to linked list: " + (System.currentTimeMillis() - start));
    }
}
