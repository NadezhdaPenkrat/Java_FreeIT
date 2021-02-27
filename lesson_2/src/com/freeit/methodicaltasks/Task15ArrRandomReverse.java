package com.freeit.methodicaltasks;
/*
15) Создать массив, заполнить его
случайными элементами, распечатать,
перевернуть, и снова распечатать (
при переворачивании нежелательно создавать
еще один массив).
 */
public class Task15 {
    public static void main(String[] args) {
        int array[] = new int[5];
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