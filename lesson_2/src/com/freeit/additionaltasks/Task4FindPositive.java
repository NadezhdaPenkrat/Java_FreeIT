package com.freeit.additionaltasks;

import java.util.Random;

/* 4) Даны 3 целых числа.
Найти количество положительных чисел в исходном наборе.
 */
public class Task4FindPositive {
    public static void main(String[] args) {
        Random random = new Random();

        int firstNumber = random.nextInt(1000);
        System.out.println(" Дано первое число: " +firstNumber);
        int secondNumber = random.nextInt(1000);
        System.out.println(" Дано второе число: " +secondNumber);
        int thirdNumber = random.nextInt(1000);
        System.out.println(" Дано третье число: " +thirdNumber);

        int sum=0;

        if (firstNumber>0) sum++;
        if (secondNumber>0) sum++;
        if (thirdNumber>0) sum++;

        {System.out.println ("Положительных чисел:  "+sum);}
    }
}
