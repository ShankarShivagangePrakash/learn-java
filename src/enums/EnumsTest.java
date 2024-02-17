package enums;

public class EnumsTest {

    public static void main(String[] args) {

        // returns all enum values available for this enum
        EnumsExample[] values = EnumsExample.values();
        for (EnumsExample enumExample : values) {
            System.out.println(enumExample);
        }

        System.out.println("Credit card processing fee: " + PaymentTypes.CREDIT_CARD.getFee());

        for (PaymentTypes paymentTypes : PaymentTypes.values()) {
            System.out.println(paymentTypes +  " processing fee: " + paymentTypes.getFee());
        }
    }
}
