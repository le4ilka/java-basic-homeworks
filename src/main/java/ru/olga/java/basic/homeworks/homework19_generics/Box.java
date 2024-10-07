package ru.olga.java.basic.homeworks.homework19_generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> inBox;

    public Box() {
        this.inBox = new ArrayList<>();
    }

    public void add(T... elements) {
        inBox.addAll(Arrays.asList(elements));
    }

    public int getWeight() {
        int weight = 0;
        for (Fruit elem : inBox) {
            weight += elem.getWeight();
        }
        return weight;
    }

    public boolean compare(Box boxToCompare) {
        return this.getWeight() == boxToCompare.getWeight();
    }

    public void transferFruits(Box<? super T> dest, Box<? extends T> src) {
        dest.inBox.addAll(src.inBox);
        src.inBox.clear();
    }

    @Override
    public String toString() {
        System.out.println("There is in " + " box: ");
        for (Fruit elem : inBox) {
            System.out.println(elem);
        }
        getWeight();
        return super.toString();
    }
}
