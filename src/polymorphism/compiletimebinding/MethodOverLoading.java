package polymorphism.compiletimebinding;

public class MethodOverLoading {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(float a, float b) {
        System.out.println(a + b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        MethodOverLoading methodOverLoading = new MethodOverLoading();
        methodOverLoading.add(10, 20);
        methodOverLoading.add(10.05f, 20.89f);
        methodOverLoading.add(10, 20,40);
    }
}
