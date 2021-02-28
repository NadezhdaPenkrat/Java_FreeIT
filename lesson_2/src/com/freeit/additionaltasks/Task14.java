package com.freeit.additionaltasks;
// 14)Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
public class Task14 {
    public static void main(String[] args) {

        int calculate = 0;
        for (int i = 1; i <= 99; i += 2) {
            calculate += i;
        }
        System.out.println("Determine the sum of all odd numbers from 1 to 99 :  " +calculate);
    }
}
