package com.learndsa.bitmanipulation;

public class RussianPeasant {
    public static void main(String[] args) {
        System.out.println(multiply(5, 6));
        System.out.println(multiply(5, 7));
        System.out.println(multiply(4, 8));
        System.out.println(multiply(12, 9));
        System.out.println(multiplyRussianPeasant(5, 6));
        System.out.println(multiplyRussianPeasant(5, 7));
        System.out.println(multiplyRussianPeasant(4, 8));
        System.out.println(multiplyRussianPeasant(12, 9));
        System.out.println(multiplyRussianPeasantRecursion(5, 6));
        System.out.println(multiplyRussianPeasantRecursion(5, 7));
        System.out.println(multiplyRussianPeasantRecursion(4, 8));
        System.out.println(multiplyRussianPeasantRecursion(12, 9));
    }

    public static int multiply(int a, int b) {
        int result = (a << 1) * (b >> 1);
        return (b ^ 1) > b ? result : result + a;
    }

    public static int multiplyRussianPeasant(int a, int b) {
        int result = 0;
        while (b > 0) {
            if ((b ^ 1) < b) {
                result += a;
            }
            a = a << 1;
            b = b >> 1;
        }
        return result;
    }

    public static int multiplyRussianPeasantRecursion(int a, int b) {
        return multiplyRussianPeasantRecursion(a, b, 0);
    }

    private static int multiplyRussianPeasantRecursion(int a, int b, int acc) {
        if (b <= 0) {
            return acc;
        }
        if ((b ^ 1) < b) {
            acc += a;
        }
        return multiplyRussianPeasantRecursion(a << 1, b >> 1, acc);
    }
}
