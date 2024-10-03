package ru.olga.java.basic.homeworks.homework19_generics;

import java.util.ArrayList;
import java.util.List;

public class Box<E extends Fruit> {

    private Enum<BoxTypes> boxType;
    private List<E> inBox;

    public Box(Enum boxType) {
        this.boxType = boxType;
        this.inBox = new ArrayList<>();
    }

    public void add(E... elements) {
        for (Fruit element : elements) {
            if (boxType.equals(BoxTypes.AppleBox) && !(element instanceof Apple)) {
                System.out.println("Нельзя положить " + element.getClass() + "  неяблоки в яблочную корзинку");
                continue;
            }
            if (boxType.equals(BoxTypes.OrangeBox) && !(element instanceof Orange)) {
                System.out.println("Нельзя положить " + element.getClass() + " неапельсины в апельсинную корзинку");
                continue;
            }
            inBox.add((E) element);
        }
        System.out.println("Фрукты размещены в корзинке");
    }

    public int getWeight() {
        int weight = 0;
        for (Fruit elem : inBox) {
            weight += elem.getWeight();
        }
        System.out.println("ВЕС: " + weight);
        return weight;
    }

    public boolean compare(Box boxToCompare) {
        if (this.getWeight() == boxToCompare.getWeight())
            return true;
        return false;
    }

    public void transferFruitsFrom(Box boxFrom){
            for (Object element : boxFrom.inBox) {
                if (boxType.equals(BoxTypes.AppleBox) && !(element instanceof Apple)) {
                    System.out.println("Нельзя положить " + element.getClass() + "  неяблоки в яблочную корзинку");
                    continue;
                }
                if (boxType.equals(BoxTypes.OrangeBox) && !(element instanceof Orange)) {
                    System.out.println("Нельзя положить " + element.getClass() + " неапельсины в апельсинную корзинку");
                    continue;
                }
                inBox.add((E) element);
                boxFrom.inBox.remove(element);
            }
            System.out.println("Фрукты перемещены из " + boxFrom + " в " + this);
    }

    @Override
    public String toString() {
        System.out.println("\nThere is in " + boxType + " box: ");
        for (Fruit elem : inBox) {
            System.out.println(elem);
        }
        return super.toString();
    }
}
