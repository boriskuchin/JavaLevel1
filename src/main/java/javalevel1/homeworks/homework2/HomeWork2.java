package javalevel1.homeworks.homework2;

public class HomeWork2 {
    public static void main(String[] args) {

    }
    private static boolean isSumInInterval(int varA, int varB) {
        /* 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
        от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
        */
        return (varA + varB >= 10) && (varA + varB <= 20);
    }

    private static void printSign(int number) {
        /*2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.*/
        String sign = number >= 0? "положительное":"отрицетельное";
        System.out.printf("Число: %s %s \n",number, sign);
    }

    private static boolean isNegative(int number) {
        /*3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.*/
        return number < 0;
    }

    private static void cyclicPrint(int number, String str) {
        /*4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;*/

        if (number < 1) {
            System.out.println("Вы ввели 0 или отрицательное число");
        } else {
            while (number-- > 0) {
                System.out.println(str);
            }
        }
    }

    private static boolean isLeapYear(int year) {
        /*5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/

        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
}
