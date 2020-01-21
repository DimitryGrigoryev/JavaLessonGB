package lesson2.array;

public class ArrayTest {
    public static void main(String[] args) {

        int[] data = new int[5];
        data[2] = 5;
//        data[-2] = 5;
//        data[5] = 5;
//        for (int value : data){
////            System.out.println(value);
////        }

//        int[] data2 = new int[] {1, 2, 3, 4, 5};
//        int[] data2 = {1, 2, 3, 4, 5};
//        String [] data2 = {"1", "2", "3", "4", "5"};
////        for (String value : data2){
////            System.out.println(value);
////        }

        String[][] data3 = new String[3][];
        data3[0] = new String[7];
        data3[1] = new String[3];
        data3[2] = new String[5];

//        data3[0][0] = "1";

        for (String[] row : data3) {
            System.out.println();
            for (String value : row) {
                System.out.print(value + " ");
            }
        }
    }
}
