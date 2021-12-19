package ru.kokourov.task1;

import ru.kokourov.messages.Message;

import java.util.Arrays;
//Программа нахождения трех наибольших элементов в массиве чисел.
public class Main {
    //количество чисел, которые ищем
    private static final int AMOUNT = 3;

    public static void main(String[] args) {
        InputArray input = new InputArray(AMOUNT);
        GreatestNumbersFinder gnf = new GreatestNumbersFinder(input);
        System.out.printf(Message.MSG_TASK1_RES, AMOUNT);
        System.out.println(Arrays.toString(gnf.find()));
    }
}
