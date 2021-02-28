package com.freeit.additionaltasks;
/* 1)В переменную записываем число.
 Надо вывести на экран сколько в этом числе
  цифр
 и положительное оно или отрицательное.
 Например,
 "это однозначное положительное число".
 Достаточно будет определить, является ли число однозначным,
 "двухзначным или трехзначным и более.
 */

import java.util.Random;

public class Task1VarNum {
    public static void main (String [] args) {
        Random random = new Random();
        int number = random.nextInt(1000);
        System.out.println ( " Number " +number );

        if (number>-10 && number <0) {
            System.out.println ( " This is a monosemantic negative number. " );
            }
        if (number>-100 && number<-10) {
            System.out.println ( " This is a two-digit negative number. " );
        }
        if (number>0 && number<10) {
            System.out.println ( " This is a monosemantic positive number. " );
        }
        if (number>10 && number<100) {
            System.out.println ( " This is a two-digit positive number. " );
        }
        if (number>100 && number<1000) {
            System.out.println ( " This is a three-digit positive number. " );
        }
    }
}

