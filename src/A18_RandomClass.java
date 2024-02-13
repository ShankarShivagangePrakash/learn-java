import java.util.Random;

public class A18_RandomClass {

    public static void main(String[] args) {


        // Random Class is used to generate random numbers
        Random random = new Random();

        int x = random.nextInt();
        System.out.println("Random number generated: " + x);

        // generates random number in a particular range.
        int y = random.nextInt(50);
        System.out.println("Random number in a particular range: " + y);
    }
}
