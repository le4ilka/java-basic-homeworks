package ru.olga.java.basic.homeworks;

import ru.olga.java.basic.homeworks.homework5_inherit.Animal;
import ru.olga.java.basic.homeworks.homework5_inherit.Cat;
import ru.olga.java.basic.homeworks.homework5_inherit.Dog;
import ru.olga.java.basic.homeworks.homework5_inherit.Horse;

public class GreetingsApplication {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        Animal[] animal = {
                new Cat("Myrsik", 5,2),
                new Dog("Quik", 6, 3, 13),
                new Cat("Barsik", 2,7),
                new Horse("Plotva", 6, 3, 20)
        };

        for (int i = 0; i < animal.length; i++) {
            animal[i].run(4);
            animal[i].swim(6);
            System.out.println(animal[i].info());
            System.out.println();
        }
    }
}
