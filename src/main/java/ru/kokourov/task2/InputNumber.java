package ru.kokourov.task2;

import ru.kokourov.messages.Message;

import java.util.Scanner;

public class InputNumber {

    private final String number;

    public InputNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println(Message.MSG_TASK2_HELLO);
        System.out.println(Message.MSG_TASK2_INPUT);
        number = in.next();
    }

    public String getNumber() {
        return number;
    }
}
