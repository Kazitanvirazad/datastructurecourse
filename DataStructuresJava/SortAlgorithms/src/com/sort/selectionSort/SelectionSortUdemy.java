package com.sort.selectionSort;

public class SelectionSortUdemy {

	// Another approach of doing Selection sort
	public static void main(String[] args) {
		int[] unsortedArray = { 20, 35, 7, -15, 7, 55, 1, -22 };
		printArray(unsortedArray);
//		printArray(selectionSortAsc(unsortedArray));
		printArray(selectionSortDsc(unsortedArray));
//		selectionSortAsc(unsortedArray);
//		selectionSortDsc(unsortedArray);
//		printArray(unsortedArray);
	}

	public static int[] selectionSortDsc(int[] arr) {
		int lastIndex = arr.length - 1;
		for (int i = 0; i < arr.length - 1; i++) {
			int smallestNumIndex = 0;
			for (int j = 1; j <= lastIndex; j++) {
				if (arr[j] < arr[smallestNumIndex]) {
					smallestNumIndex = j;
				}
			}
//			printArray(arr);
			swap(arr, lastIndex, smallestNumIndex);
			lastIndex--;
		}
		return arr;
	}

	public static int[] selectionSortAsc(int[] arr) {
		int lastIndex = arr.length - 1;
		for (int i = 0; i < arr.length - 1; i++) {
			int largestNumIndex = 0;
			for (int j = 1; j <= lastIndex; j++) {
				if (arr[j] > arr[largestNumIndex]) {
					largestNumIndex = j;
				}
			}
//			printArray(arr);
			swap(arr, largestNumIndex, lastIndex);
			lastIndex--;
		}
		return arr;
	}

	public static int[] swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}

	public static void printArray(int[] arr) {
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();
	}
}
