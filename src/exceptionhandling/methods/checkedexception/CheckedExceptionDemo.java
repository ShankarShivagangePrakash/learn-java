package exceptionhandling.methods.checkedexception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {

    public static void main(String[] args) {

        //If file not found at the specified location of argument passed while creating object, it will throw file not found exception
        try {
            FileInputStream file = new FileInputStream("");
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception");
        }
    }
}
