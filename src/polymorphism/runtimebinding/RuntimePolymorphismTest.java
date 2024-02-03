package polymorphism.runtimebinding;

public class RuntimePolymorphismTest {

    public static void main(String[] args) {
        MacBook macBook = new MacBookPro();
        macBook.start();
        macBook.shutdown();

        MacBook macBook2 = new MacBookAir();
        macBook2.start();
        macBook2.shutdown();
    }
}
