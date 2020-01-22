package lesson2.HomeWork2;

public class Dz6 {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int[] arr2 = { 2, 2, 2, 1, 2, 2, 10, 1 };
        int[] arr3 = { 1, 1, 1, 2, 1 };


        System.out.println(checkBalance(arr));
        System.out.println(checkBalance(arr2));
        System.out.println(checkBalance(arr3));
    }


    private static boolean checkBalance(int[] data) {
        int sumLeft = 0;
        int sumRight;
        for (int i = 0; i < data.length; i++) {
            sumLeft += data[i];
            sumRight = 0;
            for (int k = i + 1; k < data.length ; k++) {
                sumRight += data[k];
            }
            if (sumLeft == sumRight) {
                return true;
            }
        }
        return false;
    }
}
