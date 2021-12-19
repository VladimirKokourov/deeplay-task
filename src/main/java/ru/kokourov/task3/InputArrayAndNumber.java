package ru.kokourov.task3;

import ru.kokourov.messages.Message;

import java.util.Scanner;

public class InputArrayAndNumber {
    private final int[] arr;
    private final int amountBucket;

    public InputArrayAndNumber(int minSize) {
        Scanner in = new Scanner(System.in);

        System.out.println(Message.MSG_TASK3_HELLO);
        System.out.println(Message.MSG_TASK1_INPUT_SIZE);

        int size;
        do {
            System.out.printf(Message.MSG_TASK1_INPUT_SIZE_ERROR, minSize);
            size = inputNumber(in);
        } while (size < minSize);

        arr = new int[size];

        System.out.printf(Message.MSG_TASK1_INPUT_ARRAY, size);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(Message.MSG_TASK1_INPUT_ARRAY_BALANCE, size - i);
            arr[i] = inputNumber(in);
            System.out.printf(Message.MSG_TASK1_INPUT_ARRAY_ADD, arr[i]);
        }

        System.out.println(Message.MSG_TASK3_INPUT_AMOUNT_GROUPS);
        amountBucket = inputNumber(in);
        in.close();
    }
    private int inputNumber(Scanner in) {
        while (!in.hasNextInt()) {
            System.out.println(Message.MSG_INPUT_NUM_ERROR);
            in.next();
        }
        return in.nextInt();
    }

    public int[] getArr() {
        return arr;
    }

    public int getAmountBucket() {
        return amountBucket;
    }
}
