package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        try {

            // Class.forName() will load the class to JVM method area. and return that java.lang.Class type object which represents this class.
            Class<?> myClass =  Class.forName(Calculator.class.getName());

            // using this we can access constructors, methods, variables etc.. of that class.
            System.out.println("Name of my class " + myClass.getName());

            // get constructors, Note: by default it can access only public constructors so marks constructors as public.
            Constructor<?>[] constructors = myClass.getConstructors();
            System.out.println("\nConstructors of Calculator class: " + Arrays.asList(constructors));

            // get all methods of the class
            System.out.println("\nMethods: " + Arrays.asList(myClass.getMethods()));

            /*
                 Access specific constructor, access default constructor.
                 To access default constructor pass null in parameter,
                 parameter represents the signature of the constructor,
                 if the data type and number of argument match that constructor will be fetched
                 pass null which represents nothing to fetch default constructor.
             */
            Constructor<?> defaultConstructor = myClass.getConstructor(null);

            /*
                create instance using default constructor.
                constructor object parameter signature and newInstance() parameter signature should match
                To create object.
             */
            Object defaultObject = defaultConstructor.newInstance(null);

            /*
                access parameterized constructor
                based on the data type and number of arguments appropriate constructor will be invoked and returned.
             */
            Constructor<?> parameterizedConstructor = myClass.getConstructor(double.class, double.class);

            // create object using parameterized constructor.
            Object parameterizedObject = parameterizedConstructor.newInstance(4, 5);

            /*
                Access methods
                With reflection accessing and invoking are two steps
                accessing you get access to that method
                invoking you use that method to perform some operation.
             */
            /*
                get access a method

                You need to get constructor
                pass the name of the method you need to access as the first parameter
                second and next parameters are list of parameters that method would accept
             */
            Method getNum1 = myClass.getMethod("getNum1", null);
            Method getNum2 = myClass.getMethod("getNum2", null);

            /*
                To invoke that method

                access invoke() using method object
                first parameter to this invoke() is the customer object (normal object we use) with which we need to access
                second parameter is arguments if we need to pass anything
             */
            System.out.println("\nnum1: " + getNum1.invoke(parameterizedObject, null));
            System.out.println("num2: " + getNum2.invoke(parameterizedObject, null));

            // Invoke setter methods, means methods which take arguments
            Method setNum1 = myClass.getMethod("setNum1", double.class);
            Method setNum2 = myClass.getMethod("setNum2", double.class);

            // Invoke setters
            setNum1.invoke(parameterizedObject, 15);
            setNum2.invoke(parameterizedObject, 18);

            System.out.println("\nNew values of the variables");
            System.out.println("\nnum1: " + getNum1.invoke(parameterizedObject, null));
            System.out.println("num2: " + getNum2.invoke(parameterizedObject, null));

            // access and modifying the private fields
            /*
                To do that first we need to change the access specifier of the private fields using reflection
             */
            Field num1Field = myClass.getDeclaredField("num1");

            // change access specifier to public
            num1Field.setAccessible(true);

            // set value directly without constructor or setter
            num1Field.set(parameterizedObject, 25);

            System.out.println("\nNew values of the variables");
            System.out.println("\nnum1: " + getNum1.invoke(parameterizedObject, null));

            // get annotation
            Annotation[] annotations = myClass.getAnnotations();
            System.out.println("\nAnnotations of Calculator class: " + Arrays.asList(annotations));

            MyAnnotation myAnnotation = (MyAnnotation) annotations[0];
            System.out.println("\nAnnotation value1: " + myAnnotation.value1());
            System.out.println("Annotation value2: " + myAnnotation.value2());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}
