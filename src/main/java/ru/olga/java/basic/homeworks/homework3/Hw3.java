package ru.olga.java.basic.homeworks.homework3;

public class Hw3 {
    public static void main(String[] args) {
        int[][] arr = {{31, 28, 31, 4},
                {30, 31, 30, 8},
                {31, 31, 30, -7},
                {31, 30, 131, 6}
        };
        int[][] arr1 = {{31, 28, 31, 4}};
        System.out.println("Сумма положительных элементов массива = " + sumOfPositiveElements(arr));
        drawSquare(arr[0][3]);
        nullDiagonal(arr);
        System.out.println("Максимальное значение массива - " + findMax(arr));
        System.out.println("Сумма элементов второй строки массива - " + sumOfElementsOfSecondLine(arr));
        System.out.println("Сумма элементов второй строки массива - " + sumOfElementsOfSecondLine(arr1));
    }

    /**
     * 3.5. метод, который считает сумму элементов второй строки двумерного массива, если второй строки не существует,
     * то в качестве результата необходимо вернуть -1
     *
     * @param arr - массив, в котором ищем сумму элементов второй строки
     * @return - возвращаем сумму элементов второй строки, либо -1
     */
    public static int sumOfElementsOfSecondLine(int[][] arr) {
        System.out.println("Задание 5");
        int sum = 0;
        if (arr.length < 2) {
            return -1;
        }
        for (int i = 0; i < arr[2].length; i++) {
            sum += arr[2][i];
        }
        return sum;
    }


    /**
     * 3.4. метод, который должен найти и вернуть максимальный элемент массива;
     *
     * @param array - массив, в котором нужно найти максимум
     * @return max - максимальный элемент массива
     */
    public static int findMax(int[][] array) {
        System.out.println("Задание 4");
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    /**
     * 3.3. метод, принимающий в качестве аргумента двумерный целочисленный массив, и зануляющий его
     * диагональные элементы (можете выбрать любую из диагоналей, или занулить обе);
     *
     * @param arr - массив, в котормо нужно занулить диагонали
     */
    public static void nullDiagonal(int arr[][]) {
        System.out.println("Задание 3");
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 0;
            arr[i][arr[i].length - i - 1] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    /**
     * 3.2. метод, который принимает в качестве аргумента int size и печатает в консоль квадрат
     * из символов * со сторонами соответствующей длины;
     *
     * @param size - размер квадрата
     */
    public static void drawSquare(int size) {
        System.out.println("Задание 2");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }


    /**
     * 3.1. Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный массив,
     * метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;
     *
     * @param arr - массив, сумму положительных эелемнтов которого нужно рассчитать
     */
    public static int sumOfPositiveElements(int[][] arr) {
        System.out.println("Задание 1");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }

            }
        }
        return sum;

    }
}
