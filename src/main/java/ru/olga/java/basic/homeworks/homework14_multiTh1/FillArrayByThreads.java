package ru.olga.java.basic.homeworks.homework14_multiTh1;

public class FillArrayByThreads implements Runnable {
    private int begin;
    private int end;
    private double[] array;

    public FillArrayByThreads(double[] array, int begin, int end) {
        this.begin = begin;
        this.end = end;
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = begin; i < end; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }
}
