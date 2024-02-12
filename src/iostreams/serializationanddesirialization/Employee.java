package iostreams.serializationanddesirialization;

import java.io.Serializable;

public class Employee implements Serializable {

    // transient keyword specifies that this property ssn will not be serialized, used when you don't want to write sensitive info to stream.
    transient int ssn;
    String name;
     double salary;

    public Employee(int ssn, String name, double salary) {
        this.ssn = ssn;
        this.name = name;
        this.salary = salary;
    }
}
