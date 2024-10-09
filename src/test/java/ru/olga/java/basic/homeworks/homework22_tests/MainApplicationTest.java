package ru.olga.java.basic.homeworks.homework22_tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MainApplicationTest {

    @Test
    void testPartArray() {
        int[] expected = {3,2};
        int[] original = {4,2,1,3,1,3,2};
        Assertions.assertArrayEquals(expected, MainApplication.partArray(original));
    }

    @Test
    void testPartArrayException() {
        int[] original = {4,2,4,2,2,3,2};
        Assertions.assertThrows(RuntimeException.class, ()-> MainApplication.partArray(original));
    }

    @Test
    void testCheckElementsFalse() {
        int[] originalFalse = {4,2,1,3,1,3,2};
        Assertions.assertFalse(MainApplication.checkElements(originalFalse));
    }

    @Test
    void testCheckElementsTrue() {
        int[] originalTrue = {2,2,1,2,1,1,2};
        Assertions.assertFalse(MainApplication.checkElements(originalTrue));
    }
}