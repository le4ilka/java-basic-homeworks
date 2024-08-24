package ru.olga.java.basic.homeworks.homework7_oop3;

public class Horse implements Transport{

    private String name;
    private int power;

    public Horse(String name){
        this.name = name;
        this.power = 70;
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
        power -= distance;
        System.out.println(name + " перемещает на " + distance + " через " + place + " и тратит силы. Осталось сил: " +
                power );
        return true;
    }


}
