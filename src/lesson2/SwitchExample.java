package lesson2;

public class SwitchExample {
//    public static void main(String[] args) {
//        System.out.println(PrintMonth(1));
//        System.out.println(PrintMonth(2));
//        System.out.println(PrintMonth(3));
//        System.out.println(PrintMonth(4));
//        System.out.println(PrintMonth(5));
//        System.out.println(PrintMonth(6));
//        System.out.println(PrintMonth(7));
//        System.out.println(PrintMonth(8));
//        System.out.println(PrintMonth(9));
//        System.out.println(PrintMonth(10));
//        System.out.println(PrintMonth(11));
//        System.out.println(PrintMonth(12));
//        System.out.println(PrintMonth(13));
//
//    }
    public static void main(String[] args) {
        PrintSeasonBySwitch( 1);
        PrintSeasonBySwitch(2);
        PrintSeasonBySwitch(3);
        PrintSeasonBySwitch(4);
        PrintSeasonBySwitch(5);
        PrintSeasonBySwitch(6);
        PrintSeasonBySwitch(7);
        PrintSeasonBySwitch(8);
        PrintSeasonBySwitch(9);
        PrintSeasonBySwitch(10);
        PrintSeasonBySwitch(11);
        PrintSeasonBySwitch(12);
        PrintSeasonBySwitch(13);

    }

//    private static String printMonth(int monthNumber) {
//        if (monthNumber == 1) return "January";
//        if (monthNumber == 2) return "February";
//        if (monthNumber == 3) return "March";
//        if (monthNumber == 4) return "April";
//        if (monthNumber == 5) return "May";
//        if (monthNumber == 6) return "June";
//        if (monthNumber == 7) return "July";
//        if (monthNumber == 8) return "August";
//        if (monthNumber == 9) return "September";
//        if (monthNumber == 10) return "October";
//        if (monthNumber == 11) return "November";
//        if (monthNumber == 12) return "December";
//        return "Unknown month!";
//    }

     private static void PrintMonthBySwitch(int monthNumber) {
        switch (monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Unknown month!");
                break;
        }
    }

    private static void PrintSeasonBySwitch(int monthNumber) {
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Unknown month!");
                break;
        }
    }
}
