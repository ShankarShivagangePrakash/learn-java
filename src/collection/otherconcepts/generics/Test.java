package collection.otherconcepts.generics;

public class Test {

    public static void main(String[] args) {

        MyGenericsClass<String> s = new MyGenericsClass<>("Virat");
        s.displayObjectDetails();
        System.out.println(s.getObject());

        MyGenericsClass<Integer> i = new MyGenericsClass<>(145);
        i.displayObjectDetails();
        System.out.println(i.getObject());

        MyGenericsClass<Double> d = new MyGenericsClass<>(124.45);
        d.displayObjectDetails();
        System.out.println(d.getObject());
    }
}
