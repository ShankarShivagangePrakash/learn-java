package encapsulation;

public class EncapsulationTest {

    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.setFirstName("Shankar");
        customer.setLastName("Shan");
        customer.setCreditCard("XX-1245-XXX");

        customer.getFirstName();
        customer.getLastName();
        customer.getCreditCard();
    }
}
