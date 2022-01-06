package ru.kokourov.task2;

import ru.kokourov.messages.Message;
//Программа нахождения суммы цифр целого числа
public class Main {
    public static void main(String[] args) {
        InputNumber in = new InputNumber();
        SumOfDigits sod = new SumOfDigits();
        try {
            System.out.printf(Message.MSG_TASK2_RES, in.getNumber(), sod.sumOfDigitsOfANumber(in.getNumber()));
        } catch (IllegalArgumentException ex) {
            System.out.println(Message.MSG_INPUT_NUM_ERROR);
        } catch (NullPointerException ex) {
            ex.getMessage();
        }
    }
}
