package com.learndsa.trees.binarysearchtree;

import com.learndsa.util.Queue;

public class BinarySearchTree {
    private TreeNode root;

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

    public void traversePostOrder() {
        if (root != null) traversePostOrder(root);
    }

    private void traversePostOrder(TreeNode subRoot) {
        if (subRoot.getLeftChild() != null) traversePostOrder(subRoot.getLeftChild());
        if (subRoot.getRightChild() != null) traversePostOrder(subRoot.getRightChild());
        System.out.print(subRoot.getData() + " ");
    }

    private void traversePreOrder(TreeNode subRoot) {
        System.out.print(subRoot.getData() + " ");
        if (subRoot.getLeftChild() != null) traversePreOrder(subRoot.getLeftChild());
        if (subRoot.getRightChild() != null) traversePreOrder(subRoot.getRightChild());
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

    private final class TreeNode {
        private int data;
        private TreeNode leftChild;
        private TreeNode rightChild;

        private TreeNode(int data) {
            this.data = data;
        }

        private int getData() {
            return data;
        }

        private void setData(int data) {
            this.data = data;
        }

        private TreeNode getLeftChild() {
            return leftChild;
        }

        private void setLeftChild(TreeNode leftChild) {
            this.leftChild = leftChild;
        }

        private TreeNode getRightChild() {
            return rightChild;
        }

        private void setRightChild(TreeNode rightChild) {
            this.rightChild = rightChild;
        }
    }
}
