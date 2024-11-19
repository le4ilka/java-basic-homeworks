package ru.olga.java.basic.homeworks.hw11_algor_new;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class BinaryTree implements SearchTree {

    private List<Integer> list;
    TreeNode root;

    public BinaryTree(List<Integer> list) {

        this.list = new ArrayList<>(list);
        this.getSortedList();
                System.out.println(this.list);
        this.root = new TreeNode(this.list.get((this.list.size() / 2)));
        makeBinaryTreeFromList(this.list, root, 0);
    }

    @Override
    public Object find(Integer element) {
        TreeNode pointerNode;
        pointerNode = root;
        while (element != pointerNode.getHead()) {
            if (element >= pointerNode.getHead()) {
                pointerNode = pointerNode.getRight();
            } else {
                pointerNode = pointerNode.getLeft();
            }
            if (pointerNode == null) {
                System.out.println("Элемент " + element + " не найден");
                return null;
            }
        }
        System.out.println("Найден элемент: " + pointerNode.getHead());
        return pointerNode;
    }

    @Override
    public List getSortedList() {
        TreeSet<Integer> set = new TreeSet<>(this.list);
        this.list.clear();
        this.list.addAll(set);
        return list;
    }

    private void makeBinaryTreeFromList(List<Integer> list, TreeNode root, int n) {
        int midElementIndex = list.indexOf(root.getHead());
        List<Integer> subListLeft = new ArrayList<>(list.subList(0, midElementIndex));
        List<Integer> subListRight = new ArrayList<>(list.subList(midElementIndex + 1, list.size()));

        System.out.println("Вершина " + (root.getHead()));

        int left = list.get(midElementIndex / 2);
        int right = list.get(midElementIndex + ((list.size() - midElementIndex) / 2));
        System.out.println("[" + left + "   " + right + "]");

        TreeNode leftChild = new TreeNode(left);
        root.setLeft(leftChild);
        TreeNode rightChild = new TreeNode(right);
        root.setRight(rightChild);

        if (subListRight.size() == 2){
            int lastelement = subListRight.get(1);
            if (rightChild.getHead() > lastelement){
                System.out.println("Вершина: " + rightChild.getHead());
                rightChild.setLeft(new TreeNode(lastelement));
                System.out.println("[" + rightChild.getLeft().getHead() + " null]");
            }
            else {
                System.out.println("Вершина: " + rightChild.getHead());
                rightChild.setRight(new TreeNode(lastelement));
                System.out.println("[null " + rightChild.getRight().getHead() + "]");
            }
        }

        if (subListLeft.size() == 2){
            int lastelement = subListLeft.get(0);
            if (leftChild.getHead() > lastelement){
                System.out.println("Вершина: " + leftChild.getHead());
                leftChild.setLeft(new TreeNode(lastelement));
                System.out.println("[" + leftChild.getLeft().getHead() + " null]");
            }
            else {
                System.out.println("Вершина: " + leftChild.getHead());
                leftChild.setRight(new TreeNode(lastelement));
                System.out.println("[null " + leftChild.getRight().getHead() + "]");
            }
        }

        if (subListRight.size() == 1 || subListLeft.size() == 1) {
            System.out.println("Конец ветки");
            return;
        }

        makeBinaryTreeFromList(subListRight, rightChild, n + 1);
        makeBinaryTreeFromList(subListLeft, leftChild, n + 1);
    }
}
