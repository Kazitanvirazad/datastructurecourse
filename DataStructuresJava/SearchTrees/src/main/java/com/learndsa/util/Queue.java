package com.learndsa.util;

public class Queue<T> {
    private final DoublyLinkedList<T> queue;

    public Queue() {
        this.queue = new DoublyLinkedList<>();
    }

    public void add(T element) {
        queue.addToEnd(element);
    }

    public T poll() {
        return queue.removeFromFront();
    }

    public T peek() {
        return queue.getFirst();
    }
}
