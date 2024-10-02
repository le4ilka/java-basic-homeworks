package ru.olga.java.basic.homeworks.homework20_IO2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        System.out.println("Введите название файла и искомую последовательность символов через пробел");
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        if (input.length !=2 ){
            System.out.println("Неверный формат ввода попробуйте снова");
        }
        String fileName = input[0];
        String forSearch = input[1];

        char[] forSearchCharArray = forSearch.toCharArray();
        int count = 0;
        int charNum = 0;
        char charToCompare = forSearchCharArray[charNum];

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(input[0]))) {
            int symbol;
            while ((symbol = bufferedReader.read()) != -1) {

                if ((char) symbol != charToCompare) {
                    charNum = 0;
                    charToCompare = forSearchCharArray[charNum];
                }

                if ((char) symbol == charToCompare) {
                    charNum++;
                    if (charNum < forSearchCharArray.length) {
                        charToCompare = forSearchCharArray[charNum];
                    }
                    if (charNum == forSearchCharArray.length) {
                        count++;
                    }
                }
            }
            System.out.println("В файле \"" + fileName + "\" последовательность \"" + forSearch + "\" встречается " + count + " раз");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
