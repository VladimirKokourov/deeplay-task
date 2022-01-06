package ru.kokourov.task2;

import java.util.Arrays;

public class SumOfDigits {

    public int sumOfDigitsOfANumber(String number) throws IllegalArgumentException, NullPointerException {
        checkNull(number);
        char[] arrChar = number.toCharArray();
        int[] arrInt;
        if (arrChar[0] == '-') {
            arrChar[0] = '0';
            arrInt = charToInt(arrChar);
            return sumArr(arrInt) - 2 * arrInt[1];
        } else {
            arrInt = charToInt(arrChar);
            return sumArr(arrInt);
        }
    }

    private int sumArr(int[] arr) {
        return Arrays.stream(arr).sum();
    }

    private int[] charToInt(char[] arrChar) throws IllegalArgumentException {
        int[] arrInt = new int[arrChar.length];
        for(int i = 0; i < arrChar.length; i++) {
            checkDigits(arrChar[i]);
            arrInt[i] = arrChar[i] - 48;
        }
        return arrInt;
    }

    private void checkDigits(char ch) throws IllegalArgumentException {
        if (ch < 48 || ch > 57) {
            throw new IllegalArgumentException();
        }
    }

    private void checkNull(String number) throws NullPointerException {
        if (number == null) {
            throw new NullPointerException();
        }
    }
}
