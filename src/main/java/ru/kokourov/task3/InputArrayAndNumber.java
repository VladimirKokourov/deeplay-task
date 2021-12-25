package ru.kokourov.task3;

import ru.kokourov.messages.Message;

import java.util.Scanner;

public class InputArrayAndNumber {
    private final int[] arr;
    private final int amountBucket;

    public InputArrayAndNumber() {
        Scanner in = new Scanner(System.in);

        System.out.println(Message.MSG_TASK3_HELLO);
        System.out.print(Message.MSG_TASK1_INPUT_SIZE);
        //ввод размера массива
        int size = inputPosNumber(in);
        arr = new int[size];
        //ввод массива
        System.out.printf(Message.MSG_TASK1_INPUT_ARRAY, size);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inputPosNumber(in);
            System.out.printf(Message.MSG_TASK1_INPUT_ARRAY_ADD, arr[i]);
        }
        //ввод количества групп
        System.out.print(Message.MSG_TASK3_INPUT_AMOUNT_GROUPS);
        amountBucket = inputPosNumber(in);
        in.close();
    }
    //метод ввода положительного числа
    private int inputPosNumber(Scanner in) {
        int temp;
        do {
            System.out.printf(Message.MSG_TASK3_INPUT_SIZE_ERROR);
            while (!in.hasNextInt()) {
                System.out.println(Message.MSG_INPUT_NUM_ERROR);
                in.next();
            }
            temp = in.nextInt();
        } while (temp <= 0);
        return temp;
    }

    public int[] getArr() {
        return arr;
    }

    public int getAmountBucket() {
        return amountBucket;
    }
}
