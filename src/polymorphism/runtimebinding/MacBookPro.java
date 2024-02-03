package polymorphism.runtimebinding;

public class MacBookPro extends MacBook {

    void start() {
        System.out.println("MacBook Pro start");
    }

    void shutdown() {
        System.out.println("MacBook Pro shut down");
    }

    void specialFeature() {
        System.out.println("MacBook Pro special feature");
    }
}
