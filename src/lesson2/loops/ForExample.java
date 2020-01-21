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
//        for (int i = 0; i < 5; i++){
//            for (int j = 0; j < 5; j++){
//                System.out.println("i = " + i + "; j = " + j);
//            }
//        }
//        for (int i = 5; i < 5;) {
//            System.out.println("Hello");
//        }
//        String str = "12345";
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            System.out.println(c);
//        }
//
//        System.out.println("ForEach example:");
//        for (char c : str.toCharArray()) {
//            System.out.println(c);
//        }
        int i =0;
        int stopDigit = 7;
        for ( i = 0; i < 20 ; i++) {
            if (i == stopDigit) {
                break;
            }
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println(i);
    }
}
