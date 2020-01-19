package GeekBrains.java.lesson1;

public class DZ8 {
    public static void main(String[] args) {
        printLeapYear(1);
        printLeapYear(4);
        printLeapYear(100);
        printLeapYear(400);
        printLeapYear(2019);
        printLeapYear(2020);
    }

    public static void printLeapYear (int year){
        boolean leapYear = isLeapYear(year);
        if (leapYear) {
            System.out.println(year + " Год високосный.");
        } else {
            System.out.println(year + " Год не високосный.");
        }

//        if (year % 4 == 0) {
//            if (year % 400 == 0) {
//                System.out.println("Год високосный.");
//                return;
//            } else if (year % 100 == 0) {
//                System.out.println("Год не високосный.");
//                return;
//            }
//            System.out.println("Год високосный.");
//        } else {
//            System.out.println("Год не високосный.");
//        }
    }
    private static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }



}



