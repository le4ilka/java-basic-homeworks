package ru.olga.java.basic.homeworks.hw11_algor_new;

import java.util.List;

public interface SearchTree<Integer> {

    /**
     * @param element to find
     * @return element if exists, otherwise - null
     */
    Integer find(java.lang.Integer element);

    List<Integer> getSortedList();
}
