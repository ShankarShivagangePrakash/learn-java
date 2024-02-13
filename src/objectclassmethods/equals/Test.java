package objectclassmethods.equals;

public class Test {

    public static void main(String[] args) {

        Passenger passenger1 = new Passenger(1,"Virat", "Kohli");
        Passenger passenger2 = new Passenger(1,"Virat", "Kohli");

        System.out.println(passenger1);

        System.out.println("hashcode of the object: " + passenger1.hashCode());

        System.out.println("Are two objects equal? " + passenger1.equals(passenger2));
    }
}
