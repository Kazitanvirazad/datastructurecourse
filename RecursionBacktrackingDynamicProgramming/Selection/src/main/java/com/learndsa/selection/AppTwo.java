package com.learndsa.selection;

public class AppTwo {
    public static void main(String[] args) {
        int[] arr1 = {7, 10, 4, 3, 20, 15};
        int[] arr2 = {7, 10, 4, 20, 15};
        int[] arr3 = {1, -5, 10, 55, 1, 2, 3, -7, 7, 11, 100};
        QuickSelect select = new QuickSelect(arr3);
        int[] sorted = select.sort();
        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
}
