package com.learndsa.sort.quickSort;

// UnStable algorithm and In place algorithm
// Time complexity O(nlogn)
// Space complexity O(n)
public class QuickSort {
    public static void sort(int[] input) {
        quickSort(input, 0, input.length - 1);
    }

    public static void quickSort(int[] input, int start, int end) {
        // recursion break condition
        if (start < end) {

            int pivotIndex = partition(input, start, end);

            // split left part of the array
            quickSort(input, start, pivotIndex - 1);

            // split right part of the array
            quickSort(input, pivotIndex + 1, end);
        }
    }

    public static int partition(int[] input, int start, int end) {

        int j = start;

        int i = j - 1;

        while (j <= end) {
            if (input[j] <= input[end]) {
                i++;
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
            j++;
        }
        return i;
    }
}
