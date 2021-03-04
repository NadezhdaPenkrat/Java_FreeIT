package com.freeit.methodicaltasks;

import java.util.Random;

/*
15) Создать массив, заполнить его
случайными элементами, распечатать,
перевернуть, и снова распечатать (
при переворачивании нежелательно создавать
еще один массив).
 */
public class Task15ArrRandomReverse {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt();
        int[] array = new int[5];
        int i;
        for (i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}