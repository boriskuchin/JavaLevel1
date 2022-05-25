package javalevel1.homeworks.homework4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static final String EMPTY_FIELD = "•";
    private static final String HUMAN_FIELD = "X";
    private static final String AI_FIELD = "0";
    private static final Scanner scanner = new Scanner(System.in);
    private static int size;
    private static String[][] map;
    private static final Random random = new Random();
    private static int blankFieldsCount;

    public static void main(String[] args) {
        init();
        printMap();
        playGame();
    }

    private static void init() {

        do {
            System.out.print("Введите размемр игрового поля: ");
            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
            } else {
                System.out.println("Необходимо ввести целое число больше 1");
                scanner.next();
            }
        } while (!isSizeCorrect(size));

        map = new String[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = EMPTY_FIELD;
            }

        }
        blankFieldsCount = size * size;
    }

    private static void printMap() {
        for (int i = 0; i < size + 1; i++) {
            System.out.printf("%3d", i);
        }

        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.printf("%3d", i + 1);
            for (int j = 0; j < size; j++) {
                System.out.printf("%3s", map[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void playGame() {

        while (true) {
            humanTurn();
            printMap();
            if (blankFieldsCount==0) {
                break;
            }

            AITurn();
            printMap();
            if (blankFieldsCount==0) {
                break;
            }
        }
    }

    private static void AITurn() {
        int xField;
        int yField;
        do {
            xField = random.nextInt(size);
            yField = random.nextInt(size);
        } while (!isFieldFree(xField, yField));

        map[yField][xField] = AI_FIELD;
        blankFieldsCount--;
    }

    private static void humanTurn() {
        int xField;
        int yField;

        do {
            xField = inputField("X") - 1;
            yField = inputField("Y") - 1;
            if (!isFieldFree(xField, yField)) {
                System.out.printf("Поле (%d,%d) уже занято. Выберите поле снова %n", xField + 1, yField + 1);
            }
        } while (!isFieldFree(xField, yField));

        map[yField][xField] = HUMAN_FIELD;
        blankFieldsCount--;

    }

    private static boolean isFieldFree(int xField, int yField) {
        return map[yField][xField] == EMPTY_FIELD;

    }

    private static int inputField(String coordinate) {
        int field = 0;
        do {
            System.out.printf("Введите значение %s: ", coordinate);
            if (scanner.hasNextInt()) {
                field = scanner.nextInt();
            } else {
                System.out.println("Необходимо ввести целое число");
                scanner.next();
            }
        } while (!isHumanInputCorrect(field, size));
        return field;
    }

    private static boolean isSizeCorrect(int n) {
        return n > 1;
    }

    private static boolean isHumanInputCorrect(int field, int size) {
        if (field > 0 && field <= size) {
            return true;
        } else {
            System.out.println("Необходимо ввести целое число больше или равно 1 и меньше или равно " + size);
            return false;
        }

    }

    private 
}
