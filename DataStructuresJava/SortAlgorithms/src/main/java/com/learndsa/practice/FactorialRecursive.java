package com.learndsa.practice;

public class FactorialRecursive {
    public static void main(String[] args) {
        long n = 10;
        System.out.println(getFactorial(n));
    }

    public static long getFactorial(long n) {
        if (n == 0) return 1;
        return n * getFactorial(n - 1);
    }
}