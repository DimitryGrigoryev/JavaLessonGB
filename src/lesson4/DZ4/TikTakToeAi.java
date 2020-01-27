package lesson4.DZ4;

import java.util.Random;
import java.util.Scanner;

public class TikTakToeAi {
    private static final int SIZE = 7;
    public static final int DOTS_TO_WIN = 6;

    private static final char DOT_EMPTY = '•';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    public static final String EMPTY_COLUMN_TITLE = "  ";

    private static char[][] map;
    private static  Scanner scanner = new Scanner(System.in);
    private static  Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        playGame();
        System.out.println("Игра окончена!");
    }

    private static void playGame() {
        while (true){
            humanTurn();
            printMap();

            if (checkEnd(DOT_X, "Пользователь победил!"))
                break;

            aiTurn();
            printMap();
            if (checkEnd(DOT_O, "Компьютер победил!"))
                break;
        }
    }

    private static boolean checkEnd(char symbol, String winMessage) {
        if (checkWin(symbol)) {
            System.out.println(winMessage);
            return true;
        }

        if (isMapFull()) {
            System.out.println("Ничья");
            return true;
        }
        return false;
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkWin (char symbol) {
        int sumWinDot = 0;
        int startDot = SIZE - DOTS_TO_WIN;
        for (int i = 0; i < SIZE; i++) {
            for (int k = 0; k <= startDot; k++) {
                for (int j = k; j < SIZE; j++) {
                    if (map[i][j] == symbol) {
                        sumWinDot++;
                    } else {
                        sumWinDot = 0;
                        break;
                    }
                    if (sumWinDot == DOTS_TO_WIN) {
                        return true;
                    }
                }
            }
        }
        for (int j = 0; j < SIZE; j++) {
            for (int k = 0; k <= startDot; k++) {
                for (int i = k; i < SIZE; i++) {
                    if (map[i][j] == symbol) {
                        sumWinDot++;
                    } else {
                        sumWinDot = 0;
                        break;
                    }
                    if (sumWinDot == DOTS_TO_WIN) {
                        return true;
                    }
                }
            }
        }

        for (int k = 0; k <= startDot; k++) {
            for (int i = k; i < SIZE; i++) {
                if (map[i][i] == symbol) {
                    sumWinDot++;
                } else {
                    sumWinDot = 0;
                    break;
                }
                if (sumWinDot == DOTS_TO_WIN) {
                    return true;
                }
            }
        }

        for (int k = 0; k <= startDot; k++) {
            for (int i = k; i < SIZE; i++) {
                int j = map.length - 1 - i;
                if (map[i][j] == symbol) {
                    sumWinDot++;
                } else {
                    sumWinDot = 0;
                    break;
                }
                if (sumWinDot == DOTS_TO_WIN) {
                    return true;
                }
            }
        }


//        if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) return true;
//        if (map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol) return true;
//        if (map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol) return true;

//        if (map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol) return true;
//        if (map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol) return true;
//        if (map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol) return true;
//
//        if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) return true;
//        if (map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol) return true;

        return false;
    }

    private static void humanTurn() {
        int rowNumber, colNumber;
        do{
            System.out.println("Ход пользователя. Введите номер строки и столбца");
            System.out.print("Строка = ");
            rowNumber = scanner.nextInt();
            System.out.print("Колонка = ");
            colNumber = scanner.nextInt();
        } while (!isCellValid(rowNumber,colNumber));

        map[rowNumber - 1][colNumber - 1] = DOT_X;
    }

    private static void aiTurn() {
        System.out.println("Ход компьютера.");
        int rowNumber, colNumber;
        do{
            rowNumber = random.nextInt(SIZE) + 1;
            colNumber = random.nextInt(SIZE) + 1;
        } while (!isCellValid(rowNumber,colNumber));

        map[rowNumber - 1][colNumber - 1] = DOT_O;
    }

    private static boolean isCellValid(int rowNumber, int colNumber) {
        if (rowNumber < 1 || rowNumber > SIZE)
            return false;
        if (colNumber < 1 || colNumber > SIZE)
            return false;

        return map[rowNumber - 1][colNumber - 1] == DOT_EMPTY;
    }

    private static void printMap() {
        printHeaderMap();
        printMapRows();
    }

    private static void printMapRows() {
        for (int i = 0; i < SIZE; i++) {
            printColumnNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void printColumnNumber(int i) {
        int columnNumber = i + 1;
        System.out.print(columnNumber + " ");
    }

    private static void printHeaderMap() {
        printEmptyHeaderForFirstColumn();
        for (int i = 0; i < SIZE; i++) {
            printColumnNumber(i);
        }
        System.out.println();
    }

    private static void printEmptyHeaderForFirstColumn() {
        System.out.print(EMPTY_COLUMN_TITLE);
    }

    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
}
