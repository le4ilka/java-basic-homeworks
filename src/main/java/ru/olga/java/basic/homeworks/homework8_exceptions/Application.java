package ru.olga.java.basic.homeworks.homework8_exceptions;

public class Application {
    public static void main(String[] args){
        String[][] array_2x2 = {{"1", "3"}, {"4", "5"}};
        String[][] array_3x3 = {{"1", "3", "2"}, {"4", "5", "6"}};
        String[][] array_2x2_string = {{"1", "a"}, {"4", "5"}};
        try {
            sumStringArray(array_2x2);
            //sumStringArray(array_3x3);
            sumStringArray(array_2x2_string);
        } catch (AppArraySizeException | AppArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void sumStringArray(String[][] array) throws AppArraySizeException, AppArrayDataException {
        if (array.length != 2 || array[0].length != 2 || array[1].length != 2) {
            throw new AppArraySizeException("Неверный размер массива");
        }

        int[][] int_array = new int[2][2];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    int_array[i][j] = Integer.parseInt(array[i][j]);
                    sum += int_array[i][j];
                } catch (Exception e) {
                    throw new AppArrayDataException("Неверный формат в ячейке [" + i + "][" + j + "] ");
                }
            }
        }
        System.out.println("Сумма элементов массива = " + sum);
    }
}
