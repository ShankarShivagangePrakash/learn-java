package multithreading;

import java.util.Scanner;

/* Scenario: User keep inputting n integers, main thread will accept input and displays the final total sum
 other thread keeps calculating sum as in when user keeps inputting the number
 main thread final total sum should not be displayed till other thread completes execution.*/
public class JoinThread extends Thread {

    public static int n, sum = 0;

    public static void main(String[] args) {
        System.out.println("Sum of first 'N' numbers");
        System.out.println("Enter the number of integers you will input");
        Scanner scanner = new Scanner(System.in);
        JoinThread.n =  scanner.nextInt();

        JoinThread joinThread = new JoinThread();
        joinThread.start();

        try {
            joinThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Sum of first n integers upto " + JoinThread.n + "  is: " + JoinThread.sum);

    }

    public void run() {
        for (int i = 1; i <= JoinThread.n; i++) {
            JoinThread.sum += i;
        }
        System.out.println("other thread completed execution");
    }
}
