package com.learndsa.sort.selectionSort;

import com.learndsa.print.array.PrintArray;

public class SelectionSort3 {
    public static void main(String[] args) {
        int[] unsortedArray = {103, 22, -1, 55, 43, 35, 5, 8, 7, 11, 6, 99, 55};
        PrintArray.printArray(unsortedArray);
        selectionSort(unsortedArray);
        PrintArray.printArray(unsortedArray);
    }

    private static void selectionSort(int[] arr) {
        int sortedIndex = arr.length;

        while (sortedIndex > 0) {
            int largestIndex = 0;
            for (int i = 0; i < sortedIndex; i++) {
                if (arr[i] > arr[largestIndex]) {
                    largestIndex = i;
                }
            }
            int temp = arr[largestIndex];
            arr[largestIndex] = arr[sortedIndex - 1];
            arr[sortedIndex - 1] = temp;
            sortedIndex--;
        }
    }
}
