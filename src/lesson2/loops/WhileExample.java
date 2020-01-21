package lesson2.loops;

public class WhileExample{
    public static void main(String[] args) {
        int i = 0;
//        while (true) {
//            if (i >= 5) {
//                break;
//            }
//            System.out.println(i);
//            i++;
//        }
        do{
            if (i >= 5) {
                break;
            }
            System.out.println(i);
            i++;
        }while (true);
    }
}
