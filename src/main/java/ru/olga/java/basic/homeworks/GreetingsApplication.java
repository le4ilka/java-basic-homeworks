package ru.olga.java.basic.homeworks;

import ru.olga.java.basic.homeworks.homework10_col2.PhoneBook;

public class GreetingsApplication {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ромул", "9213148417", "9213148418");
        phoneBook.add("Рем", "9213148419");
        System.out.println("Телефон Ромула " + phoneBook.find("Ромул"));
        System.out.println("Существует ли данный телефон в книге: " + phoneBook.containsPhoneNumber("9213148419"));
    }
}
