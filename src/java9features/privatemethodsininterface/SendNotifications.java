package java9features.privatemethodsininterface;

public interface SendNotifications {

    // default method,
    default void sendMultipleNotifications() {
        establishConnection();
        System.out.println("Sending multiple notifications");
    }

    default void sendNotification() {
        establishConnection();
        System.out.println("Sending one notification");
    }

    // private method introduced in java 9, make sure you have set java version to more than 9 and language levels to more than 9
    // you can mark private methods as static as well that is up to you.
    private static void establishConnection() {
        System.out.println("Establish connection");
    }
}
