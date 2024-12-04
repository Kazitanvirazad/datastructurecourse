package com.learndsa.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-5, 1, 3, 5, 10, 100};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.search(arr, 100));
    }

    public int search(int[] arr, int item) {
        return search(arr, item, 0, arr.length - 1);
    }

    private int search(int[] arr, int item, int start, int end) {
        if (start <= end) {
            int midIndex = (end + start) / 2;
            if (arr[midIndex] == item) {
                return midIndex;
            } else if (arr[midIndex] > item) {
                return search(arr, item, start, midIndex - 1);
            } else {
                return search(arr, item, midIndex + 1, end);
            }
        } else {
            return -1;
        }
    }
}
