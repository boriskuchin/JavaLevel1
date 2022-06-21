package javalevel2.homeworks.homework2;

import javalevel2.homeworks.homework2.exceptionClasses.MyArrayDataException;
import javalevel2.homeworks.homework2.exceptionClasses.MyArraySizeException;

public class Main {
    public static void main(String[] args) {
        String[][] arr = { {"1","2","3","4"},
                        {"1","2","3","3","4"},
                        {"1","2","3","w4"},
                        {"1","2","3","5"}};

        try {
            System.out.println(String.format("Сумма элеменов массива равна %s", sumFourByFourArray(arr)));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }


    public static int sumFourByFourArray(String[][] stringArray) throws MyArraySizeException, NumberFormatException {
        int sum = 0;

        if (stringArray.length != 4) {
            throw new MyArraySizeException(String.format("Сложение прервано, так как должно быть 4 строки, а фактическое значение %s строк%n", stringArray.length));
        }

        for (int i = 0; i <stringArray.length ; i++) {
            if (stringArray[i].length != 4) {
                throw new MyArraySizeException(String.format("Сложение прервано, так как в каждой строке должно быть 4 колонки, но в строку %s передано %s колонок %n", i, stringArray[i].length));
            }
        };

        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[i].length; j++) {
                try{
                    sum += Integer.parseInt(stringArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("Сложение прервано, так как элемент \"%s\" в ячейке (%s,%s) не может быть переведен в число%n", stringArray[i][j], i, j));
                }
            }
        }

        return sum;
    }



}
