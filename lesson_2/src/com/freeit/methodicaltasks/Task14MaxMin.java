package com.freeit.methodicaltasks;

import java.util.Arrays;
import java.util.Random;
/*
14) Создать массив оценок произвольной длины,
вывести максимальную и
минимальную оценку, её (их) номера.
 */

public class Task14MaxMin {
    public static void main(String[] args) {
        Random random = new Random();
        int[] number = new int[10];
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(number));

        int maxNum = number[0];
        int minNum = number[0];
        int maxNumIndx = 0;
        int minNumIndx = 0;

        for (int i = 0; i < number.length; i++) {
            if (number[i] > maxNum) {
                maxNum = number[i];
                maxNumIndx = i;
            }

            if (number[i] < minNum) {
                minNum = number[i];
                minNumIndx = i;
            }
        }

        System.out.println("maxNum: " + maxNum + "" + " maxNumIndx " + maxNumIndx);
        System.out.println("minNum: " + minNum + "" + " minNumIndx " + minNumIndx);
    }
}
