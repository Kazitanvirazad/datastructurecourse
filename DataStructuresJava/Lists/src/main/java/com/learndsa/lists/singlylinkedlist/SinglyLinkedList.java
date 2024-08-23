package com.learndsa.lists.singlylinkedlist;

public class SinglyLinkedList<T> {
    private Node<T> head;
    private int size;

    public void addToFront(T element) {
        Node<T> node = new Node<>(element);
        node.setNext(head);
        head = node;
        size++;
    }

    public Node<T> removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        Node<T> nextNode = head;
        head = head.getNext();
        size--;
        nextNode.setNext(null);
        return nextNode;
    }

    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.getElement());
            current = current.getNext();
        }
    }

    public boolean isEmpty() {
        return size == 0 || head == null;
    }

    public int getSize() {
        return size;
    }
}
