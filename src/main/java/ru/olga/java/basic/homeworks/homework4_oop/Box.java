package ru.olga.java.basic.homeworks.homework4_oop;

public class Box {
    private final int size;
    private String color;
    private boolean isClosed;
    private String item;
    private boolean isFull;

    public Box(int size, String color) {
        this.size = size;
        this.color = color;
    }


    public boolean openCloseBox() {
        isClosed = !isClosed;
        System.out.println(getStatus() + "\n");
        return isClosed;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Цвет коробки изменен на " + color + "\n");
    }

    public void printBoxInfo() {
        System.out.println("Размер: " + size + "\n" + "Цвет: " + color + "\n" + "Статус: " + getStatus() + "\n" +
                "В коробке: " + item + "\n");
    }

    public String getStatus() {
        String status;
        if (isClosed) {
            status = "коробка закрыта";
        } else {
            status = "коробка открыта";
        }
        return status;
    }

    public void fillBox(String item) {
        if (isFull) {
            System.out.println("Коробка заполнена, нельзя положить предмет\n");
            return;
        }
        if (isClosed) {
            System.out.println("Коробка закрыта, нельзя положить предмет\n");
            return;
        }
        this.item = item;
        isFull = true;
        System.out.println("В коробку положили " + item + "\n");
    }

    public void dropBox() {
        if (!isFull) {
            System.out.println("Коробка пустая, нельзя вынуть предмет\n");
            return;
        }
        if (isClosed) {
            System.out.println("Коробка закрыта, нельзя вынуть предмет\n");
            return;
        }

        System.out.println("Из коробки достали " + item + "\n");
        this.item = null;
        isFull = false;
    }
}
