package collection.map;

public class User {

    @Override
    public String toString() {
        return "User";
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize() invoked");
    }
}
