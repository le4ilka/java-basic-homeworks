package ru.olga.java.basic.homeworks.homework19_generics;

import static ru.olga.java.basic.homeworks.homework19_generics.BoxTypes.*;

public class MainApplication {
    public static void main(String[] args) {
        Box box1 = new Box(AppleBox);
        Box box2 = new Box(MultiFruitBox);
        Box box3 = new Box(OrangeBox);
        Box box4 = new Box(AppleBox);

        box1.add(new Fruit(2), new Orange(1), new Apple(3));
        System.out.println(box1.toString());
        box1.getWeight();

        box2.add(new Fruit(3), new Orange(2), new Apple(1));
        System.out.println(box2);
        box2.getWeight();

        box3.add(new Fruit(1), new Orange(1), new Apple(1));
        System.out.println(box3);
        box3.getWeight();

        box4.add(new Fruit(1), new Orange(1), new Apple(1));
        System.out.println(box3);
        box4.getWeight();

        System.out.println(box3.compare(box1));
        System.out.println(box3.compare(box4));

        System.out.println(box1);
        System.out.println(box4);
        //box1.transferFruitsFrom(box4);
        System.out.println(box1);
        System.out.println(box4);

    }

}
