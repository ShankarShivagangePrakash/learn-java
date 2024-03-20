package codingproblems;

public class RightAngledTrianglePattern {

    public static void main(String[] args) throws InterruptedException {

        int n = 8;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print("* ");
            }
            Thread.sleep(300);
            System.out.println();
        }
    }
}
