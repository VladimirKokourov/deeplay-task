package ru.kokourov.task1;

import java.util.Arrays;

public class GreatestNumbersFinder {
    private static final int AMOUNT = 3;
    private final int[] result;

    public GreatestNumbersFinder() {
        result = new int[AMOUNT];
    }

    public int[] find(int[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length - AMOUNT, j = 0; i < arr.length; i++, j++) {
            result[j] = arr[i];
        }
        return result;
    }
}
