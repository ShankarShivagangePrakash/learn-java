package codingproblems;

public class PyramidPattern {

    public static void main(String[] args) {

        int n = 8;

        for (int i = 1; i <= n; i++) {

            // print that many spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print that many *
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
