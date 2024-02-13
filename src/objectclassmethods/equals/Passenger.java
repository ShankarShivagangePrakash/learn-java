package objectclassmethods.equals;

public class Passenger {

    private int id;
    private String firstName;
    private String lastName;

    public Passenger() {
    }

    public Passenger(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public int hashCode() {

        // by default, it will be overridden to identify this object with lesser time like indexing.
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        Passenger passenger = (Passenger) obj;
        if(this.id == passenger.getId() && this.firstName.equals(passenger.getFirstName()) && this.lastName.equals(passenger.getLastName()))
            return true;
        return false;
    }
}
