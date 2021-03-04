package com.freeit.methodicaltasks;

import java.util.Random;


/*
9) Изменить пример с суммой чисел таким образом,
чтобы рассчитывалась не сумма, а
произведение, т.е. факториал числа.
 */
public class Task9FactorialComposition {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(15);
        int factor = 1;
        System.out.println(number * factor);
        for (int i = 1; i <= number; i++) {
            factor = factor * i;
        }
        System.out.println("= " + factor);

    }
}
