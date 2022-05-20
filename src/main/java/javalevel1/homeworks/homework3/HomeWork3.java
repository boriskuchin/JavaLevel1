package javalevel1.homeworks.homework3;

import java.util.Arrays;
import java.util.Random;

public class HomeWork3 {

    static Random random = new Random();

    public static void main(String[] args) {
        createBinaryArray();
        fillArray();
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
}
