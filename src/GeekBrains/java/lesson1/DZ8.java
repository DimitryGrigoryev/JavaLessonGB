package GeekBrains.java.lesson1;

public class DZ8 {
    public static void isLeapYear (int year){
        if (year % 4 == 0) {
            if (year % 400 == 0) {
                System.out.println("Год високосный.");
                return;
            } else if (year % 100 == 0) {
                System.out.println("Год не високосный.");
                return;
            }
            System.out.println("Год високосный.");
        } else {
            System.out.println("Год не високосный.");
        }
    }

    public static void main(String[] args) {
        isLeapYear(2020);
    }
}



