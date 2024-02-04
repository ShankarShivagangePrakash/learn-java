package exceptionhandling.reallifescenarios;

public class commonMistakes {

    public static void main(String[] args) {
        int[] array = new int[20];
        System.out.println(array[0]);

        //Below line will throw error, because array size is 20, but largest index will be 19 since indexing starts from 0
        // System.out.println(array[20]);
        //Instead use
        System.out.println(array[array.length - 1]);

        String s = null;
        // Below line will throw exception, because String s itself is null, and you are trying to access a method on that null
        // System.out.println(s.length());
        // Instead check if it is null or not then do the operation
        if (s != null) {
            s.length();
        }
    }
}
