package com.learndsa.lists.stack;

import java.util.EmptyStackException;

public class Palindrome {
    public static void main(String[] args) {
        String testStr = "racecar";

        char[] characters = testStr.toCharArray();
        Stack stack = new Stack(10);
        for (char character : characters) {
            stack.push(character);
        }

        boolean isPalindrome = true;

        for (int i = 0; i < characters.length && isPalindrome; i++) {
            if (characters[i] != stack.pop()) {
                isPalindrome = false;
            }
        }

        System.out.println(isPalindrome ? "True" : "False");
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