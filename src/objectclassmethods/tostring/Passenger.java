package objectclassmethods.tostring;

public class Passenger {

    private String firstName;
    private String lastName;

    public Passenger() {
    }

    public Passenger(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //overridden toString() of Object class to print the object as a string.
    @Override
    public String toString() {
        return "Passenger information:\nFirst name: " + this.firstName + " last name: " + this.lastName;
    }
}
