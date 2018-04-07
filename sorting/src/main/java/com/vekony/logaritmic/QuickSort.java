package com.vekony.logaritmic;

import com.vekony.Sort;

import static com.vekony.Swapper.swap;
import static java.util.Objects.requireNonNull;

public class QuickSort implements Sort {
    @Override
    public void sort(int[] a) {
        requireNonNull(a);
        quickSort(a, 0, a.length - 1);
    }

    private void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int i = partition(a, low, high);
            quickSort(a, low, i - 1);
            quickSort(a, i, high);
        }
    }

    private int partition(int[] a, int low, int high) {
        int pivot = a[low];
        int i = low;
        int j = high;
        while (i <= j) {
            while (a[i] < pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(a, i, j);
                i++;
                j--;
            }
        }
        return i;
    }


}
