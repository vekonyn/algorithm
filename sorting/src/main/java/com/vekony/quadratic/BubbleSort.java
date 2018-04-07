package com.vekony.quadratic;

import com.vekony.Sort;

import static com.vekony.Swapper.swap;
import static java.util.Objects.requireNonNull;

public class BubbleSort implements Sort {

    @Override
    public void sort(int[] a) {
        requireNonNull(a);
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                }
            }
        }
    }
}
