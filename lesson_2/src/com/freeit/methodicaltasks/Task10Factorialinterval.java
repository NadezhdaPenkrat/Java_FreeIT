package com.freeit.methodicaltasks;

import java.util.Random;

/*
10) Посчитать факториал числа
в границах от 10 до 15 (не используя рекурсию).
 */
public class Task10 {
    private static int interval;
    Random random = new Random();
    int n = random.nextInt((15 - 10) + 10);

    // Evaluate n!
    public static int factorial(int n) {
        if (n <= 1)     // base case
            return 1;

     else
            return n * factorial(n - 1);
    }

    // Simple test program
    public static void main(String[] args) {
        for (int i = 1; i  <= 15; i++)
            System.out.println(factorial(i));
    }
}


