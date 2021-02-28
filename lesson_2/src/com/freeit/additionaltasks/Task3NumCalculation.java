package com.freeit.additionaltasks;
/* 3) Дано целое число.
Если оно является положительным, то прибавить к нему1.
Если отрицательным, то вычесть из него2.
Если нулевым, то заменить его на 10.
Вывести полученное число
*/
import java.util.Random;

public class Task3NumCalculation {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(1000);
        System.out.println(" Дано целое число: " +number);
        if (number > 0) {
            if (number > 0) {
                System.out.println("Если оно является положительным, то прибавить к нему 1:  " + (number = number + 1));
            } else if (number < 0) {
                System.out.println("Если отрицательным, то вычесть из него 2:  " + (number = number - 2));
            } else {
                System.out.println("Если нулевым, то заменить его на 10:  " + ( number = 10));
            }
        }
    }
}

