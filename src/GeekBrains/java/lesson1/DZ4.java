package GeekBrains.java.lesson1;

public class DZ4 {
    public static boolean between10and20(int x1, int x2) {
          int x = x1 + x2;
        return x >= 10 && x <= 20;
    }

    public static void main(String[] args) {
        System.out.println(between10and20(13, -3));
    }

}
