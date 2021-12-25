package ru.kokourov.task3;

import ru.kokourov.messages.Message;

import java.util.Arrays;
/*
    Программа нахождения распределения данного набора чисел(возможны
повторяющиеся числа) на заданное число групп так, чтобы были равными
суммы чисел, входящих в каждую группу. Если это сделать невозможно, то
программа определяет этот факт.
 */
public class Main {
    public static void main(String[] args) {
        InputArrayAndNumber input = new InputArrayAndNumber();
        Packer packer = new Packer();
        try {
            System.out.println(Message.MSG_TASK3_SUCCESS +
                    Arrays.toString(packer.pack(input.getArr(), input.getAmountBucket())));
        } catch (MyException e) {
            System.out.printf(Message.MSG_TASK3_IMPOSSIBLE, input.getAmountBucket());
            System.out.println(Arrays.toString(input.getArr()));
        }
    }
}
