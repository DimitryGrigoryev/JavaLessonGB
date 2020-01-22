package lesson2.HomeWork2;

public class Dz5 {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        System.out.println(maxDigital(data));
        System.out.println(minDigital(data));
    }

    private static int minDigital(int[] data) {
        int min = data[0];
        for (int i : data) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    private static int maxDigital(int[] data) {
        int max = data[0];
        for (int i : data) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
