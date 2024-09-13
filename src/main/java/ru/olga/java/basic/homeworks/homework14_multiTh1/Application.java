package ru.olga.java.basic.homeworks.homework14_multiTh1;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        int size = 100_000_000;

        double[] array1 = new double[size];
        //long startTime1 = System.currentTimeMillis();
        long startTime1 = System.nanoTime();
        fillArray(array1);
        //long finishTime1 = System.currentTimeMillis();
        long finishTime1 = System.nanoTime();
        System.out.println("Первая реализация - " + (finishTime1 - startTime1));

        double[] array2 = new double[size];
        //long startTime2 = System.currentTimeMillis();
        long startTime2 = System.nanoTime();
        fillArrayByThreads(array2);
        //long finishTime2 = System.currentTimeMillis();
        long finishTime2 = System.nanoTime();
        System.out.println("Вторая реализация - " + (finishTime2 - startTime2));
    }

    private static void fillArrayByThreads(double[] array2) throws InterruptedException {
        int size = array2.length;
        Thread task1 = new Thread(new FillArrayByThreads(array2, 0, size / 4));
        Thread task2 = new Thread(new FillArrayByThreads(array2, size / 4, size / 2));
        Thread task3 = new Thread(new FillArrayByThreads(array2, size / 2, 3 * size / 4));
        Thread task4 = new Thread(new FillArrayByThreads(array2, 3 * size / 4, size));
        task1.start();
        task2.start();
        task3.start();
        task4.start();
        task1.join();
        task2.join();
        task3.join();
        task4.join();
    }

    public static void fillArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }

}
