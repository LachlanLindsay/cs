package com.lachlanlindsay.cs.Sort;

public class RadixSortStrings {
    public static void sort(String[] array) {
        final int radix = 26;

        int width = array[0].length();
        for (int i = width - 1; i > 0; i--) {
            radixSingleSortString(array, i, radix);
        }
    }

    private static void radixSingleSortString(String[] input, int position, int radix) {
        int numberOfItems = input.length;
        int[] countArray = new int[radix];


        for (String value : input) {
            countArray[RadixUtil.getCountArrayIndexPosition(position, value, radix)]++;
        }

        // Adjust count array -
        // instead of containing raw count contain the number of values that contain that digit or less
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        //working from the back of the input array we first grab the number
        //look at the current getDigit in the first pass this is the least significant number
        //compare that to the count array in the position ie 1234, would look a the 4th index
        //reduce the counting array by one
        //put that number in to the relevant position in the array.
        //this is is how we maintain the stable sort
        String[] temp = new String[numberOfItems];
        for (int tempIndex = numberOfItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[RadixUtil.getCountArrayIndexPosition(position, input[tempIndex], radix)]] = input[tempIndex];
        }

        for (int i = 0; i < numberOfItems; i++) {
            input[i] = temp[i];
        }
    }


}
