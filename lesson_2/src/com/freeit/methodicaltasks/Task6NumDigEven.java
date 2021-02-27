package com.freeit.methodicaltasks;
import java.util.Random;
/*
6) Создайте число. Определите,
является ли число трехзначным.
Определите, является
ли его последняя цифра семеркой.
Определите, является ли число четным.
 */
public class Task6NumDigEven {
    public static void main(String[] args) {
        Random random = new Random();
        int num = 697;

        //number digit
        if (num > 99 && num < 1000) {
            System.out.println("number three-digit");
        } else {
            System.out.println("not three-digit number ");
        }
        //last digit is 7
            if (num % 10 == 7) {
                System.out.println("last digit number is 7");
            } else {
                System.out.println("the last digit  number is not 7");

            }
        //even
                 if (num % 2 == 0) {
                     System.out.println("number  is even");
                     } else {
                        System.out.println("number is odd");
                    }
    }
}






