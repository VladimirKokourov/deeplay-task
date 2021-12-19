package ru.kokourov.task3;

import ru.kokourov.messages.Message;

import java.util.Arrays;

public class Main {
    private static final int MIN_SIZE = 0;
    public static void main(String[] args) {
        InputArrayAndNumber input = new InputArrayAndNumber(MIN_SIZE);
        Packer packer = new Packer();
        try {
            System.out.println(Arrays.toString(packer.pack(input.getArr(), input.getAmountBucket())));
        } catch (MyException e) {
            System.out.println(Message.MSG_TASK3_IMPOSSIBLE);
        }
    }
}
