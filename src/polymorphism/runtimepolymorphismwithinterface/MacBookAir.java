package polymorphism.runtimepolymorphismwithinterface;

public class MacBookAir implements AppleLaptop{
    @Override
    public void start() {
        System.out.println("Mac Book air start");
    }

    @Override
    public void shutdown() {
        System.out.println("Mac Book Air shutdown");
    }
}
