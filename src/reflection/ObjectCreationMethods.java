package reflection;

import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;

public class ObjectCreationMethods {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, CloneNotSupportedException {
        ObjectCreationMethods obj1 = new ObjectCreationMethods();

        Class<?> aClass = Class.forName(ObjectCreationMethods.class.getName());
        ObjectCreationMethods obj2 = (ObjectCreationMethods) aClass.newInstance();

        ObjectCreationMethods obj3 = ObjectCreationMethods.class.getConstructor(null).newInstance(null);

        ObjectCreationMethods obj4 = (ObjectCreationMethods) obj1.clone();

        // use static method to get default instance
        DateFormat obj5 = DateFormat.getInstance();



    }
}
