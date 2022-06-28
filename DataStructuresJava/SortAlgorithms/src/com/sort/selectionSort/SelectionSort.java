package com.sort.selectionSort;

//Unstable Sorting
public class SelectionSort {

	public static void main(String[] args) {

		int[] unsortedArray = { 20, 35, 7, -15, 7, 55, 1, -22 };
		printArray(unsortedArray);
		printArray(selectionSortDsc(unsortedArray));
	}

	public static int[] selectionSortDsc(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					swap(arr, i, j);
				}
			}
		}
		return arr;
	}

	public static int[] selectionSortAsc(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
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
