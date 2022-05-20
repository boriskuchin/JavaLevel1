package javalevel1.homeworks.homework3;

import javax.sound.midi.Soundbank;
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
        findMinMaxInArray();
        System.out.println(isSumSymmetric(new int[]{2, 2, 2, 1, 2, 2, 10, 1}));
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

    public static void findMinMaxInArray() {
        /*6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;*/

        System.out.println("---------------Задание 6---------------");

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        int[] array = new int[random.nextInt(10) + 10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200) - 100;
            if (array[i] > maxValue) maxValue = array[i];
            if (array[i] < minValue) minValue = array[i];
        }

        System.out.printf("Массив: %s %n", Arrays.toString(array));
        System.out.printf("Минимальное значение: %d, максимальное значение: %d %n", minValue, maxValue);
    }

    public static boolean isSumSymmetric(int[] array) {
        /*7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.*/

        System.out.println("---------------Задание 7---------------");

        System.out.printf("Заданный массив: %s %n", Arrays.toString(array));

        boolean isFound = false;
        for (int i = 0; i < array.length; i++) {
            int leftSum = subArraySum(array, 0, i);
            int rightSum = subArraySum(array, i, array.length);
            if ( leftSum == rightSum) {
                isFound = true;
                System.out.printf("Точка симметрии суммы найдена. Слева и справа от позицции %d сумма массива равна %d %n", i, rightSum);

            }
        }

        if (!isFound) {
            System.out.printf("Точка симметрии суммы не найдена.%n");
        }
        return isFound;
    }

    public static int subArraySum(int[] array, int startPos, int endPos) {
        /*Суммирует значение массива в диапазоне от startPos (включительно) до  endPos (не включительно) */

        int sum = 0;

        for (int i = startPos; i < endPos; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void mm() {
        /*8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
        при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя
        пользоваться вспомогательными массивами.
        Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
        При каком n в какую сторону сдвиг можете выбирать сами.*/

        
    }
}
