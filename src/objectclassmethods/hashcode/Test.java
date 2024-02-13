package objectclassmethods.hashcode;

public class Test {

    public static void main(String[] args) {

        Passenger passenger = new Passenger(1,"Virat", "Kohli");

        System.out.println(passenger);

        System.out.println("hashcode of the object: " + passenger.hashCode());
    }
}
