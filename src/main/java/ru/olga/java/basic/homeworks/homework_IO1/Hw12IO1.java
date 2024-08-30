package ru.olga.java.basic.homeworks.homework_IO1;

import java.io.*;
import java.nio.charset.StandardCharsets;
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

        printFileToScreen(fileName);

        System.out.println("\nУкажите какую строку добавить в файл:");
        Scanner scannerForString = new Scanner(System.in);
        String string = scannerForString.nextLine();

        writeInFile(string, fileName);

        printFileToScreen(fileName);

    }

    public static void printFileToScreen(String fileName) {
        try (InputStreamReader in = new InputStreamReader(new BufferedInputStream(new FileInputStream(fileName)))) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeInFile(String string, String fileName) {
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(fileName, true))) {
            byte[] buffer = string.getBytes(StandardCharsets.UTF_8);
            out.write(buffer);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
