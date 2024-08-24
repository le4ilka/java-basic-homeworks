package ru.olga.java.basic.homeworks.hw6_strings;

public class Cat {
    private String name;
    private int appetite;
    private boolean wellFed;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public boolean isWellFed() {
        return wellFed;
    }

    public void eat(Plate plate) {
        if (plate.getCurrentAmountOfFood() < appetite) {
            System.out.println("Коту " + name + " мало еды в тарелке");
        } else {
            plate.redusingFood(appetite);
            wellFed = true;
        }
    }
}
