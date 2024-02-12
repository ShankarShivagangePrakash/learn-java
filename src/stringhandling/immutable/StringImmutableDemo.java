package stringhandling.immutable;

public class StringImmutableDemo {

    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "hello";

        System.out.println("Memory location of s1: " + s1.hashCode());
        System.out.println("Memory location of s2: " + s2.hashCode());

        System.out.println("assigning different value to s2 as World ");

        s2 = "world";
        System.out.println("Memory location of s2: " + s2.hashCode());

        //string concatenation also creates new String in memory location, you have to assign the output back to the variable you want.
        s1 = s1.concat(s2);
        System.out.println("String s1 value: " + s1 + " address " + s1.hashCode());
    }
}
