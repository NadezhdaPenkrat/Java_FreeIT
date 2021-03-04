package com.freeit.src;

// Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
//различны?
public class Task5IsAllDifferentNum {
    public static void main(String[] args) {
        int number = 3421;
        String result;

        int numberFirst = number / 1000 % 10;
        int numberSecond = number / 100 % 10;
        int numberThird = number / 10 % 10;
        int numberFourth = number % 10;

        while (number != 0) {
            System.out.print(number % 10);
            number /= 10;
            result = (numberFirst != numberSecond &&
                    numberFirst != numberThird &&
                    numberFirst != numberFourth &&
                    numberSecond != numberThird &&
                    numberSecond != numberFourth &&
                    numberThird != numberFourth)
                    ?
                    "contains the different number." : "contains the same  number..";
            System.out.println(result);
        }
    }
}
