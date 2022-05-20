package javalevel1.homeworks.homework3;

import java.util.Arrays;
import java.util.Random;

public class HomeWork3 {

    static Random random = new Random();

    public static void main(String[] args) {
        createBinaryArray();
        fillArray();
        multiplyNumbersByTwo();
        drawDiagonalMatrix();
        System.out.println(Arrays.toString(createArray(10, 6)));
    }

    public static void createBinaryArray() {
        /*1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/

        System.out.println("---------------Задание 1---------------");

        // Создаем массив случайной длины и заполняем его слуяайными значениями
        int randomBoundary = 15;
        int[] array = new int[random.nextInt(randomBoundary)];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2);
        }
        System.out.printf("Изходный массив:   %s %n",Arrays.toString(array));

        //Меняем значения
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 - array[i];
        }

        System.out.printf("Измененный массив: %s %n",Arrays.toString(array));


    }

    public static void fillArray() {
        /*2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;*/

        System.out.println("---------------Задание 2---------------");

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        System.out.printf("Результат: %s%n", Arrays.toString(array));

    }

    public static void multiplyNumbersByTwo() {
        /*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;*/

        System.out.println("---------------Задание 3---------------");

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.printf("Изходный массив:   %s %n", Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }

        System.out.printf("Измененный массив: %s %n", Arrays.toString(arr));
    }

    public static void drawDiagonalMatrix() {
        /*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
        заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы
        одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];*/

        System.out.println("---------------Задание 4---------------");

        int matrixSize = random.nextInt(10) + 5;

        int[][] matrix = new int[matrixSize][matrixSize];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i == j) || (i + j == matrixSize - 1)) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }

            }
        }
        for (int[] line : matrix) {
            System.out.println(Arrays.toString(line));

        }
    }


    public static int[] createArray(int len, int initialValue ) {
        /*5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;*/

        System.out.println("---------------Задание 5---------------");

        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }


}
