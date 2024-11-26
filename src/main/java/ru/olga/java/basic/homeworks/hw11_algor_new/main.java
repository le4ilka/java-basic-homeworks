package ru.olga.java.basic.homeworks.hw11_algor_new;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        list.add(2);
        list.add(3);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(15);
        list.add(16);
        list.add(18);
        list.add(1);
        System.out.println(list);

        BinaryTree binaryTree = new BinaryTree(list);

        binaryTree.find(6);
        binaryTree.find(7);
        binaryTree.find(25);
        binaryTree.find(18);
        binaryTree.find(0);

        System.out.println(binaryTree.getSortedList());

    }
}
