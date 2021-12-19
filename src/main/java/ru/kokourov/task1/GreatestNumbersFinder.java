package ru.kokourov.task1;

import java.util.Arrays;

public class GreatestNumbersFinder {

    private final int[] arr;
    private final int minSize;
    //constructor for test
    public GreatestNumbersFinder(int[] arr, int minSize) {
        this.arr = arr;
        this.minSize = minSize;
    }

    public GreatestNumbersFinder(InputArray input) throws NullPointerException {
        if (input == null) {
            throw new NullPointerException("Input is null");
        }
        arr = input.getArr();
        minSize = input.getMinSize();
    }

    public int[] find() {
        int[] result = new int[minSize];
        Arrays.sort(arr);
        for (int i = arr.length - minSize, j = 0; i < arr.length; i++, j++) {
            result[j] = arr[i];
        }
        return result;
    }
}
