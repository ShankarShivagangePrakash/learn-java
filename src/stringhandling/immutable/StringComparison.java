package stringhandling.immutable;

public class StringComparison {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        //compare whether s1 and s2 pointing to same memory location.
        System.out.println("Compare memory location of s1 and s2 " + (s1 == s2));

        String s3 = "world";

        //compare memory location of s1 and s3
        System.out.println("Compare memory location of s1 and s3 " + (s1 == s3));

        //when you use new keyword, it will create new memory location
        String s4 = new String("Hello");

        //even though s1 and s4 are having same value since s4 is created using new keyword it has created new memory location
        // so s1 == s4 will not return true
        System.out.println("Compare memory location of s1 and s4 " + (s1 == s4));

        //compare values
        System.out.println("Compare values of s1 and s2 " + s1.equals(s2));
        System.out.println("Compare values of s1 and s3 " + s1.equals(s3));
        System.out.println("Compare values of s1 and s4 " + s1.equals(s4));
    }
}
