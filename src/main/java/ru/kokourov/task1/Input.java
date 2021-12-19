package ru.kokourov.task1;

import java.util.Scanner;

public class Input {
    private static final String MSG_HELLO = "Программа вывода наибольших чисел массива приветствует Вас.";
    private static final String MSG_INPUT_SIZE = "Введите размер массива.";

    private int size;
    private int[] arr;
    private int minSize;
    Scanner in;

    public Input(int minSize) {
        this.minSize = minSize;
        in = new Scanner(System.in);
        System.out.println(MSG_HELLO);
        System.out.println(MSG_INPUT_SIZE);

        do {
            System.out.printf("Это должно быть число больше %d:\n", minSize);
            size = inputNumber(in);
        } while (size < minSize);

        arr = new int[size];

        System.out.printf("Отлично! Введите массив размерностью %d.\n", size);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Осталось ввести %d элемент(а)(ов).\n", size - i);
            arr[i] = inputNumber(in);
            System.out.printf("Элемент \"%d\" добавлен.\n", arr[i]);
        }
        in.close();
    }

    private int inputNumber(Scanner in) {
        while (!in.hasNextInt()) {
            System.out.println("Это не целое число. Попробуйте еще раз.");
            in.next();
        }
        return  in.nextInt();
    }

    public int[] getArr() {
        return arr;
    }

    public int getMinSize() {
        return minSize;
    }
}
