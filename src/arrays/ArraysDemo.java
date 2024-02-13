package arrays;

public class ArraysDemo {

    public static void main(String[] args) {

        // array creation method 1
        int[] arr1 = {10, 20, 30, 40, 50};

        // array creation method 2
        int[] arr2 = new int[5];

        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;
        arr2[3] = 40;

        // To iterate through elements of the array
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        // enhanced for loop
        for (int num : arr2) {
            System.out.println(num);
        }

        // below line will give runtime error as we're trying to access index beyond array size.
        // arr2[6] = 70;
    }
}
