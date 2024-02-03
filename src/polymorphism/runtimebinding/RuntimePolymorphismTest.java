package polymorphism.runtimebinding;

public class RuntimePolymorphismTest {

    public static void main(String[] args) {
        MacBook macBook = new MacBookPro();
        macBook.start();
        macBook.shutdown();

        MacBook macBook2 = new MacBookAir();
        macBook2.start();
        macBook2.shutdown();

        //up scaling, convert child class object to parent class object
        MacBook macBook3 = new MacBookAir();

        //down casting, convert parent class object to child class.
        MacBookPro macBookPro = (MacBookPro) macBook;

        MacBookAir macBookAir = (MacBookAir) macBook;

        //Need for object casting. Assume there is a new function defined in MacBookPro class, with MacBook object you cannot invoke
        //you have to typecast and then only invoke it.
        //below logic works because it is down-casted
        macBookPro.specialFeature();

    }
}
