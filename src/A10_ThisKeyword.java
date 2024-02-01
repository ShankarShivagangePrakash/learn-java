public class A10_ThisKeyword {

    int x;

    public A10_ThisKeyword() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        new A10_ThisKeyword();
        new A10_ThisKeyword();
    }

}
