package innerclasses.anonymousinnerclass;

public class DriverManager {

    public static Connection getConnection() {

        Connection connection = new Connection() {
            @Override
            public void createStatement() {
                System.out.println("Anonymous inner class method");
            }
        };

        return connection;
    }
}
