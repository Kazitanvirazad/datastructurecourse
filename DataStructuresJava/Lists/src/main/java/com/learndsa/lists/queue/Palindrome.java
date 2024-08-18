package com.learndsa.lists.queue;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Palindrome {
    public static void main(String[] args) {
        String test = "hello";
        char[] testChars = test.toCharArray();

        Queue queue = new Queue(10);
        Stack stack = new Stack(10);

        for (char character : testChars) {
            queue.add(character);
            stack.push(character);
        }

        boolean flag = true;
        while (!(queue.isEmpty() && stack.isEmpty()) && flag) {
            flag = queue.remove() == stack.pop();
        }

        System.out.println(flag ? "True" : "False");
    }
}

class Queue {
    private char[] queue;
    private int front;
    private int back;

    public Queue(int capacity) {
        queue = new char[capacity];
    }

    public void add(char character) {
        if (back == queue.length) {
            char[] newQueue = new char[queue.length * 2];
            System.arraycopy(queue, front, newQueue, 0, back - front);
            queue = newQueue;
        }
        queue[back++] = character;
    }

    public char remove() {
        if (back - front < 1) {
            throw new NoSuchElementException();
        }
        char removedElement = queue[front];
        queue[front++] = '\000';

        if (isEmpty()) {
            front = 0;
            back = 0;
        }
        return removedElement;
    }

    public char peek() {
        if (back - front < 1) {
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return back - front < 1;
    }
}

class Stack {
    private char[] stack;
    private int top;

    public Stack(int capacity) {
        stack = new char[capacity];
    }

    public void push(char character) {
        if (top == stack.length) {
            char[] newArray = new char[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }
        stack[top++] = character;
    }

    public char pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        char character = stack[--top];
        stack[top] = '\000';
        return character;
    }

    public char peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }
}