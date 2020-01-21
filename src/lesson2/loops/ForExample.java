package lesson2.loops;

public class ForExample {
    public static void main(String[] args) {
//        for (int i = 5; i < 5; i++ ) {
//            System.out.println(i);
//        }
//        for (int i = 5; i > 5; i += 2 ) {
//            System.out.println(i);
//        }

//        for (int i = 5, j = 2; i >= 0; i--, j++ ) {
//            System.out.println(i);
//            System.out.println(j);
//        }
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.println("i = " + i + "; j = " + j);
            }
        }
        for (;;) {
            System.out.println("Hello");
        }

    }
}
