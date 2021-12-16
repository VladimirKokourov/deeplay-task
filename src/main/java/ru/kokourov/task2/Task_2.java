package ru.kokourov.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    private static final String MSG_INPUT = "Введите целое число: ";
    private static final String MSG_OUTPUT = "Сумма цифр данного числа равна: ";

    public static void main(String[] args) {
        Task_2 task2 = new Task_2();
        Scanner in = new Scanner(System.in);
        System.out.println(MSG_INPUT);
        String number = in.next();
        int result = task2.sumOfDigits(number);
        System.out.println(MSG_OUTPUT);
        System.out.println(result);
    }

    public int sumOfDigits(String number) {
        int[] arr = Arrays.stream(number.split("")).mapToInt(Integer::parseInt).toArray();
        return sumArr(arr);
    }

    private int sumArr(int[] arr) {
        return Arrays.stream(arr).sum();
    }
}
