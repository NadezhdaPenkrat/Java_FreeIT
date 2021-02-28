package com.freeit.additionaltasks;

import java.util.Random;

/*5) Даны 3 целых числа.
Найти количество положительных и
отрицательных чисел в исходном наборе.
 */
public class Task5FindPositiveNegative {
    public static void main(String[] args) {
        Random random = new Random();
        int firstNumber = random.nextInt(1000);
        System.out.println(" Дано первое число: " +firstNumber);
        int secondNumber = random.nextInt(1000);
        System.out.println(" Дано второе число: " +secondNumber);
        int thirdNumber = random.nextInt(1000);
        System.out.println(" Дано третье число: " +thirdNumber);

        int sum=0;
        int sum1=0;

        if (firstNumber>0) sum++;
        if (firstNumber<0) sum1++;

        if (secondNumber>0) sum++;
        if (secondNumber<0) sum1++;

        if (thirdNumber>0) sum++;
        if (thirdNumber<0) sum1++;

        {System.out.println ("Положительных чисел:  "+sum);}
        {System.out.println ("Отрицательных чисел:  "+sum1);}

    }
}
