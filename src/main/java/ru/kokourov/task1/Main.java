package ru.kokourov.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final String MSG_INPUT_SIZE = "Введите размер массива: ";
    private static final String MSG_INPUT_ARRAY = "Введите массив: ";
    private static final String MSG_OUTPUT = "Наибольшие числа массива: ";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GreatestNumbersFinder gnf = new GreatestNumbersFinder();

        System.out.println(MSG_INPUT_SIZE);
        int n = in.nextInt();
        System.out.println(MSG_INPUT_ARRAY);
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int[] result = gnf.find(arr);
        System.out.println(MSG_OUTPUT);
        System.out.println(Arrays.toString(result));
        in.close();
    }
}
