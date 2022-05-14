package Lesson1;

import java.util.concurrent.ThreadLocalRandom;

public class HomeWorkApp {


    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    public static void printThreeWords() {
        System.out.println("----------printThreeWords()----------");
        System.out.println("Orange\n" + "Banana\n" + "Apple");
    }

    public static void checkSumSign() {
        int varA = ThreadLocalRandom.current().nextInt(10) - 5;
        int varB = ThreadLocalRandom.current().nextInt(10) - 5;

        System.out.println("----------checkSumSign()----------");
        System.out.println("VarA = " + varA + ", " + "VarA = " + varB);
        if ((varA + varB) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }


    }

    public static void printColor() {
        int value = (ThreadLocalRandom.current().nextInt(400) - 200);

        System.out.println("----------printColor()----------");
        System.out.println("value = " + value);

        if (value <= 0) {
            System.out.println("Красный");
        } else if ((value > 0) && (value <= 100)) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");

        }
    }

    private static void compareNumbers() {
        int varA = ThreadLocalRandom.current().nextInt(10) - 5;
        int varB = ThreadLocalRandom.current().nextInt(10) - 5;

        System.out.println("----------compareNumbers()----------");
        System.out.println("VarA = " + varA + ", " + "VarA = " + varB);
    }


}

