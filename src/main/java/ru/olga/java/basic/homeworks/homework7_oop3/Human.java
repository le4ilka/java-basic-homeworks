package ru.olga.java.basic.homeworks.homework7_oop3;

public class Human {
    private String name;
    private Transport currentTransport;
    private int traveledDistance;
    private int endurance;

    public Human(String name) {
        this.name = name;
        this.traveledDistance = 0;
        this.endurance = 100;
    }

    String getName() {
        return name;
    }

    int getEndurance(){
        return endurance;
    }

    public void putOnTransport(Transport transport) {
        currentTransport = transport;
        transport.setDriver(this);
        System.out.println(name + " сел на транспорт " + transport.getName());
    }

    public void move(int distance, Places place) {
        boolean isMove;
        if (currentTransport != null) {
            isMove = currentTransport.move(distance, place);
            if (!isMove) {
                System.out.println(name + " пройденная дистанция " + traveledDistance);
                return;
            }
        } else {
            endurance -= distance;
            System.out.printf(name + " перемещается пешком на дистанцию %d и осталось сил %d \n", distance, endurance);
        }
        traveledDistance += distance;
        System.out.println(name + " пройденная дистанция " + traveledDistance);
    }

    public boolean reduceEndurance(int distance){
        if (endurance<=distance){
            System.out.println(name + " не хватит сил (" + endurance + ") на преодоление дистанции " + distance);
            return false;
        }
        endurance -= distance;
        return true;
    }


}
