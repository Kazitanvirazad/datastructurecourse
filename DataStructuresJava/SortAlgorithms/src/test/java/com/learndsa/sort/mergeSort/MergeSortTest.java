package com.learndsa.sort.mergeSort;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MergeSortTest {

    boolean isSorted(int[] arr) {
        if (arr.length < 2) {
            return true;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (!(arr[i] <= arr[i + 1]))
                return false;
        }
        return true;
    }

    @Test
    @DisplayName(value = "Should return false as the array is not sorted")
    void checkIsSortedTestOne() {
        int[] arr = {4, 3, 1, 6, 5};
        assertFalse(isSorted(arr), "Should return false as the array is not sorted");
    }

    @Test
    @DisplayName(value = "Should return true as the array is sorted")
    void checkIsSortedTestTwo() {
        int[] arr = {1, 3, 4, 5, 6};
        assertTrue(isSorted(arr), "Should return true as the array is sorted");
    }

    @Test
    @DisplayName(value = "Should return true if the array is sorted Test 1")
    void checkWhetherArrayIsSortedTestOne() {
        int[] newArr1 = {4, 3, 1, 6, 5, 2, 8, 7, 6, 6, -9, 3, 1, 9, 0, -6, 4, 2, 5, 3};
        MergeSort.sort(newArr1);
        assertTrue(isSorted(newArr1), "Should return true if the array is sorted Test 1");
    }

    @Test
    @DisplayName(value = "Should return true if the array is sorted Test 2")
    void checkWhetherArrayIsSortedTestTwo() {
        int[] arr = {4, 3, 1, 6, 5};
        MergeSort.sort(arr);
        assertTrue(isSorted(arr), "Should return true if the array is sorted Test 2");
    }

    @Test
    @DisplayName(value = "Should return true if the array is sorted Test 3")
    void checkWhetherArrayIsSortedTestThree() {
        int[] arr1 = {4, 3, 1, 6, 5, 2};
        MergeSort.sort(arr1);
        assertTrue(isSorted(arr1), "Should return true if the array is sorted Test 3");
    }

    @Test
    @DisplayName(value = "Should return true if the array is sorted Test 4")
    void checkWhetherArrayIsSortedTestFour() {
        int[] newArr = {4, 3, 1, 6, 5, 2, 8, 7, 6, 6, -9, 3, 1, 9, 0, -6, 4, 2, 5};
        MergeSort.sort(newArr);
        assertTrue(isSorted(newArr), "Should return true if the array is sorted Test 4");
    }

    @Test
    @DisplayName(value = "Should return true if the array with two elements is sorted Test 5")
    void checkWhetherArrayIsSortedTestFive() {
        int[] arrWithTwoElements = {4, -3};
        MergeSort.sort(arrWithTwoElements);
        assertTrue(isSorted(arrWithTwoElements), "Should return true if the array with two elements is sorted Test 5");
    }

    @Test
    @DisplayName(value = "Should return true if the array with one elements is sorted Test 6")
    void checkWhetherArrayIsSortedTestSix() {
        int[] arrWithOneElements = {4};
        MergeSort.sort(arrWithOneElements);
        assertTrue(isSorted(arrWithOneElements), "Should return true if the array with one elements is sorted Test 6");
    }

    @Test
    @DisplayName(value = "Should return true if the array with no elements is sorted Test 7")
    void checkWhetherArrayIsSortedTestSeven() {
        int[] arrWithNoElements = {};
        MergeSort.sort(arrWithNoElements);
        assertTrue(isSorted(arrWithNoElements), "Should return true if the array with no elements is sorted Test 7");
    }
}