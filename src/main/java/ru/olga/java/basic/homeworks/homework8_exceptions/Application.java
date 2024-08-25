package ru.olga.java.basic.homeworks.homework8_exceptions;

public class Application {
    public static void main(String[] args) {
        String[][] array4x4 = {{"1", "3", "1", "3"},
                {"4", "5", "1", "3"},
                {"4", "5", "1", "3"},
                {"4", "5", "1", "3"}};
        String[][] array3x3 = {{"1", "3", "2"}, {"4", "5", "6"}};
        String[][] array4x4string = {{"1", "a", "1", "3"},
                {"4", "5", "1", "3"},
                {"4", "5", "b", "3"},
                {"4", "5", "1", "3"}};
        try {
            sumStringArray(array4x4);
            sumStringArray(array3x3);
            sumStringArray(array4x4string);
        } catch (AppArraySizeException | AppArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int sumStringArray(String[][] array) throws AppArraySizeException, AppArrayDataException {
        for (int i = 0; i < array.length; i++) {
            if (array.length != 4 || array[i].length != 4) {
                throw new AppArraySizeException("Неверный размер массива");
            }
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Неверный формат в ячейке [" + i + "][" + j + "] ");
                }
            }
        }
        System.out.println("Сумма элементов массива = " + sum);
        return sum;
    }
}
