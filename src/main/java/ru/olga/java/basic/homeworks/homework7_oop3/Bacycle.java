package ru.olga.java.basic.homeworks.homework7_oop3;

public class Bacycle implements Transport {
    private String name;
    private Human driver;

    public Bacycle(String name) {
        this.name = name;
    }

    public void setDriver(Human driver) {
        this.driver = driver;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean move(int distance, Places place) {
        if (driver == null) {
            System.out.println("Велосипед " + name + " не едет без водителя");
            return false;
        }
        if (!driver.reduceEndurance(distance)) {
            System.out.println("У " + driver.getName() + " нет сил");
            return false;
        }
        if (place == Places.SWAMP) {
            System.out.println(name + " не едет по " + place);
            return false;
        }

        System.out.println(name + " перемещает " + driver.getName() + " на " + distance + " через " + place + " и осталось сил " + driver.getEndurance());
        return true;
    }

}
