package ru.olga.java.basic.homeworks.homework22_tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class MainApplication {

    private static final Logger LOGGER = LogManager.getLogger(MainApplication.class);

    public static void main(String[] args) {
        int[] data = {3, 2, 3, 1, 5, 6, 7};
        int[] data1 = {1, 2, 1, 2, 2};
        int[] data2 = {2, 2, 2, 2};
        int[] data3 = {1, 1};
        int[] data4 = {1, 3};

        LOGGER.info("Часть массива после 1 первого массива: {}", ()->Arrays.toString(partArray(data)));
        LOGGER.info("Часть массива после 1 второго массива: {}", ()->Arrays.toString(partArray(data1)));
        LOGGER.info("Часть массива после 1 третьего массива: {}", ()->Arrays.toString(partArray(data4)));
        LOGGER.info("Проверка первого массива на 1 и 2: {}", ()->checkElements(data));
        LOGGER.info("Проверка второго массива на 1 и 2: {}", ()->checkElements(data1));
        LOGGER.info("Проверка третьего массива на 1 и 2: {}", ()->checkElements(data2));
        LOGGER.info("Проверка четвертого массива на 1 и 2: {}", ()->checkElements(data3));
        LOGGER.info("Проверка пятого массива на 1 и 2: {}", ()->checkElements(data4));

    }

    public static int[] partArray(int[] array) {
        int[] result = {};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                result = Arrays.copyOfRange(array, i + 1, (array.length));
            }
        }
        if (result.length == 0) {
            throw new RuntimeException("в массиве нет 1 или 1 является последним элементом в массиве");
        }
        return result;
    }

    public static boolean checkElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 1 && array[i] != 2) {
                return false;
            }
            Arrays.sort(array);
            if (((Arrays.binarySearch(array, 1)) < 0) || ((Arrays.binarySearch(array, 2)) < 0)) {
                return false;
            }
        }
        return true;
    }

}
