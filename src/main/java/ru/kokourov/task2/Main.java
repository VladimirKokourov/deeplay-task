package ru.kokourov.task2;

import ru.kokourov.messages.Message;

public class Main {
    public static void main(String[] args) {
        Input2 in = new Input2();
        SumOfDigits sod = new SumOfDigits();
        System.out.printf(Message.MSG_TASK2_RES, in.getNumber(), sod.sumOfDigitsOfANumber(in.getNumber()));
    }
}
