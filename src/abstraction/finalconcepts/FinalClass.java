package abstraction.finalconcepts;

//since class is marked as final, no other classes can extend/inherit this class.
public final class FinalClass {

    private final float PI = 3.14f;

    // displayValue is marked as final, it cannot be overridden further.
    public final void displayValue() {
        System.out.printf("PI value is: %.2f", PI);
    }

    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
        // since PI variable is marked as final, it cannot be modified. Below line gives compilation error.
        // finalClass.PI = 3.24;

        //final variable reference cannot be changed.
        final FinalClass finalClass1 = new FinalClass();
        //changing reference is not allowed, below line gives compilation error.
        // finalClass1 = new FinalClass();
    }
}
