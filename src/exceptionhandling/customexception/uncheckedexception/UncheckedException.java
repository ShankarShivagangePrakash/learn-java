package exceptionhandling.customexception.uncheckedexception;

public class UncheckedException extends RuntimeException{

    public UncheckedException() {
    }

    public UncheckedException(String message) {
        super(message);
    }
}
