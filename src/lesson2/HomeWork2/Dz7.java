package lesson2.HomeWork2;

import java.util.Arrays;

public class Dz7 {
    public static void main(String[] args) {
//        int[] movArr = {1, 2, 3, 4, 5};

        moveArray(new int[]{1, 2, 3, 4, 5}, 0);
        moveArray(new int[]{1, 2, 3, 4, 5}, 5);
        moveArray(new int[]{1, 2, 3, 4, 5}, 4);
        moveArray(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}, 41);
        moveArray(new int[]{2, 4, 5, 1, 2, 3, 4, 5}, -4);
    }

    private static void moveArray(int[] arr, int i) {
        int temp;
        int n = i % arr.length;
        if (n == 0 || n == arr.length) {
            System.out.print(Arrays.toString(arr));
        } else if (n < 0) {
            for (int move = 0; move > n; move--) {
                temp = arr[0];
                System.arraycopy( arr, 1, arr, 0, arr.length - 1 );
                arr[arr.length - 1] = temp;
            }
            for (int value : arr){
                System.out.print(value);
            }
        } else {
            for (int move1 = 0; move1 < n; move1++) {
                temp = arr[arr.length - 1];
                System.arraycopy( arr, 0, arr, 1, arr.length - 1 );
                arr[0] = temp;
            }
            for (int value : arr){
                System.out.print(value);
            }
        }

        System.out.println(" Move to : " + i + " symbol");
    }
}