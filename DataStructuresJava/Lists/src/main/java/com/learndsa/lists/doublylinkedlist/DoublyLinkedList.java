package com.learndsa.lists.doublylinkedlist;

public class DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void addBefore(T newElement, T existingElement) {
        Node<T> newNode = new Node<>(newElement);
        Node<T> node = head;

        if (node.equals(existingElement)) {
            addToFront(newElement);
            return;
        } else if (node.equals(tail)) {
            addToEnd(newElement);
            return;
        }

        while (node != null) {
            if (node.getNext() != null && node.getNext().getElement().equals(existingElement)) {
                newNode.setNext(node.getNext());
                newNode.setPrevious(node);
                node.getNext().setPrevious(newNode);
                node.setNext(newNode);
                size++;
                break;
            } else {
                node = node.getNext();
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
        Node<T> newNode = new Node<>(element);
        if (tail == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
        }
        tail = newNode;
        size++;
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
