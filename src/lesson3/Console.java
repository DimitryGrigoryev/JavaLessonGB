package lesson3;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String line = reader.readLine();
//        System.out.println("Line from console: " + line);

        Scanner scanner = new Scanner( System.in );
        String str = scanner.nextLine();
        while (!str.equals( "exit" )) {
            System.out.println( "From scanner: " + str);
            str = scanner.nextLine();
        }
    }
}
