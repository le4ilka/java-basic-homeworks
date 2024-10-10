package ru.olga.java.basic.homeworks.homework22_tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MainApplicationTest {
    static Stream<Arguments> provideArraysForTestPartArray() {
        return Stream.of(
                Arguments.of(new int[]{3, 2}, new int[]{4, 2, 1, 3, 1, 3, 2}),
                Arguments.of(new int[]{2, 4, 3, 2}, new int[]{2, 2, 1, 2, 4, 3, 2}),
                Arguments.of(new int[]{2}, new int[]{2, 1, 1, 1, 1, 1, 2}),
                Arguments.of(new int[]{2, 3, 2, 4, 2, 4}, new int[]{1, 2, 3, 2, 4, 2, 4}),
                Arguments.of(new int[]{2}, new int[]{1, 2, 3, 2, 4, 1, 2}),
                Arguments.of(new int[]{2}, new int[]{3, 2, 3, 2, 4, 1, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArraysForTestPartArray")
    void testPartArray(int[] expected, int[] original) {
        Assertions.assertArrayEquals(expected, MainApplication.partArray(original));
    }

    @ParameterizedTest
    @MethodSource("provideArraysForTestPartArrayException")
    void testPartArrayException(int[] original) {
        // int[] original = {4, 2, 4, 2, 2, 3, 2};
        Assertions.assertThrows(RuntimeException.class, () -> MainApplication.partArray(original));
    }

    @Test
    void testCheckElementsFalse() {
        int[] originalFalse = {4, 2, 1, 3, 1, 3, 2};
        Assertions.assertFalse(MainApplication.checkElements(originalFalse));
    }

    @ParameterizedTest
    @MethodSource("provideArraysForTest")
    void testCheckElementsTrue(int[] input) {
        Assertions.assertTrue(MainApplication.checkElements(input));
    }

    static Stream<Arguments> provideArraysForTest() {
        return Stream.of(
                Arguments.of(new int[]{2, 2, 1, 2, 1, 1, 2}),
                Arguments.of(new int[]{2, 2, 1, 2, 1, 2, 2}),
                Arguments.of(new int[]{2, 2, 1, 1, 1, 2, 2})
        );
    }

    static Stream<Arguments> provideArraysForTestPartArrayException() {
        return Stream.of(
                Arguments.of(new int[]{2, 2, 3, 2, 4, 3, 2}),
                Arguments.of(new int[]{2, 1, 1, 1, 1, 1, 1}),
                Arguments.of(new int[]{3, 2, 3, 2, 4, 2, 4})
        );
    }
}