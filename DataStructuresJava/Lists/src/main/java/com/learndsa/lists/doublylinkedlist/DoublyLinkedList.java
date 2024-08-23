package com.learndsa.lists.doublylinkedlist;

public class DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void addBefore(T newElement, T existingElement) {
        Node<T> newNode = new Node<>(newElement);

        if (isEmpty()) {
            return;
        }
        Node<T> current = head;
        if (current.getElement().equals(existingElement)) {
            addToFront(newElement);
            return;
        } else if (tail.getElement().equals(existingElement)) {
            newNode.setPrevious(tail.getPrevious());
            tail.getPrevious().setNext(newNode);
            newNode.setNext(tail);
            tail.setPrevious(newNode);
            size++;
            return;
        }

        while (current != null) {
            if (current.getElement().equals(existingElement)) {
                newNode.setPrevious(current.getPrevious());
                current.getPrevious().setNext(newNode);
                newNode.setNext(current);
                current.setPrevious(newNode);
                size++;
                break;
            } else {
                current = current.getNext();
            }
        }
    }

    public void addToFront(T element) {
        Node<T> node = new Node<>(element);
        if (head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
        }
        node.setNext(head);
        head = node;
        size++;
    }

    public void addToEnd(T element) {
        if (isEmpty()) {
            addToFront(element);
        } else {
            Node<T> newNode = new Node<>(element);
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail = newNode;
            size++;
        }
    }

    public Node<T> removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        Node<T> removedNode = head;
        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        if (!isEmpty()) {
            Node<T> current = head;
            while (current != null) {
                System.out.println(current.getElement());
                current = current.getNext();
            }
        }
    }
}
