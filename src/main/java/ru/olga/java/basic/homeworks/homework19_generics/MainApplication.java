package ru.olga.java.basic.homeworks.homework19_generics;

public class MainApplication {
    public static void main(String[] args) {
        System.out.println("Создание коробок");
        Box<Apple> box1 = new Box<>();
        Box<Fruit> box2 = new Box<>();
        Box<Orange> box3 = new Box<>();
        Box<Apple> box4 = new Box<>();

        System.out.println("Добавление фруктов в коробки");
        box1.add(new Apple(2), new Apple(3), new Apple(4));
        box2.add(new Fruit(3), new Orange(2), new Apple(1));
        box3.add(new Orange(1), new Orange(2));
        box4.add(new Apple(1), new Apple(1), new Apple(1));

        System.out.println("Вес коробок");
        box1.getWeight();
        box2.getWeight();
        box3.getWeight();
        box4.getWeight();

        System.out.println("Сравнение коробок");
        System.out.println(box3.compare(box1));
        System.out.println(box3.compare(box4));

        System.out.println("Пересыпание фруктов");
        box2.transferFruits(box2, box1);
        box2.getWeight();
        box1.getWeight();

        box1.transferFruits(box1, box4);
        box1.getWeight();
        box4.getWeight();

        box1.transferFruits(box2, box1);
        box2.getWeight();
        box1.getWeight();

        box2.transferFruits(box2, box3);
        box2.getWeight();
        box3.getWeight();
    }
}
