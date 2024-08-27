package ru.olga.java.basic.homeworks.homework11_algor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class hw11 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(8);
        list.add(1);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        BinaryTree tree = new BinaryTree(list);
        tree.binaryTreeFromList();
    }
}
