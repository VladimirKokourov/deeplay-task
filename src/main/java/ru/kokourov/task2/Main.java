package ru.kokourov.task2;

import ru.kokourov.messages.Message;

public class Main {
    public static void main(String[] args) {
        InputNumber in = new InputNumber();
        SumOfDigits sod = new SumOfDigits();
        System.out.printf(Message.MSG_TASK2_RES, in.getNumber(), sod.sumOfDigitsOfANumber(in.getNumber()));
    }
}
