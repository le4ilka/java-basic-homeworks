package ru.olga.java.basic.homeworks.homework9_col1;

import java.util.ArrayList;
import java.util.Arrays;

public class MainCollections {
    public static void main(String[] args) {
        System.out.println("Задание 1 \n" + listFromRange(-3, 7));
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 6, 2, 7, 4, 1));
        System.out.println("\nЗадание 2 \nВ списке " + list + " сумма элементов больше 5, равна: " + sumListElementLargerFive(list));
        System.out.println("\nЗадание 3 \nСписок " + list );
        rewriteList(5, list);
        System.out.println("Перезаписан " + list);

        System.out.println("\nЗадание 4 \nСписок " + list );
        increaseElementsOfList(5, list);
        System.out.println("Элементы списка увеличены " + list);

    }

    /**
     * 9.4. метод, принимающий в качестве аргументов целое число и ссылку на список, увеличивающий каждый элемент списка
     * на указанное число;
     * @param number
     * @param list
     */
    public static void increaseElementsOfList(int number, ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + number);
        }
    }
    /**
     * 9.3. метод, принимающий в качестве аргументов целое число и ссылку на список, метод должен переписать каждую
     * заполненную ячейку списка указанным числом;
     * @param number
     * @param list
     */
    public static void rewriteList(int number, ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            list.set(i, number);
        }
    }

    /**
     * 9.2. метод, принимающий в качестве аргумента список целых чисел, суммирующий все элементы, значение которых
     * больше 5, и возвращающий сумму
     * @param list - список элементов
     * @return - возвращает сумму элементов, которые больше 5
     */
    public static int sumListElementLargerFive(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 5){
                sum += list.get(i);
            }
        }
        return sum;
    }

    /**
     * 9.1. метод, принимающий в качестве аргументов числа min и max, и возвращающий ArrayList с набором последовательных
     * значений в указанном диапазоне (min и max включительно, шаг - 1);
     *
     * @param min
     * @param max
     * @return
     */
    public static ArrayList<Integer> listFromRange(int min, int max) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int element = min;
        while (element <= max) {
            list.add(element);
            element += 1;
        }
        return list;
    }
}


