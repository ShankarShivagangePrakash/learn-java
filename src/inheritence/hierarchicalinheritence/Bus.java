package inheritence.hierarchicalinheritence;

public class Bus extends Vehicle{

    @Override
    public String fuel() {
        super.fuel();
        return "CNG";
    }
}
