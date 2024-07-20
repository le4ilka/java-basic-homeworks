package ru.olga.java.basic.homeworks.homework2;

import java.util.Arrays;

public class hw2 {
    public static void main(String[] args) {
        printString(5, "Hello");

        int[] arr = {1, 2, 3, 4, 5, 6, 8};
        sumBigElements(arr);
        int a = 9;
        fillArray(arr, a);
        System.out.println(Arrays.toString(arr));
        encreaseArray(arr, a);
        System.out.println(Arrays.toString(arr));
        compareHalfsOfArray(arr);
    }

    /**
     *  2.5. метод, принимаĀûий в каùестве аргумента øелоùисленнýй массив, и пеùатаĀûий в
     * консолþ информаøиĀ о том, сумма ÿлементов какой из половин массива болþúе;
     * @param arr массив, который нужно рассчитать
     */
    private static void compareHalfsOfArray(int[] arr) {
        int sumRight = 0;
        int sumLeft = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length / 2) {
                sumRight += arr[i];
            } else {
                sumLeft += arr[i];
            }
        }
        if (sumRight>sumLeft){
            System.out.println("Сумма элементов левой половины больше");
        } else if (sumRight<sumLeft) {
            System.out.println("Сумма элементов правой половины больше");
        } else if (sumRight==sumLeft){
            System.out.println("Сумма элементов правой и левой половины равны");
        }
    }

    /**
     * 2.4. метод, принимаĀûий в каùестве аргументов øелое ùисло и ссýлку на øелоùисленнýй
     * массив, увелиùиваĀûий каждýй ÿлемент массива на указанное ùисло;
     *
     * @param arr массив, который нужно изменить
     * @param a число на которое нужно увеличить каждый элемент массива
     */
    private static void encreaseArray(int[] arr, int a) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += a;
        }
    }

    /**
     * 2.3. метод, принимаĀûий в каùестве аргументов øелое ùисло и ссýлку на øелоùисленнýй
     * массив, метод должен заполнитþ каждуĀ ячейку массива указанным числом;
     *
     * @param arr - массив, который нужно проинициализировать
     * @param a   - число, которым заполнится массив
     */
    private static void fillArray(int[] arr, int a) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
        }
    }

    /**
     * 2.2. метод, принимаĀûий в каùестве аргумента øелоùисленнýй массив, суммируĀûий все
     * ÿлементý, знаùение которýх болþúе 5, и пеùатаĀûий полуùеннуĀ сумму в консолþ;
     *
     * @param arr массив, в котором нужно вычислить сумму элементов больше 5
     */
    private static void sumBigElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    /**
     * 2.1. метод, принимаĀûий в каùестве аргументов øелое ùисло и строку, и пеùатаĀûий в
     * консолþ строку указанное колиùество раз
     *
     * @param a count
     * @param b string
     */
    public static void printString(int a, String b) {
        for (int i = 0; i < a; i++) {
            System.out.println(b);
        }
    }
}
