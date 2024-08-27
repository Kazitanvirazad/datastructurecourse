package com.learndsa.util;

public class DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public T getFirst() {
        return head != null ? head.getElement() : null;
    }

    public void addToFront(T element) {
        Node<T> newNode = new Node<>(element);
        if (isEmpty()) {
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrevious(newNode);
        }
        head = newNode;
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

    public T removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        Node<T> nodeToRemove = head;
        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        nodeToRemove.setNext(null);
        size--;
        return nodeToRemove.getElement();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    private final class Node<T> {
        private T element;
        private Node<T> next;
        private Node<T> previous;

        public Node(T element) {
            this.element = element;
        }

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public Node<T> getPrevious() {
            return previous;
        }

        public void setPrevious(Node<T> previous) {
            this.previous = previous;
        }
    }
}
