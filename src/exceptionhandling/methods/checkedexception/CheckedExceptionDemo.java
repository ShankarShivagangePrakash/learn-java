package exceptionhandling.methods.checkedexception;

import packages.p2.C;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {

    public void readFile() throws FileNotFoundException {
        // Below line can cause file not found exception, instead of handling that exception inside the class.
        // We specify that this exception may be thrown from this class, whoever calls this method has to handle that exception
        // we achieve this using throws keyword
        FileInputStream file = new FileInputStream("");
    }

    public static void main(String[] args) {

        CheckedExceptionDemo checkedExceptionDemo = new CheckedExceptionDemo();
        //If file not found at the specified location of argument passed while creating object, it will throw file not found exception
        try {
            //Here we are handling exception which could be thrown by readFile(),
            // we can either handle it with catch block or
            // add throws exceptionName to method signature, JVM will throw that exception if occurs.
            checkedExceptionDemo.readFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception");
        }
    }
}
