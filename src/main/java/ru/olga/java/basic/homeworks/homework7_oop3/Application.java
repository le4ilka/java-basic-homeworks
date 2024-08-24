package ru.olga.java.basic.homeworks.homework7_oop3;

public class Application {
    public static void main(String[] args) {

        Transport bike = new Bacycle("Salut");
        Transport car = new Car("BMW");
        Transport horse = new Horse("Plotva");
        Transport ccVechicle = new CrossCountryVechicle("Jeep");

        Human h1 = new Human("Ivan");
        Human h2 = new Human("Olga");
        Human h3 = new Human("Artem");

        h1.putOnTransport(bike);
        h1.move(5, Places.FOREST);

        h2.move(3, Places.SWAMP);

        h2.putOnTransport(car);
        h2.move(12, Places.SWAMP);

        h3.putOnTransport(horse);
        h3.move(7, Places.FOREST);

        h3.putOnTransport(ccVechicle);
        h3.move(12, Places.SWAMP);

        h1.putOnTransport(car);
        h1.move(20, Places.FOREST);

    }
}
