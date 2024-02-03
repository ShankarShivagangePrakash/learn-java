package polymorphism.runtimepolymorphismwithinterface;

public class RuntimePolymorphismTest {

    public static void main(String[] args) {
        AppleLaptop appleLaptop = new MacBookPro();
        appleLaptop.start();
        appleLaptop.shutdown();

        AppleLaptop appleLaptop1 = new MacBookAir();
        appleLaptop1.start();
        appleLaptop1.shutdown();
    }
}
