package com.freeit.additionaltasks;

import java.util.Random;

// 6) Даны 2 числа. Вывести большее из них
public class Task6NumBigger {
    public static void main(String[] args) {
        Random random = new Random();
        int firstNumber = random.nextInt(1000);
        System.out.println(" Дано первое число: " + firstNumber);
        int secondNumber = random.nextInt(1000);
        System.out.println(" Дано второе число: " + secondNumber);

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber);
        } else {
            System.out.println(secondNumber);

        }
    }
}


