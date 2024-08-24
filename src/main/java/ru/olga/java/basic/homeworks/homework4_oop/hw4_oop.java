package ru.olga.java.basic.homeworks.homework4_oop;

import java.time.Year;

public class hw4_oop {
    public static void main(String[] args) {
        User[] users = {new User("Иголник", "Юрий", "Антонович", 1990, "skuf@mail.ru"),
                new User("Пилюлькин", "Иван", "Егорович", 1930, "skuf@mail.ru"),
                new User("Гусля", "Петр", "Николаевич", 1955, "skuf@mail.ru"),
                new User("Сиропчик", "Константин", "Иванович", 1980, "skuf@mail.ru"),
                new User("Знайка", "Дмитрий", "Никифорович", 1998, "skuf@mail.ru"),
                new User("Ежова", "Анна", "Васильевна", 1965, "skuf@mail.ru"),
                new User("Крюков", "Степан", "Фархатович", 1977, "skuf@mail.ru"),
                new User("Савельев", "Даниил", "Григорьевич", 1955, "skuf@mail.ru"),
                new User("Грибов", "Иван", "Львович", 1935, "skuf@mail.ru"),
                new User("Икатов", "Михаил", "Егорович", 1930, "skuf@mail.ru"),
        };
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                continue;
            }
            if (Year.now().getValue() - users[i].getYear() > 40) {
                users[i].printUser();
            }
        }
        Box box1 = new Box(1, "зелёная");
        box1.printBoxInfo();
        box1.setColor("красная");
        box1.printBoxInfo();
        Box box2 = new Box(2, "синяя");
        box2.printBoxInfo();
        box2.openCloseBox();
        box2.printBoxInfo();
        box1.fillBox("мяч");
        box1.printBoxInfo();
        box1.dropBox();
        box1.printBoxInfo();
        box2.dropBox();
        box1.fillBox("Зонт");
        box1.fillBox("Телефон");

    }
}
