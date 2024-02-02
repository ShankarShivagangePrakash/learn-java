package abstraction.implementation;

import abstraction.interfaces.Car;

public class HondaCar implements Car {
    @Override
    public void go() {
        System.out.println("Inside Honda Car go");
    }

    @Override
    public void stop() {
        System.out.println("Inside Honda Car stop");
    }
}
