package com.learndsa.trees.binarysearchtree;

import com.learndsa.util.Queue;

public class BinarySearchTree {
    private TreeNode root;

    public void delete(int value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subRoot, int value) {
        if (subRoot == null) {
            return null;
        }
        if (value < subRoot.getData()) {
            subRoot.setLeftChild(delete(subRoot.getLeftChild(), value));
        } else if (value > subRoot.getData()) {
            subRoot.setRightChild(delete(subRoot.getRightChild(), value));
        } else {
            // node to delete has 2 children
            if (subRoot.getLeftChild() != null && subRoot.getRightChild() != null) {
                TreeNode minValuedNodeFromRightSubTree = minValuedNodeFromRightSubTree(subRoot.getRightChild());
                subRoot.setData(minValuedNodeFromRightSubTree.getData());
                subRoot.setRightChild(delete(subRoot.getRightChild(), minValuedNodeFromRightSubTree.getData()));
            } else if (subRoot.getLeftChild() != null) { // node to delete has 1 left child
                subRoot = subRoot.getLeftChild();
            } else if (subRoot.getRightChild() != null) { // node to delete has 1 right child
                subRoot = subRoot.getRightChild();
            } else { // node to delete has 0 children
                subRoot = null;
            }
        }
        return subRoot;
    }

    public void insert(int value) {
        if (root == null) root = new TreeNode(value);
        else insert(root, value);
    }

    private void insert(TreeNode subRoot, int value) {
        if (value == subRoot.getData()) {
            return;
        }
        if (value < subRoot.getData()) {
            if (subRoot.getLeftChild() == null) {
                subRoot.setLeftChild(new TreeNode(value));
            } else {
                insert(subRoot.getLeftChild(), value);
            }
        } else {
            if (subRoot.getRightChild() == null) {
                subRoot.setRightChild(new TreeNode(value));
            } else {
                insert(subRoot.getRightChild(), value);
            }
        }
    }

    public int max() {
        if (root != null) return max(root);
        return Integer.MAX_VALUE;
    }

    private int max(TreeNode subRoot) {
        if (subRoot.getRightChild() != null) return max(subRoot.getRightChild());
        return subRoot.getData();
    }

    public int min() {
        if (root != null) return min(root);
        return Integer.MIN_VALUE;
    }

    private int min(TreeNode subRoot) {
        if (subRoot.getLeftChild() != null) return min(subRoot.getLeftChild());
        return subRoot.getData();
    }

    private TreeNode minValuedNodeFromRightSubTree(TreeNode subRoot) {
        if (subRoot.getLeftChild() != null) return minValuedNodeFromRightSubTree(subRoot.getLeftChild());
        return subRoot;
    }

    public boolean contains(int value) {
        if (root != null) return contains(root, value);
        return false;
    }

    private boolean contains(TreeNode subRoot, int value) {
        if (value == subRoot.getData()) return true;
        if (value < subRoot.getData()) {
            if (subRoot.getLeftChild() != null) return contains(subRoot.getLeftChild(), value);
        } else {
            if (subRoot.getRightChild() != null) return contains(subRoot.getRightChild(), value);
        }
        return false;
    }

    public void traversePreOrder() {
        if (root != null) traversePreOrder(root);
    }

    private void traversePreOrder(TreeNode subRoot) {
        System.out.print(subRoot.getData() + " ");
        if (subRoot.getLeftChild() != null) traversePreOrder(subRoot.getLeftChild());
        if (subRoot.getRightChild() != null) traversePreOrder(subRoot.getRightChild());
    }

    public void traversePostOrder() {
        if (root != null) traversePostOrder(root);
    }

    private void traversePostOrder(TreeNode subRoot) {
        if (subRoot.getLeftChild() != null) traversePostOrder(subRoot.getLeftChild());
        if (subRoot.getRightChild() != null) traversePostOrder(subRoot.getRightChild());
        System.out.print(subRoot.getData() + " ");
    }

    public void traverseInOrder() {
        if (root != null) traverseInOrder(root);
    }

    private void traverseInOrder(TreeNode subRoot) {
        if (subRoot.getLeftChild() != null) traverseInOrder(subRoot.getLeftChild());
        System.out.print(subRoot.getData() + " ");
        if (subRoot.getRightChild() != null) traverseInOrder(subRoot.getRightChild());
    }

    public void traverseLevelOrder() {
        Queue<TreeNode> queue = new Queue<>();
        queue.add(root);
        while (queue.peek() != null) {
            TreeNode current = queue.poll();
            System.out.print(current.getData() + " ");
            if (current.getLeftChild() != null) queue.add(current.getLeftChild());
            if (current.getRightChild() != null) queue.add(current.getRightChild());
        }
    }
}
