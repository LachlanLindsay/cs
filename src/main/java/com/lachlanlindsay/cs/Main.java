package com.lachlanlindsay.cs;

import com.lachlanlindsay.cs.Sort.BubbleSort;
import com.lachlanlindsay.cs.Sort.InsertionSort;
import com.lachlanlindsay.cs.Sort.SelectionSort;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {3, 2, 0, -5, 22, 44, 59, 8};

        BubbleSort.sort(intArray);

        SelectionSort.sort(intArray);

        InsertionSort.sort(intArray);
    }
}
