package ru.olga.java.basic.homeworks.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        printString(5, "Hello");
        int a = 9;
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 5};
        int[] arr1 = {1, 2, 0, 5};

        sumBigElements(arr);
        fillArray(arr, a);
        System.out.println(Arrays.toString(arr));
        encreaseArray(arr, a);
        System.out.println(Arrays.toString(arr));
        compareHalfsOfArray(arr);
        findEqualSumOfArraysElements(arr);

        сheckArraySort(arr1);
        reversArray(arr1);

    }

    /**
     * 2.4*. метод, “перевораùивающий” входящий массив
     * Пример: { 1 2 3 4 } => { 4 3 2 1 }
     * @param arr1 массив, который нужно перевернуть
     */
    public static void reversArray(int[] arr1) {
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[arr1.length - 1 - i] = arr1[i];
        }
        System.out.println(Arrays.toString(result));
    }

    /**
     * 2.3*. метод, проверяющий что все ÿлементý массива идут в порядке убывания или
     * возрастания (по выбору пользователя)
     *
     * @param arr массив, который анализируем на наличие сортировки по возрастанию или по убыванию
     */
    public static void сheckArraySort(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите сортировку:\n1 - по возрастанию\n2 - по убыванию");
        int a = scanner.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (a == 1) {//по возрастанию
                if (arr[i] < arr[i + 1]) {
                    flag = true;
                } else {
                    System.out.println("Элементы массива " + Arrays.toString(arr) + " расположены не по возрастанию");
                    flag = false;
                    break;
                }
            } else if (a == 2) {//по убыванию
                if (arr[i] > arr[i + 1]) {
                    flag = true;
                } else {
                    System.out.println("Элементы массива " + Arrays.toString(arr) + " расположены не по убыванию");
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            if (a == 1) {
                System.out.println("Элементы массива " + Arrays.toString(arr) + " расположены по возрастанию");
            } else if (a == 2) {
                System.out.println("Элементы массива " + Arrays.toString(arr) + " расположены по убыванию2");
            }
        }
    }

    /**
     * 2.2*. метод, проверяющий что есть “точка” в массиве, в которой сумма левой и правой частей
     * равны. “Точка находится между элементами”;
     *
     * @param arr массив в котором ищем точку равенства элементов
     */
    public static void findEqualSumOfArraysElements(int[] arr) {
        int sumLeft = 0;
        int sumRight = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            sumRight += arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                sumLeft += arr[j];
            }
            if (sumRight == sumLeft) {
                System.out.println("Точка равенства элементов массива находится между элементами " + (i + 1) + " и " + (i + 2));
                flag = true;
                break;
            } else {
                sumLeft = 0;
            }
        }
        if (!flag) {
            System.out.println("Точки равенства элементов массива нет");
        }

    }


    public static void arraysSum(int[] args) {

    }

    /**
     * 2.5. метод, принимаĀûий в каùестве аргумента øелоùисленнýй массив, и пеùатаĀûий в
     * консолþ информаøиĀ о том, сумма ÿлементов какой из половин массива болþúе;
     *
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
        if (sumRight > sumLeft) {
            System.out.println("Сумма элементов левой половины больше");
        } else if (sumRight < sumLeft) {
            System.out.println("Сумма элементов правой половины больше");
        } else if (sumRight == sumLeft) {
            System.out.println("Сумма элементов правой и левой половины равны");
        }
    }

    /**
     * 2.4. метод, принимаĀûий в каùестве аргументов øелое ùисло и ссýлку на øелоùисленнýй
     * массив, увелиùиваĀûий каждýй ÿлемент массива на указанное ùисло;
     *
     * @param arr массив, который нужно изменить
     * @param a   число на которое нужно увеличить каждый элемент массива
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
