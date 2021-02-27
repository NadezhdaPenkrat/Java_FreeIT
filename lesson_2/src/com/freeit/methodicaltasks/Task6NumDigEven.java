package com.freeit.methodicaltasks;

import java.util.Random;

/*
6) Создайте число. Определите,
является ли число трехзначным.
Определите, является
ли его последняя цифра семеркой.
Определите, является ли число четным.
 */
public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = 697;
        if (num > 99 && num < 1000) {
            System.out.println("number three-digit");
        } else {
            System.out.println("not three-digit ");
        }
            if (num % 10 == 7) {
                System.out.println("last digit is 7");
            } else {
                System.out.println("the last digit is not 7");
//last digit is 7
            }
                    if (num % 2 == 0) {
                     System.out.println("digit is even");
//even
                        } else {
                        System.out.println("digit odd");
                    }
    }
}




