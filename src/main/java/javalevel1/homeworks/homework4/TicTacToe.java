package javalevel1.homeworks.homework4;

import java.awt.image.ImageProducer;
import java.util.Scanner;

public class TicTacToe {

    private static final String EMPTY_FIELD = "•";
    private static final String HUMAN_FIELD = "X";
    private static final Scanner scanner = new Scanner(System.in);
    private static int size;
    private static String[][] map;

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
    }

    private static void playGame() {
        for (int i = 0; i < 9; i++) {
            //ход человека
            humanTurn();
            printMap();

            //проверка на конец игры
            //ход компьютера
            //отрисовать поле
            //проверка на конец игры

        }

    }

    private static void humanTurn() {
        int xField = inputField("X");
        int yField = inputField("Y");


        map[yField-1][xField-1] = HUMAN_FIELD;

    }

    private static int  inputField(String coordinate) {
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

    public static boolean isSizeCorrect(int n) {
        return n > 1;
    }

    public static boolean isHumanInputCorrect(int field, int size) {
        if (field > 0 && field <= size) {
            return true;
        } else {
            System.out.println("Необходимо ввести целое число больше или равно 1 и меньше или равно " + size);
            return false;
        }

    }

}
