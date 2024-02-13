package arrays;

public class TwoDimensionalArrayDemo {

    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Get the length of the outer array, which is the number of rows.
        for (int i = 0; i < arr1.length; i++) {
            // Get the length of the inner array, which is the number of columns.
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.print( arr1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        int[][] arr2 = new int[3][4];
        // Get the length of the outer array, which is the number of rows.
        for (int i = 0; i < arr2.length; i++) {
            // Get the length of the inner array, which is the number of columns.
            for (int j = 0; j < arr2[0].length; j++) {
                System.out.print( arr2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
