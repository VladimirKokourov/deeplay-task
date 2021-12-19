package ru.kokourov.task1;

import java.util.Arrays;

public class Main {
    private static final int AMOUNT = 3;

    public static void main(String[] args) {
        Input input = new Input(AMOUNT);
        GreatestNumbersFinder gnf = new GreatestNumbersFinder(input);
        System.out.printf("Наибольшие %d числа массива: ", AMOUNT);
        System.out.println(Arrays.toString(gnf.find()));
    }
}
