package ru.olga.java.basic.homeworks.homework11_algor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreeNode {
    private int value;
    private List<TreeNode> childs;

    public TreeNode(int value) {
        this.value = value;
        this.childs = new ArrayList<>();
    }

    public int  getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<TreeNode> getChilds() {
        return childs;
    }

    public void getChilds(List<TreeNode> childs) {
        this.childs = childs;
    }

    public void addChild(TreeNode... treeNodes) {
        this.childs.addAll(Arrays.asList(treeNodes));
    }

}
