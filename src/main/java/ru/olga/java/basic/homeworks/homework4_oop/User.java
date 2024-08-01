package ru.olga.java.basic.homeworks.homework4_oop;

public class User {
    private String surname;
    private String name;
    private String fathername;

    private int year;
    private String email;

    public int getYear() {
        return year;
    }

    public User() {
        this.surname = "nosurname";
        this.name = "noname";
        this.fathername = "nofathername";
        this.year = 0;
        this.email = "noemail";
    }

    public User(String surname, String name, String fathername, int year, String email) {
        this.surname = surname;
        this.name = name;
        this.fathername = fathername;
        this.year = year;
        this.email = email;
    }

    public void printUser() {
        System.out.println("ФИО: " + this.surname + " " + this.name + " " + this.fathername + "\n" + "Год рождения: " + this.year + "\n" +
                "e-mail: " + this.email);
        System.out.println();

    }

}
