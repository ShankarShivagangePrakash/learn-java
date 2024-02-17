package enums;

public enum PaymentTypes {

    CREDIT_CARD(5),
    DEBIT_CARD(0),
    CASH(10);

    private int fee;

    PaymentTypes(int fee) {
        this.fee = fee;
    }

    public int getFee() {
        return this.fee;
    }

    /*How this works?

    enum is extending Enum class which means this is also a class.
    so we can have member variables, constructors getters and setters etc.
    define a field named fee which represents the processing fee for that payment type
    When compiler creates object of that type, we need to bind this processing fee associated with that payment type
    To do that have a fee variable, pass that in constructor, when you want to retrieve define a getter method which returns the fee value associated
    with that object. */

}
