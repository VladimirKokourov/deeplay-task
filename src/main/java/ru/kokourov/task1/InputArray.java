package ru.kokourov.task1;

import ru.kokourov.messages.Message;

import java.util.Scanner;

public class InputArray {

    private final int[] arr;
    private final int minSize;

    public InputArray(int minSize) {
        Scanner in = new Scanner(System.in);
        this.minSize = minSize;
        System.out.println(Message.MSG_TASK1_HELLO);
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

    public int getMinSize() {
        return minSize;
    }
}
