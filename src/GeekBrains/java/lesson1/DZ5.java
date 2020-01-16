package GeekBrains.java.lesson1;

public class DZ5 {
    public static void isPositiveOrNegative(int x) {
        if( x >= 0) {
            System.out.println("Число положительное.");
        } else {
            System.out.println("Число отрицательное.");
        }
    }

    public static void main(String[] args) {
        isPositiveOrNegative(0);
    }

}
