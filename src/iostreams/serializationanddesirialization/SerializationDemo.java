package iostreams.serializationanddesirialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

    public static void main(String[] args) throws IOException {

        // text file location.
        String textFileLocation = System.getProperty("user.dir")+ "/src/resources/";

        FileOutputStream fos = null;

        //for serialization.
        ObjectOutputStream objectOutputStream = null;

        //to this location, employee object serialized content will be written.
        fos = new FileOutputStream(textFileLocation + "emp.ser");

        //point object output stream to the File output stream.
        objectOutputStream = new ObjectOutputStream(fos);

        //Create employee object.
        Employee employee = new Employee(1, "Virat", 10000);

        objectOutputStream.writeObject(employee);

        System.out.println("serialization completed");


    }
}
