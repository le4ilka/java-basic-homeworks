package ru.olga.java.basic.homeworks.homework11_algor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTree implements SearchTree {

    private List<Integer> list = new ArrayList<>();

    public BinaryTree(List<Integer> binaryTree) {
        this.list = binaryTree;
    }

    @Override
    public int find(int element) {
        return 0;
    }

    @Override
    public List getSortedList() {
        Collections.sort(list);
        return list;
    }

    public List binaryTreeFromList() {
        List<Integer> binaryTreeList = new ArrayList<>();

        int midElementIndex = (list.size())/2;
        binaryTreeList.add(list.get(midElementIndex));
        System.out.println(binaryTreeList);
       return  binaryTreeList;
    }


}
