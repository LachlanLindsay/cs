package com.lachlanlindsay.cs.tree;

import lombok.Data;

@Data
public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }

    public void inset(int value) {
        if (value == data) {
            return;
        }

        if (value < data) {
            if (leftChild == null) {
                leftChild = new TreeNode(value);
            } else {
                leftChild.inset(value);
            }

            if (rightChild == null) {
                rightChild = new TreeNode(value);
            } else {
                rightChild.inset(value);
            }
        }
    }

}
