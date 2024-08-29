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

    public int binaryTreeFromList(List<Integer> list) {
        int midElementIndex = (list.size())/2;

        List<Integer> subListLeft = new ArrayList<>(list.subList(0,midElementIndex));
        //System.out.println(subListLeft);
        List<Integer> subListRight = new ArrayList<>(list.subList(midElementIndex+1,list.size()));
        //System.out.println(subListRight);

        System.out.println((list.get(midElementIndex)));
        int left = list.get(midElementIndex/2);
        int right = list.get(midElementIndex+((list.size()-midElementIndex)/2));
        System.out.println("[" + left + "   " + right + "]");

        if (subListRight.size()==1 || subListLeft.size()==1){
            System.out.println("Конец ветки");
            return 1;
        }
        binaryTreeFromList(subListLeft);
        binaryTreeFromList(subListRight);

       return midElementIndex;
    }


}
