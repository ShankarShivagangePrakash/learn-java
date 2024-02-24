package java13and14features.instanceOfUpdates;

public class InstanceOfPatternMatchingDemo {

    public static void main(String[] args) {

        Object obj = get();

        //before Java 14, check is it instance of
        if (obj instanceof String) {
            // if true then only type cast
            String s = (String) obj;
            System.out.println("Before java 14 type casted to String " + s);
        }

        // From Java 16,in java 14 it was a preview feature.
        // No need to assign the value to particular type if instanceOf() is evaluated to true, in the same line it is assigned to a variable
        // thus eliminating assignment again.
        if (obj instanceof String s) {
            System.out.println("From Java 14 using instance of pattern matching: " + s);
        }
    }

    public static Object get() {

        // here we are sending the String, but since return type of this method is Object.
        // It will be auto converted to Object type, example for auto-boxing.
        return "Hello World";
    }
}
