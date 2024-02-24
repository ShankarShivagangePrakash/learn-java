package java13and14features.recordfeature;


/*
     Before Java 14, you were creating POJO class to represent data
     Either annotate it or used to create constructor, getter, setter, toString(), hasCode() manually or by using appropriate annotation
     But that was having lot of boilerplate code.
     Record is a solution to that, just specify what your POJO structure,
     Record is a class which provides all those functionalities.
 */
public record Employee(String name, double salary) {

    // We cannot create member variables for object of this class. We are allowed to create only staic variables.
    // If we need a member variable for object, you need to modify line 11.
    static int staticMember = 10;

    // Default constructor created by us.
    public Employee() {
        this("Default Employee", 500);
    }

    // parameterized constructor created by us.
    /*
         In both default and parameterized constructor, it is our responsibility to initialize
         object member variables i.e. name and salary
         because by default they are final in Record.
     */
    public Employee(String name) {
        this(name, 1000);
    }

    // This can be static or non-static
    public static String getRecordName() {
        return "Employee Record";
    }
}
