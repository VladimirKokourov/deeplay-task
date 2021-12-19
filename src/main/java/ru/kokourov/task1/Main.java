package ru.kokourov.task1;

import ru.kokourov.messages.Message;

import java.util.Arrays;

public class Main {
    private static final int AMOUNT = 3;

    public static void main(String[] args) {
        InputArray input = new InputArray(AMOUNT);
        GreatestNumbersFinder gnf = new GreatestNumbersFinder(input);
        System.out.printf(Message.MSG_TASK1_RES, AMOUNT);
        System.out.println(Arrays.toString(gnf.find()));
    }
}
