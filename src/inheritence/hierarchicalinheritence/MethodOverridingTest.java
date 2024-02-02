package inheritence.hierarchicalinheritence;

public class MethodOverridingTest {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Car fuel type: " + car.fuel());

        Bus bus = new Bus();
        System.out.println("Bus fuel type: " + bus.fuel());

        Bike bike = new Bike();
        System.out.println("Bike fuel type: " + bike.fuel());
    }
}
