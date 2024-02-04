package exceptionhandling.customexception.checkedexception;

public class Test {

    public static void main(String[] args) throws CheckedException {
        throw new CheckedException("Custom checked exception");
    }
}
