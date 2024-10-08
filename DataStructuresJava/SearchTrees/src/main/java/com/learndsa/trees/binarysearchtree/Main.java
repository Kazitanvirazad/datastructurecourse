package com.learndsa.trees.binarysearchtree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);
        tree.insert(28);
        tree.insert(16);
        tree.insert(23);
        tree.insert(14);

        System.out.println("\n===================InOrder Traversal======================");
        tree.traverseInOrder();
        System.out.println("\n===================LevelOrder Traversal======================");
        tree.traverseLevelOrder();
        System.out.println("\n===================PreOrder Traversal======================");
        tree.traversePreOrder();
        System.out.println("\n===================PostOrder Traversal======================");
        tree.traversePostOrder();
        System.out.println("\n=========================================");
        System.out.println("20 exists: " + tree.contains(20));
        System.out.println("27 exists: " + tree.contains(27));
        System.out.println("22 exists: " + tree.contains(22));
        System.out.println("32 exists: " + tree.contains(32));
        System.out.println("25 exists: " + tree.contains(25));
        System.out.println("15 exists: " + tree.contains(15));
        System.out.println("11 exists: " + tree.contains(11));
        System.out.println("98 exists: " + tree.contains(98));
        System.out.println("\nMin value = " + tree.min());
        System.out.println("\nMax value = " + tree.max());
        System.out.println("===================Before Deletion======================");
        tree.traverseLevelOrder();
        System.out.println("\n===================After Deletion======================");
        tree.delete(28);
        tree.delete(22);
        tree.delete(15);
        tree.delete(27);
        tree.traverseLevelOrder();
    }
}
