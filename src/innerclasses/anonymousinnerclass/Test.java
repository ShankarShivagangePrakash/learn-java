package innerclasses.anonymousinnerclass;

public class Test {

    public static void main(String[] args) {

        Connection connection = DriverManager.getConnection();

        //Invoking interface method, since it has been implemented by anonymous inner class available in Driver Manager.
        connection.createStatement();
    }
}
