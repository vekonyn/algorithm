package com.vekony.quadratic;

import com.vekony.Sort;

import static com.vekony.Swapper.swap;
import static java.util.Objects.requireNonNull;

public class InsertionSort implements Sort {
    @Override
    public void sort(int[] a) {
        requireNonNull(a);
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                }
            }
        }
    }
}
