package ru.olga.java.basic.homeworks.homework5_inherit;

public class Cat extends Animal {
    public Cat(String name, int speedRun, int endurance) {
        this.name = name;
        this.speedRun = speedRun;
        this.endurance = endurance;
    }

    @Override
    public int swim(int distance) {
        System.out.println(name + " не плавает");
        return -1;
    }

    @Override
    protected int swimEnduranceCosts(int distance) {
        return -1;
    }

}
