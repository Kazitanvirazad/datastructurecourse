package com.learndsa.recursion;

public class Fibonacci {
    public int head(int n) {
        // base case
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        // we call the method recursively
        int fib1 = head(n - 1);
        int fib2 = head(n - 2);

        // Java calculates the same value several times
        // This is a Dynamic Programming
        // make some operation
        int res = fib1 + fib2;
        return res;
    }

    public int tail(int n, int a, int b) {
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }
        return tail(n - 1, b, a + b);
    }
}
