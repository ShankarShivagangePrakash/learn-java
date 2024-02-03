package polymorphism.runtimepolymorphismwithinterface;

public class MacBookPro implements AppleLaptop{
    @Override
    public void start() {
        System.out.println("Mac Book Pro start");
    }

    @Override
    public void shutdown() {
        System.out.println("Mac Book Pro shutdown");
    }
}
