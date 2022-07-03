package com.sort.bubbleSort;

import com.print.array.PrintArray;

public class BubbleSort2 {

	public static void main(String[] args) {
		int[] unsortedArray = { 22, -1, 55, 43, 35, 5, 8, 7, 11, 6, 99, 55 };
		PrintArray.printArray(unsortedArray);
		PrintArray.printArray(bubbleSort(unsortedArray));

	}

	public static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1])
					swap(arr, j);
			}
		}
		return arr;
	}

	private static void swap(int[] arr, int j) {
		int temp = arr[j];
		arr[j] = arr[j + 1];
		arr[j + 1] = temp;
	}

}
