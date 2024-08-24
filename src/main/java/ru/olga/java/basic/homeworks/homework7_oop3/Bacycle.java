package ru.olga.java.basic.homeworks.homework7_oop3;

public class Bacycle implements Transport {
    private String name;

    public Bacycle(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean move(int distance, Places place) {
        if (place == Places.SWAMP){
            System.out.println(name + " не едет по " + place);
            return false;
        }
        System.out.println(name + " перемещает на " + distance + " через " + place);
        return true;
    }

}
