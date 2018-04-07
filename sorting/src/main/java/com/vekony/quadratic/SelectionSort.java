package com.vekony.quadratic;

import com.vekony.Sort;

import static com.vekony.Swapper.swap;
import static java.util.Objects.requireNonNull;

public class SelectionSort implements Sort {
    @Override
    public void sort(int[] a) {
        requireNonNull(a);
        int n = a.length;
        int min;
        for (int i = 0; i < n; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            swap(a, i, min);
        }
    }
}
