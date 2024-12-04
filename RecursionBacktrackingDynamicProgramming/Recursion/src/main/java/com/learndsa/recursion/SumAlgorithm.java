package com.learndsa.recursion;

public class SumAlgorithm {
    // sum up the first n integers
    public int iteration(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // sum up the first n integers
    public int recursion(int n) {
        // base case to break recursion
        if (n == 0) {
            return 0;
        }
        return n + recursion(n - 1);
    }
}
