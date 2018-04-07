package com.vekony;

import com.vekony.logaritmic.MergeSort;
import com.vekony.logaritmic.QuickSort;
import com.vekony.quadratic.BubbleSort;
import com.vekony.quadratic.InsertionSort;
import com.vekony.quadratic.SelectionSort;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertArrayEquals;

@RunWith(JUnit4.class)
public class SortTest {
    private final int[] sortable = {5, 1, 9, 3, 12, 40, 3, 7, 17};
    private final int[] expected = {1, 3, 3, 5, 7, 9, 12, 17, 40};

    private Sort sort;

    @Test
    public void testBubbleSort() {
        test(new BubbleSort());
    }

    @Test
    public void testInsertionSort() {
        test(new InsertionSort());
    }

    @Test
    public void testSelectionSort() {
        test(new SelectionSort());
    }

    @Test
    public void testMergeSort() {
        test(new MergeSort());
    }

    @Test
    public void testQuickSort() {
        test(new QuickSort());
    }

    private void test(Sort sort) {
        sort.sort(sortable);
        assertArrayEquals(expected, sortable);
    }
}