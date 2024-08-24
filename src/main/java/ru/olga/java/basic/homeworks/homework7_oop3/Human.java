package ru.olga.java.basic.homeworks.homework7_oop3;

public class Human {
    private String name;
    private Transport currentTransport;
    int traveledDistance;

    public Human(String name) {
        this.name = name;
        this.traveledDistance = 0;
    }

    public void putOnTransport(Transport transport) {
        currentTransport = transport;
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
            System.out.println(name + " перемещается пешком " + " на дистанцию " + distance);
        }
        traveledDistance += distance;
        System.out.println(name + " пройденная дистанция " + traveledDistance);
    }


}
