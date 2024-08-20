package ru.olga.java.basic.homeworks;

import ru.olga.java.basic.homeworks.hw6_strings.Plate;
import ru.olga.java.basic.homeworks.hw6_strings.Cat;

public class GreetingsApplication {
    public static void main(String[] args) {
        //System.out.println("Hello, world!");

        Plate plate = new Plate(17);
        Cat[] cat = {new Cat("Барсик", 5),
                new Cat("Мурзик", 10),
                new Cat("Тузик", 12)};

        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
            System.out.println("Кот " + cat[i].getName() + " сытый? " + cat[i].isWellFed());
        }

    }
}
