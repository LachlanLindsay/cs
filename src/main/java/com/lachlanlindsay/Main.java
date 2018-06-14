package com.lachlanlindsay;

import com.lachlanlindsay.Sort.BubbleSort;
import com.lachlanlindsay.Sort.InsertionSort;
import com.lachlanlindsay.Sort.SelectionSort;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {3, 2, 0, -5, 22, 44, 59, 8};

        BubbleSort.sort(intArray);

        SelectionSort.sort(intArray);

        InsertionSort.sort(intArray);
    }
}
