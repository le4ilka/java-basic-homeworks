package ru.olga.java.basic.homeworks.hw11_algor_new;

public class TreeNode {
    private int head;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int head){
        this.head = head;
    }

    public int getHead(){
        return head;
    }

    public TreeNode getLeft(){
        return left;
    }

    public TreeNode getRight(){
        return right;
    }


    public void setLeft(TreeNode left){
        this.left = left;
    }

    public void setRight(TreeNode right){
        this.right = right;
    }

    public void setHead(int head){
        this.head = head;
    }
}
