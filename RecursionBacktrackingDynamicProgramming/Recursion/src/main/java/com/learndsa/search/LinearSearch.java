package com.learndsa.search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 5, -5, 3, 10, 100};
        LinearSearch search = new LinearSearch();
        System.out.println(search.find_iteration(arr, -15));
        System.out.println(search.find_recursion(arr, -15, 0));
    }

    // iteration
    public int find_iteration(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }

    // recursion
    public int find_recursion(int[] arr, int item, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == item) {
            return index;
        }
        return find_recursion(arr, item, index + 1);
    }
}
