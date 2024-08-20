package ru.olga.java.basic.homeworks.hw6_strings;

public class Plate {
    private int maxAmountOfFood;
    private int currentAmountOfFood;

    public Plate(int max) {
        this.maxAmountOfFood = max;
        this.currentAmountOfFood = max;
    }

    public int getCurrentAmountOfFood() {
        return currentAmountOfFood;
    }

    public void addFood(int foodAmount) {
        if (currentAmountOfFood + foodAmount > maxAmountOfFood) {
            currentAmountOfFood = maxAmountOfFood;
        } else {
            currentAmountOfFood += foodAmount;
        }
    }

    public boolean redusingFood(int foodAmount) {
        currentAmountOfFood -= foodAmount;
        if (currentAmountOfFood >= 0) {
            return true;
        } else {
            return false;
        }
        }
    }
