package lesson3.DZ3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

public class Puzzle {

    public static final String[] WORDS = new String[]{"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args) {
        String puzzles = getRandomWord().toLowerCase();
        System.out.println("Попробуйте угадать загаданное слово.\n" + Arrays.toString(WORDS));
        String temp = "###############";
        System.out.println("Введите свой ответ: ");
        Scanner scanner = new Scanner( System.in );
        String answer = toLowerCase(scanner.nextLine());
        while (!answer.equals(puzzles)) {
            System.out.println("Вы не угадали! Попробуйте еще раз.");
            temp = (String) getOpenLetters(puzzles, answer, temp);
            System.out.println(temp);
            answer = toLowerCase(scanner.nextLine());
        }
        System.out.printf("Вы угадали! загаданное слово %s !", puzzles);
    }
    private static Object getOpenLetters(String puzWord, String answerStr, String temp) {
        int[] len = {puzWord.length(), answerStr.length(), temp.length()};
        int min = getMinLength(len);
        char[] arr = temp.toCharArray();
        for (int i = 0; i < min; i++) {
            char a = puzWord.charAt(i);
            char b = answerStr.charAt(i);
            if (a == b) {
                arr[i] = b;
            }
        }
        return new String(arr);
    }
    private static int getMinLength(int[] data) {
            int min = data[0];
            for (int i : data) {
                if (i < min) {
                    min = i;
                }
            }
            return min;
    }
    private static String getRandomWord() {
        Random random =new Random();
        int i = random.nextInt(WORDS.length);
        return WORDS[i];
    }
}