package com.learndsa.recursion;

public class App {
    public static void main(String[] args) {
        SumAlgorithm sumAlgorithm = new SumAlgorithm();
        int value = 100;
        System.out.println(sumAlgorithm.iteration(value));
        System.out.println(sumAlgorithm.recursion(value));
    }
}
