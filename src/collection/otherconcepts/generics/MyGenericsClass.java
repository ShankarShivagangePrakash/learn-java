package collection.otherconcepts.generics;

public class MyGenericsClass<T> {

    T obj;

    MyGenericsClass(T obj) {
        this.obj = obj;
    }

    public void displayObjectDetails() {
        System.out.println("Type of this object: " + obj.getClass().getName());
    }

    public T getObject() {
        return obj;
    }
}
