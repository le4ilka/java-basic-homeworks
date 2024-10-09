package ru.olga.java.basic.homeworks.homework22_tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MainApplication {

    public static void main(String[] args) {
        int[] data = {3, 2, 3, 1, 5, 6, 7};
        int[] data1 = {1, 2, 1, 2, 2};
        int[] data2 = {2, 2, 2, 2};
        int[] data3 = {1 ,1};
        int[] data4 = {1 ,3};
        System.out.println(Arrays.toString(partArray(data)));
        System.out.println(Arrays.toString(partArray(data1)));
        //System.out.println(Arrays.toString(partArray(data3)));
        System.out.println(Arrays.toString(partArray(data4)));
        System.out.println(checkElements(data));
        System.out.println(checkElements(data1));
        System.out.println(checkElements(data2));
        System.out.println(checkElements(data3));
        System.out.println(checkElements(data4));
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
            if (((Arrays.binarySearch(array, 1)) < 0) || ((Arrays.binarySearch(array, 2)) < 0)) {
                return false;
            }
        }
        return true;
    }

}
