package com.sort.insertionSort;

import com.print.array.PrintArray;

//In-place Algorithm
//Stable sort
//Time complexity=O(n2)
public class InsertionSort {

	public static void main(String[] args) {
		int[] unsortedArray = { 22, -1, 55, 43, 35, 5, 8, 7, 11, 6, 99, 55 };
		PrintArray.printArray(unsortedArray);
		PrintArray.printArray(insertionSort(unsortedArray));
	}

	public static int[] insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int unSortedElement = arr[i];
			int positionIndex = -1;
			for (int j = i - 1; (j >= 0 && unSortedElement < arr[j]); j--) {
				moveElementOneStepBack(arr, j);
				positionIndex = j;
			}
			if (positionIndex > -1)
				putElementInCorrectPosition(arr, positionIndex, unSortedElement);
		}
		return arr;
	}

	public static void moveElementOneStepBack(int[] arr, int index) {
		arr[index + 1] = arr[index];
	}

	public static void putElementInCorrectPosition(int[] arr, int positionIndex, int unSortedElement) {
		arr[positionIndex] = unSortedElement;
	}

}
