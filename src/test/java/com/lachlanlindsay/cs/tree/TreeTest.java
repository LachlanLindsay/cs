package com.lachlanlindsay.cs.tree;

import org.junit.Test;

public class TreeTest {

    @Test
    public void testSortedInsert() {
        TreeNode intTree = new TreeNode(5);
        intTree.inset(5);
        intTree.inset(4);
        intTree.inset(3);
        intTree.inset(2);
        intTree.inset(1);
        intTree.inset(0);
    }

    /*Visit the nodes of each level */
    @Test
    public void levelTraversal() {
    }


    /* Visit the root of every subtree first, pre visit the children first
     * Pre meaning the root is done first
     * */
    @Test
    public void preOrderTraversal() {

    }

    /*
     *
     * */
    @Test
    public void postOrderTraversal() {
    }

    /* Visit from smallest to largest */
    /*
     * Left
     * Visit
     * Right
     * */
    @Test
    public void inOrderTraversal() {
        Tree tree = new Tree();
        tree.insert(5);
        tree.insert(123);
        tree.insert(4);
        tree.insert(20);
        tree.insert(25);
        tree.insert(10);
        tree.insert(7);
        tree.insert(1);
        TreeNode root = tree.getRoot();
    }
}