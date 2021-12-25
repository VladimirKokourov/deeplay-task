package ru.kokourov.task2;

import java.util.Arrays;

public class SumOfDigits {

    public int sumOfDigitsOfANumber(int number) {
        int[] arr;
        if (number >= 0) {
            String str = Integer.toString(number);
            arr = strToArr(str);
        } else {
            StringBuilder sb = new StringBuilder(Integer.toString(number));
            sb.reverse();
            sb.deleteCharAt(sb.length() - 1);
            arr = strToArr(sb.toString());
            arr[arr.length - 1] = arr[arr.length - 1] - 2 * arr[arr.length - 1];
        }
        return sumArr(arr);
    }

    private int sumArr(int[] arr) {
        return Arrays.stream(arr).sum();
    }

    private int[] strToArr(String str) {
        return Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();
    }
}
