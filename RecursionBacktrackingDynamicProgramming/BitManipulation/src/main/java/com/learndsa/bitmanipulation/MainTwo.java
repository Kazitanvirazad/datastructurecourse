package com.learndsa.bitmanipulation;

public class MainTwo {
    public static void main(String[] args) {
        System.out.println(isEven(2));
        System.out.println(isEven(6));
        System.out.println(isEven(76));
        System.out.println(isEven(23));
        System.out.println(isEven(41));
        System.out.println(isEven(1));
        System.out.println(isEven(0));
    }

    // O(1)
    // usually the % modulo operator is used
    public static boolean isEven(int n) {
        // XOR operator with 1 decrements the value for odd number
        // XOR operator with 1 increments the value for even number
        return (n ^ 1) > n;
    }
}
