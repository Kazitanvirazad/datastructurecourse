package com.learndsa.recursion;

public class Recursion {
    public void head(int n) {
        System.out.println("Calling the function with n = " + n);
        if (n == 0) {
            return;
        }
        // we call the method recursively
        head(n - 1);
        // we do some operations
        System.out.println("The value n = " + n);
    }

    public void tail(int n) {
        System.out.println("Calling the function with n = " + n);
        if (n == 0) {
            return;
        }
        // we do some operations
        System.out.println("The value n = " + n);
        // we call the method recursively
        tail(n - 1);
    }

    public int factHead(int n) {
        if (n == 0) {
            System.out.println("Base case");
            return 1;
        }
        System.out.println("Before recursion n = " + n);
        int res = n * factHead(n - 1);
        System.out.println("After recursion n = " + res);
        return res;
    }

    public int factTail(int n, int acc) {
        if (n == 0) {
            System.out.println("Base case " + acc);
            return acc;
        }
        System.out.println("Before recursion n = " + n);
        int res = factTail(n - 1, n * acc);
        System.out.println("After recursion n = " + res);
        return res;
    }
}
