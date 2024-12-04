package com.learndsa.bitmanipulation;

public class MainOne {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(120));
        System.out.println("Bit counts: " + countBits(164845));
    }

    public static int countBits(int n) {
        int counter = 0;
        while (n > 0) {
            System.out.println(n);
            counter++;
            // left shift operator: doubles the value
            // right shift operator: divides the value by 2
            n = n >> 1;
        }
        return counter;
    }
}
