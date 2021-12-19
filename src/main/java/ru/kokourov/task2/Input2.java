package ru.kokourov.task2;

import ru.kokourov.messages.Message;

import java.util.Scanner;

public class Input2 {

    private final int number;

    public Input2() {
        Scanner in = new Scanner(System.in);
        System.out.println(Message.MSG_TASK2_HELLO);
        System.out.println(Message.MSG_TASK2_INPUT);
        number = inputNumber(in);
    }

    public int getNumber() {
        return number;
    }

    private int inputNumber(Scanner in) {
        while (!in.hasNextInt()) {
            System.out.println(Message.MSG_INPUT_NUM_ERROR);
            in.next();
        }
        return  in.nextInt();
    }
}
