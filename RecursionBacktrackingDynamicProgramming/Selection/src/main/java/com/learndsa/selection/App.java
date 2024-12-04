package com.learndsa.selection;

public class App {
    public static void main(String[] args) {
        int[] arr1 = {7, 10, 4, 3, 20, 15};
        int k1 = 3;
        int[] arr2 = {7, 10, 4, 20, 15};
        int k2 = 4;
        int[] arr3 = {1, -5, 10, 55, 2, 3, -7, 7, 11, 100};
        int k3 = 1;
        QuickSelect select = new QuickSelect(arr2);
        System.out.println(select.select(k2));
    }
}
