package com.sort.bubbleSort;

//Stable Sorting
//In-Place algorithm
public class BubbleSort {

	// Sorting in ascending order
	public static void main(String[] args) {
		int[] unsortedArray = { 22, -1, 55, 43, 55, 5, 8 };
		printArray(unsortedArray);
		System.out.println();
		printArray(bubbleSort(unsortedArray));
	}

	public static int[] bubbleSort(int[] arr) {
		int itrLen = arr.length;
		for (int i = itrLen - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
			itrLen--;
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

