package java13and14features.recordfeature;


/*
     Before Java 14, you were creating POJO class to represent data
     Either annotate it or used to create constructor, getter, setter, toString(), hasCode() manually or by using appropriate annotation
     But that was having lot of boilerplate code.
     Record is a solution to that, just specify what your POJO structure,
     Record is a class which provides all those functionalities.
 */
public record Employee(String name, double salary) {
}
