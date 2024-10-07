package ru.olga.java.basic.homeworks.homework21.multiTh2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Создайте пул потоков
 * Задайте пулу три задачи: первая должна 5 раз напечатать букву A, вторая - B, третья - C
 * Синхронизируйте потоки в пуле таким образом, чтобы в любой ситуации в консоль печаталась последовательность ABCABCABCABCABC
 * После печати всех символов программа должна завершиться
 */
public class MainApplication {

    private static String lastLetter = "C";
    private static final Object monitor = new Object();

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(() -> MainApplication.printA());
        executorService.execute(MainApplication::printB);
        executorService.execute(MainApplication::printC);

        executorService.shutdown();
    }

    public static void printA() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (!lastLetter.equals("C")) {
                        monitor.wait();
                    }
                    lastLetter = "A";
                    System.out.println(lastLetter);
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printB() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (!lastLetter.equals("A")) {
                        monitor.wait();
                    }
                    lastLetter = "B";
                    System.out.println(lastLetter);
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printC() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (!lastLetter.equals("B")) {
                        monitor.wait();
                    }
                    lastLetter = "C";
                    System.out.println(lastLetter);
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
