package exceptionhandling.reallifescenarios;

public class ObjectCasting {

    public static void main(String[] args) {

        Object object = new Object();

        // Below line will throw exception, because object is holding instance type of Object not String,
        // So while type casting, you have to be careful, if object was holding new String() at line 7 it will work.
        // String stringObject = (String) object;

        //Fix for this is, use instanceof method
        if (object instanceof String) {
            String stringObject = (String) object;
        }
    }
}
