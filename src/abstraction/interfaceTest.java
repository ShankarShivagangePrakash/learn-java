package abstraction;

import abstraction.implementation.HondaCar;

public class interfaceTest {

    public static void main(String[] args) {
        HondaCar hondaCar = new HondaCar();
        hondaCar.go();
        hondaCar.stop();
    }
}
