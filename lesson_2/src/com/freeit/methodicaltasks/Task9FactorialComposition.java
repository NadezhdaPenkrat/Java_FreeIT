package com.freeit.methodicaltasks;

import java.util.Random;


/*
9) Изменить пример с суммой чисел таким образом,
чтобы рассчитывалась не сумма, а
произведение, т.е. факториал числа.
 */
public class Task9Factorial {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(15);
        int factor = 1;
        System.out.println(number * factor);
        int result = 1;

        if (number == 0 || number == 1) {
            return ;
        } else {
            for (int  i = 2; i <= number; i++)
                result *= i;
            return ;
        }
    }
}
