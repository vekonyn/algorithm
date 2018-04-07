package com.vekony.logaritmic;

import com.vekony.Sort;

import java.util.Arrays;

public class MergeSort implements Sort {


    @Override
    public void sort(int[] values) {
        mergesort(values, 0, values.length - 1);
    }

    private void mergesort(int[] values, int low, int high) {
        if (low < high) {
            int middle = (high + low) / 2;
            mergesort(values, low, middle);
            mergesort(values, middle + 1, high);
            merge(values, low, middle, high);
        }
    }

    private void merge(int[] numbers, int low, int middle, int high) {
        int[] helper = Arrays.copyOf(numbers, numbers.length);
        int i = low, k = low;
        int j = middle + 1;

        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            numbers[k] = helper[i];
            k++;
            i++;
        }


    }

}
