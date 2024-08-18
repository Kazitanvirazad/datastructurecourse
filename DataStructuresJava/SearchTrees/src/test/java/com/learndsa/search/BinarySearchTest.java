package com.learndsa.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {
    BinarySearch search;
    int[] arr = {1, 4, 8, 11, 15, 17, 18};
    int[] arr2 = {4};
    int[] arr3 = {-4, -3, -1, 8, 11, 15, 17, 18};
    int[] arr4 = {};

    @BeforeEach
    void setUp() {
        search = new BinarySearch();
    }

    @Test
    @DisplayName(value = "Searching an integer not present in the array should return -1")
    void numberNotPresentInArrayShouldReturnNegativeOneTest() {
        assertEquals(-1, search.binarySearch(arr, 12),
                "Searching an integer not present in the array should return -1");
    }

    @Test
    @DisplayName(value = "Searching an integer 15 present in the array should return 4")
    void numberPresentInArrayShouldReturnIndexPositionFourTest() {
        assertEquals(4, search.binarySearch(arr, 15),
                "Searching an integer 15 present in the array should return position 4");
    }

    @Test
    @DisplayName(value = "Searching a negative integer -1 present in the array should return position 2")
    void negativeNumberPresentInArrayShouldReturnIndexPositionTwoTest() {
        assertEquals(2, search.binarySearch(arr3, -1),
                "Searching a negative integer -1 present in the array should return position 2");
    }

    @Test
    @DisplayName(value = "Searching a integer 4 present in the array with single element should return position 0")
    void numberPresentInSingleElementArrayShouldReturnIndexPositionZeroTest() {
        assertEquals(0, search.binarySearch(arr2, 4),
                "Searching a negative integer 4 present in the array with single element should return position 0");
    }

    @Test
    @DisplayName(value = "Searching a integer 9 not present in the array with single element should return -1")
    void numberNotPresentInSingleElementArrayShouldReturnNegativeOneTest() {
        assertEquals(-1, search.binarySearch(arr3, 9),
                "Searching a integer 9 not present in the array with single element should return -1");
    }

    @Test
    @DisplayName(value = "Searching a integer 2 not present in the empty array should return -1")
    void numberNotPresentInEmptyArrayShouldReturnNegativeOneTest() {
        assertEquals(-1, search.binarySearch(arr4, 2),
                "Searching a integer 2 not present in the empty array should return -1");
    }
}