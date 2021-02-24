package com.freeit.src;
// Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
//различны?
public class Task5IsAllDifferentNum {
    public static void main(String[] args) {
        int number = 3421;
        String result;

        int a = number / 1000 % 10;
        int b = number / 100 % 10;
        int c = number /10 % 10;
        int d = number % 10;

        while (number != 0) {
            System.out.print(number % 10);
            number /= 10;
            result = ( a != b && a != c && a != d && b != c && b != d && c != d ) ?
             "contains the different number." :  "contains the same  number..";
            System.out.println(result);
        }
    }
}
