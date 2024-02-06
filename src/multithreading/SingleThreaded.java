package multithreading;

public class SingleThreaded {

    //JVM will create a thread for main method execution.
    //By default, instructions inside it will be executed sequentially.
    public static void main(String[] args) {

        //So printNumbers() method will be invoked, which prints j value from 1 to 200
        //Then for loop inside main() method gets executed prints i from 1 to 200
        SingleThreaded singleThreaded = new SingleThreaded();
        singleThreaded.printNumbers();

        for (int i = 1; i <= 200; i++) {
            System.out.print("i: " + i + "\t");
        }
    }

    void printNumbers() {
        for (int j = 1; j <= 200; j++) {
            System.out.print("j: " + j + "\t");
        }
    }
}
