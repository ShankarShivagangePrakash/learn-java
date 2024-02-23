package jvmarchitecture.classloaders;

import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) {

        Class c = null;

        try {
            // To load the class to method area, use Class.forName(<CLass_Name>)
            c = Class.forName("jvmarchitecture.classloaders.User");
            // Note: When you execute above line, it will create an object for the class but it not normal object that we create
            // that object is of Class type and it has all information of that class, what all parameters, methods available etc..
            // So don't get confused for creating object of type class
            // So no matter how many objects you create of type User - normal object
            // This user class type object will be reused - so we can say is a singleton object

            // To get all methods declared in the User class use below method.
            Method[] declaredMethods = c.getDeclaredMethods();

            for (Method method : declaredMethods) {
                System.out.println("Method name: " + method);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
