package com.learndsa.sort.insertionSort;

import com.learndsa.print.array.PrintArray;

//In-place Algorithm
//Stable sort
//Time complexity=O(n2)
public class InsertionSort2 {

    public static void main(String[] args) {
        int[] unsortedArray = {22, -1, 55, 43, 35, 5, 8, 7, 11, 6, 99, 55};
        PrintArray.printArray(unsortedArray);
        insertionSort(unsortedArray);
        PrintArray.printArray(unsortedArray);
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int unsortedElement = arr[i];
            int position = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (unsortedElement < arr[j]) {
                    moveElementOneStepBack(arr, j);
                    position = j;
                }
            }
            if (position > -1)
                swapUnsortedElement(arr, unsortedElement, position);
        }
    }

    public static void moveElementOneStepBack(int[] arr, int index) {
        arr[index + 1] = arr[index];
    }

    public static void swapUnsortedElement(int[] arr, int unsortedElement, int position) {
        arr[position] = unsortedElement;
    }

}
