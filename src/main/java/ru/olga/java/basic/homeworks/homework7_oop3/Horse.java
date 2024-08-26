package ru.olga.java.basic.homeworks.homework7_oop3;

public class Horse implements Transport{

    private String name;
    private int power;

    private Human driver;

    public Horse(String name){
        this.name = name;
        this.power = 70;
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
            System.out.println("Лошадь " + name + " не едет без наездника");
            return false;
        }
        if (power < distance){
            System.out.printf( name + " не хватает сил (%d) для прохождения дистанции %d \n", power, distance );
            return false;
        }
        if (place == Places.SWAMP){
            System.out.println(name + " не едет по " + place);
            return false;
        }
        power -= distance;
        System.out.println(name + " перемещает " + driver.getName() + " на " + distance + " через " + place + " и тратит силы. Осталось сил: " +
                power );
        return true;
    }


}
