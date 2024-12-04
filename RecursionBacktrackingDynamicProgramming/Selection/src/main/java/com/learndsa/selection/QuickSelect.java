package com.learndsa.selection;

import java.util.Random;

public class QuickSelect {
    private int[] nums;

    public QuickSelect(int[] nums) {
        this.nums = nums;
    }

    public int select(int k) {
        return quickSelect(0, nums.length - 1, k - 1);
    }

    // Selection Sort
    public int[] sort() {
        int[] sorted = new int[nums.length];
        sort(0, sorted.length - 1, sorted);
        return sorted;
    }

    private void sort(int firstIndex, int lastIndex, int[] sort) {
        if (firstIndex > lastIndex) {
            return;
        }
        int pivotIndex = getPartitionIndex(firstIndex, lastIndex);
        sort[pivotIndex] = nums[pivotIndex];
        sort(firstIndex, pivotIndex - 1, sort);
        sort(pivotIndex + 1, lastIndex, sort);
    }

    // This is selection phase
    private int quickSelect(int firstIndex, int lastIndex, int k) {
        int pivotIndex = getPartitionIndex(firstIndex, lastIndex);
        if (pivotIndex < k) {
            // we can discard the left sub-array, so we have to consider the items on the right
            return quickSelect(pivotIndex + 1, lastIndex, k);
        } else if (pivotIndex > k) {
            // we can discard the right sub-array, so we have to consider the items on the left
            return quickSelect(firstIndex, pivotIndex - 1, k);
        }
        return nums[pivotIndex];
    }

    // This is partition phase
    private int getPartitionIndex(int firstIndex, int lastIndex) {
        // index of random pivot from firstIndex and lastIndex
        int pivot = new Random().nextInt(lastIndex - firstIndex + 1) + firstIndex;
        swap(pivot, lastIndex);

        for (int i = firstIndex; i < lastIndex; i++) {
            if (nums[i] < nums[lastIndex]) {
                swap(i, firstIndex);
                firstIndex++;
            }
        }
        swap(lastIndex, firstIndex);
        // this is the index of the pivot
        return firstIndex;
    }

    private void swap(int pivot, int lastIndex) {
        int temp = nums[pivot];
        nums[pivot] = nums[lastIndex];
        nums[lastIndex] = temp;
    }
}
