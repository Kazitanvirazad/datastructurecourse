package com.sort.selectionSort;

import com.print.array.PrintArray;

public class SelectionSort2 {

	public static void main(String[] args) {
		int[] unsortedArray = { 22, -1, 55, 43, 35, 5, 8, 7, 11, 6, 99, 55 };
		PrintArray.printArray(unsortedArray);
		selectionSort(unsortedArray);
		PrintArray.printArray(unsortedArray);
	}

	public static int[] selectionSort(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			int largest = 0;
			int lastIndex = i;
			for (int j = 0; j <= i; j++) {
				if (arr[j] > arr[largest]) {
					largest = j;
				}
			}
			swap(arr, lastIndex, largest);
		}
		return arr;
	}

	public static void swap(int[] arr, int lastIndex, int largest) {
		int temp = arr[lastIndex];
		arr[lastIndex] = arr[largest];
		arr[largest] = temp;
	}

}
