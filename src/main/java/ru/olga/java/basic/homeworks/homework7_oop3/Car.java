package ru.olga.java.basic.homeworks.homework7_oop3;

public class Car implements Transport {

    private String name;
    private int fuel;
    private Human driver;

    public void setDriver(Human driver) {
        this.driver = driver;
    }

    public Car(String name) {
        this.name = name;
        this.fuel = 100;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean move(int distance, Places place) {
        if (driver == null) {
            System.out.println("Машина " + name + " не едет без водителя");
            return false;
        }
        if (fuel < distance) {
            System.out.printf(name + " не хватает топлива (%d) для прохождения дистанции %d \n", fuel, distance);
            return false;
        }
        if (place == Places.FOREST || place == Places.SWAMP) {
            System.out.println(name + " не едет по " + place);
            return false;
        }
        fuel -= distance;
        System.out.println(name + " перемещает " + driver.getName() + " на " + distance + " через " + place + " и тратит топливо. Осталось " +
                "бензина: " + fuel);
        return true;
    }


}
