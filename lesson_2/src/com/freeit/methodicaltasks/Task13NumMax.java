package com.freeit.methodicaltasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/*
13) Создать последовательность
случайных чисел,
найти и вывести наибольшее
из них.
 */
public class Task13NumMax {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        for (int i = 0; i < array.length; i++)
            if (array[i] < 10) {
                System.out.print(array[i] + " ");

            }
        int max = array [0];

        for (int randomNumber : array) {
            if (randomNumber > max) {
                max = randomNumber;
            }
        }

        System.out.print("Max value: " + max);
    }
}




