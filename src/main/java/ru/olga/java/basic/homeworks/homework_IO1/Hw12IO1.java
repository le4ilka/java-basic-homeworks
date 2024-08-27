package ru.olga.java.basic.homeworks.homework_IO1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * приложение, позволяющее работать с текстовыми файлами
 * При старте приложения, в консоль выводится список текстовых файлов из корневого каталоге проекта
 * Далее программа запрашивает имя файла, с которым хочет работать пользователь
 * Содержимое файла выводится в консоль
 * Затем любую введенную пользователем строку необходимо записывать в указанный файл
 */
public class Hw12IO1 {
    public static void main(String[] args) {
        File dir = new File("./");
        File[] fileList = dir.listFiles();
        for (File file : fileList) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
        System.out.println("Укажите имя файла, который требуется вывести на экран:");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        System.out.println("Вы выбрали " + fileName + " файл содержит:");

        try (InputStreamReader in = new InputStreamReader(new FileInputStream(fileName))) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
