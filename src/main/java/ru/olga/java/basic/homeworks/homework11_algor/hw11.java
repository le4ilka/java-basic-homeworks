package ru.olga.java.basic.homeworks.homework11_algor;

import java.util.ArrayList;
import java.util.List;

public class hw11 {
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
        System.out.println(list);

        BinaryTree tree = new BinaryTree(list);
        list = tree.getSortedList();
        System.out.println(list);

       // tree.printBinaryTreeFromList(list);
       // tree.find(5);

        tree.makeBinaryTreeFromList(list, 0);


    }
}
