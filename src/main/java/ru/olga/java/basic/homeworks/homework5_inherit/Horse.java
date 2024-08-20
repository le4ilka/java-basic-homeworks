package ru.olga.java.basic.homeworks.homework5_inherit;

public class Horse extends Animal {

    public Horse(String name, int speedRun, int speedSwim, int endurance) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.endurance = endurance;
        this.enduranceScore = 4;
    }

}
