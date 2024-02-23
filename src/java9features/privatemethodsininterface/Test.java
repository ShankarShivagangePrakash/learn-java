package java9features.privatemethodsininterface;

public class Test implements SendNotifications {

    public static void main(String[] args) {

        SendNotifications sendNotifications = new Test();

        sendNotifications.sendMultipleNotifications();
        sendNotifications.sendNotification();
    }
}
