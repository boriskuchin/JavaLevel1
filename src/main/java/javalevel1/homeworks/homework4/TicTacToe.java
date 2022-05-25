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
    private static int countToWin;
    private static int lastTurnLine;
    private static int lastTurnColl;


    public static void main(String[] args) {
        init();
        printMap();
        playGame();
        endGame();

    }

    private static void endGame() {
        scanner.close();
        System.out.println("До скорых встреч!");
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

        do {
            System.out.print("Введите количество ходов в 1 ряд для победы: ");
            if (scanner.hasNextInt()) {
                countToWin = scanner.nextInt();
                if (!((countToWin >= 2) && (countToWin <= size))) {
                    System.out.println("Необходимо ввести целое число больше или равно 2 и меньше или равно " + size);
                }
            } else {
                System.out.println("Необходимо ввести целое число больше или равно 2 и меньше или равно " + size);
                scanner.next();
            }
        } while (!((countToWin >=2) && (countToWin <=size)));

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
            if (checkWin(countToWin, HUMAN_FIELD)) {
                System.out.println("ПВы победили. Поздравляю!");
                break;
            }
            if (blankFieldsCount==0) {
                System.out.println("Ничья!");
                break;
            }

            AITurn();
            printMap();
            if (checkWin(countToWin, AI_FIELD)) {
                System.out.println("Компьютер выйграл");
                break;
            }
            if (blankFieldsCount==0) {
                System.out.println("Ничья!");
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
        lastTurnLine = yField;
        lastTurnColl = xField;
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
        lastTurnLine = yField;
        lastTurnColl = xField;

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

    private static String[][] getArraysToCheckWins(int line, int coll) {
        String[][] arrays = new String[4][];

        //Смотрим вертикать
        arrays[0] = new String[size];
        for (int i = 0; i < size; i++) {
            arrays[0][i] = map[i][coll];
        }

        //смотрим горизонталь
        arrays[1] = new String[size];
        for (int i = 0; i < size; i++) {
            arrays[1][i] = map[line][i];
        }

        //собираем диагонали

        int startLine = 0;
        int startColl = 0;

        //ищем начало первой диагонали
        for (int i = 0; (line - i) >=0 && (coll - i) >=0; i++) {
            startColl = coll - i;
            startLine = line - i;
        }
        //инициализируем массив для первой диагонали
        arrays[2] = new String[size - max(startColl, startLine)];

        //заполняем диагональ
        for (int i = 0; i < arrays[2].length; i++) {
            arrays[2][i] = map[startLine + i][startColl + i];
        }

        //ищем начало второй диагонали
        for (int i = 0; ((line + i) <=size-1) && (coll - i) >=0; i++) {
            startColl = coll - i;
            startLine = line + i;
        }
        //инициализируем массив для второй диагонали
        if (startColl == 0) {
            arrays[3] = new String[startLine + 1];
        } else {
            arrays[3] = new String[size - startColl];
        }
        //заполняем диагональ
        for (int i = 0; i< arrays[3].length; i++) {
            arrays[3][i] = map[startLine - i][startColl + i];
        }

        return arrays;

        }

    private static int max(int startColl, int startLine) {
        return startColl > startLine ? startColl : startLine;
    }

    private static boolean checkWin(int countToWin, String sign) {
        String[][] arraysToCheckWin = getArraysToCheckWins(lastTurnLine, lastTurnColl);

        int countSigns;
        boolean result = false;

        for (String[] line : arraysToCheckWin) {
            countSigns = 0;

            if (line.length < countToWin) {
                continue;
            } else {
                for (String ch : line) {
                    if (ch.equals(sign)) {
                        countSigns++;
                        if (countSigns == countToWin) {
                            result = true;
                        }
                    } else {
                        countSigns = 0;
                    }
                }
            }
        }
        return result;
    }
}
