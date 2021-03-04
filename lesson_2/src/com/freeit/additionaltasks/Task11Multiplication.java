package com.freeit.additionaltasks;

import java.util.Random;

// 11) Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
public class Task11Multiplication {
    public static void main(String[] args) {

        Random random = new Random();
        int NumberA = random.nextInt(1000);
        System.out.println(" Дано первое число: " +NumberA);
        int NumberB = random.nextInt(1000);
        System.out.println(" Дано второе число: " +NumberB);


    int multiplicationOperation = 0;
        for (int i = 0; i < NumberB; i++) {
            multiplicationOperation += NumberA;
    }
        System.out.println("Итог Переумножение: "+ multiplicationOperation);
}
}
