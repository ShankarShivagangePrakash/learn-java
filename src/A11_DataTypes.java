public class A11_DataTypes {

    public static void main(String[] args) {

        //byte range is -128 to 127
        byte a = 50;
        short b = 150;
        int c = 1423;
        long d = 1345646;
        char e = 'A';
        float f = 12.45f;
        double g = 12.45;

        byte h = 10;

        /*Java will not allow to add two byte values and assign to another byte variables, because it may go out of range and some JVM constraint.
        below code with give syntax error.*/
        // byte i = a + h;

        //corrected code
        int i = a + h;
    }
}
