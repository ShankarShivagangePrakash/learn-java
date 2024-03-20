package java18features.switchdemo;

public class DominanceChecking {

    public static void main(String[] args) {
        Object object = "avbcd";

        switch (object) {

            case CharSequence c -> System.out.println("char sequence type object");
            //below line will show compilation error, since it will never be reached because char sequence can also match string.
            // case String s -> System.out.println("String type object");

            default -> System.out.println("Default type object");
        }
    }
}
