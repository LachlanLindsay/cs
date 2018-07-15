package com.lachlanlindsay.Sort;

public class RadixUtil {
    public static int getCountArrayIndexPosition(int position, Object value, int radix) {
        if (value instanceof Integer) {
            return getDigit(position, (int) value, radix);
        }
        return getLetterPosition(position, (String) value);
    }

    private static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(10, position) % radix;
    }

    private static int getLetterPosition(int position, String value) {
        return value.charAt(position) - 'a';
    }
}
