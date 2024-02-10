package stringhandling;

public class StringCreation {

    public static void main(String[] args) {

        //assigning string literal to a String object.
        String s1 = "six";

        // creating string using String class constructor
        String s2 = new String("seven");

        char[] charArray = {'a', 'e', 'i', 'o', 'u'};
        //Creating string using character array
        String s3 = new String(charArray);

        byte[] byteArray = {65, 66, 67};
        //creating string using byte array
        String s4 = new String(byteArray);

        System.out.println("assigning string literal to a String object. " + s1);
        System.out.println("creating string using String class constructor " + s2);
        System.out.println("Creating string using character array " + s3);
        System.out.println("creating string using byte array " + s4);
    }
}
