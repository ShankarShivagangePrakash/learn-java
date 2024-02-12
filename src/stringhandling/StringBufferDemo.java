package stringhandling;

public class StringBufferDemo {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();

        //string buffer objects will have initial capacity of 16 and increase later as in when needed.
        System.out.println("Initial capacity: " + stringBuffer.capacity());

        //we can append new string to string buffer
        stringBuffer.append("You can do anything and everything");
        stringBuffer.append(true);

        System.out.println("Current capacity: " + stringBuffer.capacity());

        System.out.println("character at index: " + stringBuffer.charAt(11));

        //other way to create string buffer
        StringBuffer stringBuffer1 = new StringBuffer("abcdef");
        System.out.println("Newly created string: " + stringBuffer1);

        //reverse a string
        stringBuffer1 = stringBuffer1.reverse();

        System.out.println("reversed string: " + stringBuffer1);

        //insert substring to string buffer
        stringBuffer1.insert(2, "def");
        System.out.println("New string after insertion: " + stringBuffer1);

        //delete substring
        stringBuffer1.delete(5, 8);
        System.out.println("New string after deletion: " + stringBuffer1);
    }
}
