package ru.olga.java.basic.homeworks.homework5_inherit;

public class Dog extends Animal {
    private static int enduranceScore = 2;

    public Dog(String name, int speedRun, int speedSwim, int endurance) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.endurance = endurance;
    }

    @Override
    public int swimEnduranceCosts(int distance) {
        return distance * enduranceScore;
    }
}
