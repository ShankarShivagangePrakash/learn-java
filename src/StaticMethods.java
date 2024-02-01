public class StaticMethods {
    public static void main(String[] args) {
        System.out.println("Insise public static void main()");
        StaticMethods.staticMethod1();
    }

    static void staticMethod1() {
        System.out.println("Inside static method 1");
    }

    static{
        System.out.println("Inside static block");
    }
}