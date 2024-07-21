package ru.olga.java.basic.homeworks.homework1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 5");
        int methodNumber;
        Scanner scanner = new Scanner(System.in);
        do {
            methodNumber = scanner.nextInt();
        }
        while (methodNumber < 1 || methodNumber > 5);

        if (methodNumber == 1){
            greetings();
        } else if (methodNumber == 2) {
            checkSign(getRandomInt(), getRandomInt(), getRandomInt());
        } else if ( methodNumber == 3 ) {
            selectColor();
        } else if (methodNumber == 4 ) {
            compareNumbers();
        } else if (methodNumber == 5) {
            addOrSubtractAndPrint(getRandomInt(), getRandomInt(), true);
            addOrSubtractAndPrint(getRandomInt(), getRandomInt(), false);
        }
    }

    public static int getRandomInt() {
        return (int) (Math.random() * 10);
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 0;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void selectColor() {
        int data = 0;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void checkSign(int a, int b, int c) {
        if (a + b + c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava\n");
    }
}
