package com.lachlanlindsay.cs.sort;

/**
 * Makes assumptions about the data
 * Data must have the same radix and width
 * Radix is 10 for digits: 0-9 and 26 for the alphabet
 * Sorted based on individual digit or letter position
 * Must use a stable sort algorithm at each stage
 * Starts with the position with the least weight
 * <p>
 * https://www.cs.usfca.edu/~galles/visualization/RadixSort.html
 */
public class RadixSortInts {

    public static void sort(int[] array) {
        final int radix = 10;

        int width = getWidth(array[0]);
        for (int i = 0; i < width; i++) {
            radixSingleSort(array, i, radix);
        }
    }

    private static void radixSingleSort(int[] input, int position, int radix) {
        int numberOfItems = input.length;
        int[] countArray = new int[radix];


        for (int value : input) {
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
        int[] temp = new int[numberOfItems];
        for (int tempIndex = numberOfItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[RadixUtil.getCountArrayIndexPosition(position, input[tempIndex], radix)]] = input[tempIndex];
        }

        for (int i = 0; i < numberOfItems; i++) {
            input[i] = temp[i];
        }
    }

    public static int getWidth(int i) {
        if (i == 0) {
            return 1;
        }

        if (i < 0) {
            i = -i;
        }

        return (int) (Math.log10(i) + 1);
    }


}
