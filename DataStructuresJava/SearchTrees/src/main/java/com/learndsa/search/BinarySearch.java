package com.learndsa.search;

public class BinarySearch {
    public int binarySearch(int[] input, int value) {
        return binarySearch(input, value, 0, input.length);
    }

    private int binarySearch(int[] input, int value, int start, int end) {
        if (start >= end) {
            return -1;
        }
        int mid = (end + start) / 2;
        if (value == input[mid]) {
            return mid;
        } else if (value < input[mid]) {
            return binarySearch(input, value, start, mid);
        } else {
            return binarySearch(input, value, mid + 1, end);
        }
    }
}
