package iostreams.serializationanddesirialization;

import java.io.*;

public class DeSerializationDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // text file location.
        String textFileLocation = System.getProperty("user.dir")+ "/src/resources/";

        FileInputStream fis = null;

        //for serialization.
        ObjectInputStream objectInputStream = null;

        //to this location, employee object serialized content will be written.
        fis = new FileInputStream(textFileLocation + "emp.ser");

        //point object output stream to the File output stream.
        objectInputStream = new ObjectInputStream(fis);

        Employee employee = (Employee) objectInputStream.readObject();

        //ssn value will be zero, because you have added transient keyword in POJO so it was not serialized meaning not written to serialized file.
        System.out.println("employee id: " + employee.ssn);
        System.out.println("employee name: " + employee.name);
        System.out.println("employee salary: " + employee.salary);

        System.out.println("deserialization completed");


    }
}
