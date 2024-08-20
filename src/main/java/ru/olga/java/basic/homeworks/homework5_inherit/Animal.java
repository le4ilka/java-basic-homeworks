package ru.olga.java.basic.homeworks.homework5_inherit;

public abstract class Animal {
    String name;
    int speedRun;
    int speedSwim;
    int endurance;
    boolean isTired;
    int enduranceScore;


    public int run(int distance) {
        int timeOfRun = distance / speedRun;
        endurance -= distance;
        System.out.println(name + " бежит");
        if (endurance <= 0) {
            System.out.println(name + " устал и не может дальше бежать");
            isTired = true;
            endurance = 0;
            return -1;
        }
        System.out.println(name + " бегал " + timeOfRun + " сек.");
        return timeOfRun;
    }

    //    public abstract int swim(int distance);
    public int swimEnduranceCosts(int distance) {
        return distance * enduranceScore;
    }

    public int swim(int distance) {
        int timeSwim = distance / speedSwim;
        endurance -= swimEnduranceCosts(distance) * distance;
        System.out.println(name + " плывет");
        if (endurance <= 0) {
            System.out.println(name + " устал и не может дальше плыть");
            isTired = true;
            endurance = 0;
            return timeSwim = -1;
        }
        System.out.println(name + " плавал " + timeSwim + " сек.");
        return timeSwim;
    }

    public String info() {
        if (isTired) {
            return name + " уставший ";
        }
        return name + " активный ";
    }

}
