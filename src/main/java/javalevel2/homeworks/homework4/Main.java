package javalevel2.homeworks.homework4;

import java.util.Arrays;

public class Main {

    static final int SIZE = 100000001;

    public static void main(String[] args) {

        System.out.printf("Are arrays equal? %s", Arrays.equals(checkTimeForOneThread(), checkTimeForTwoThreads()));
    }

    private static float[] checkTimeForOneThread() {
        float arr[] = new float[SIZE];
        initializeArray(arr);
        long startTime = System.currentTimeMillis();
        applyCrazyFormula(arr, 0);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        return arr;
    }

    private static float[] checkTimeForTwoThreads() {
        float arr[] = new float[SIZE];
        float[] firstHalfArray = new float[SIZE / 2];
        float[] secondHAlfArray = new float[SIZE - (SIZE / 2)];

        initializeArray(arr);
        long startTime = System.currentTimeMillis();

        System.arraycopy(arr, 0, firstHalfArray, 0, SIZE / 2);
        System.arraycopy(arr, SIZE / 2, secondHAlfArray, 0, SIZE - (SIZE / 2));

        Thread t1 = new Thread(() -> applyCrazyFormula(firstHalfArray,0));
        Thread t2 = new Thread(() -> applyCrazyFormula(secondHAlfArray,SIZE/2));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.arraycopy(firstHalfArray, 0, arr, 0, SIZE/2);
        System.arraycopy(secondHAlfArray, 0, arr, SIZE / 2, SIZE - SIZE / 2);

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        return arr;
    }

    private static void initializeArray(float[] arr) {
        Arrays.fill(arr, 1);
    }

    private static void applyCrazyFormula(float[] arr, int offset) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + (i+offset) / 5) * Math.cos(0.2f + (i+offset) / 5) * Math.cos(0.4f + (i+offset) / 2));
        }
    }
}
