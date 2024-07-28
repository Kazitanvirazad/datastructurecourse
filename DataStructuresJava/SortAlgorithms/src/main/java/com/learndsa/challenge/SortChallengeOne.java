package com.learndsa.challenge;

/*Sort an integer array in descending order*/
public class SortChallengeOne {
    public void sort(int[] input) {
        mergeSort(input, 0, input.length);
//        quickSort(input, 0, input.length - 1);
    }

    private void quickSort(int[] input, int start, int end) {
        if (end <= start) {
            return;
        }
        int partitionIndex = getPartitionIndex(input, start, end);
        quickSort(input, start, partitionIndex - 1);
        quickSort(input, partitionIndex + 1, end);
    }

    private int getPartitionIndex(int[] input, int start, int end) {
        int j = start, i = j - 1;

        int partition = input[end];

        while (j <= end) {
            if (input[j] >= partition) {
                i++;
                int temp = input[j];
                input[j] = input[i];
                input[i] = temp;
            }
            j++;
        }
        return i;
    }

    private void mergeSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    private void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] >= input[mid]) {
            return;
        }

        int i = start, j = mid;

        int tempIndex = 0;
        int[] tempArray = new int[end - start];

        while (i < mid && j < end) {
            tempArray[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++];
        }

        while (true) {
            if (i < mid) {
                tempArray[tempIndex++] = input[i++];
            } else if (j < end) {
                tempArray[tempIndex++] = input[j++];
            } else {
                break;
            }
        }

        System.arraycopy(tempArray, 0, input, start, end - start);
    }
}
