package com.freeit.methodicaltasks;
import java.util.Random;
/*
14) Создать массив оценок произвольной длины,
вывести максимальную и
минимальную оценку, её (их) номера.
 */

public class Task14 {
    public static void main(String[] args)  {
        Random random = new Random();
        int maximum = 0;
        int minimum = 0;

        int[] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);

            if(minimum > array[i]){
                minimum = array[i];
            }
            if (maximum < array[i]){
                maximum = array[i];
            }
        }
        System.out.println("Max"+ maximum );
        System.out.println("Min"+ minimum);
    }
}
