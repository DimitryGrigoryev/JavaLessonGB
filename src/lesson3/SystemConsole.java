package lesson3;

public class SystemConsole {
    public static void main(String[] args) {
        String s = System.console().readLine();
        System.out.println(s);
    }
}
