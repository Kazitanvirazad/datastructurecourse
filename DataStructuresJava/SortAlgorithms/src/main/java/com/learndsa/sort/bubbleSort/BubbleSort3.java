package com.learndsa.sort.bubbleSort;

import com.learndsa.print.array.PrintArray;

public class BubbleSort3 {
    public static void main(String[] args) {
        int[] unsortedArray = {22, -1, 55, 43, 35, 5, 8, 7, 11, 6, 99, 55};
        PrintArray.printArray(unsortedArray);
        bubbleSort(unsortedArray);
        PrintArray.printArray(unsortedArray);
    }

    // ascending order sort
    // in place algorithm
    // stable sort
    // time complexity O(n2)
    private static void bubbleSort(int[] arr) {
        int sortedIndex = arr.length;
        while (sortedIndex > 0) {
            for (int i = 0; i < sortedIndex - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
            sortedIndex--;
        }
    }
}
