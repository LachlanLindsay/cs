package com.lachlanlindsay.cs.tree;

import lombok.Data;

import java.util.List;

@Data
public class Tree {

    private TreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.inset(value);
        }
    }

    public void inOrderTraversal(TreeNode root, List<Integer> list) {
        if (root.getLeftChild() != null) {
            list.add(root.getLeftChild().getData());
            inOrderTraversal(root.getLeftChild(), list);
        }
        if (root.getRightChild() != null) {
            list.add(root.getRightChild().getData());
            inOrderTraversal(root.getRightChild(), list);
        }
    }
}
