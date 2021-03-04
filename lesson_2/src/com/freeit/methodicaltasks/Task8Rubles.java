package com.freeit.methodicaltasks;

import java.util.Random;

/*
8) Имеется цело число
(задать с помощью
Random rand = new Random();
int x =rand.nextInt()  ).
Это число – количесво денег в рублях.
Вывести это число, добавив к
нему слово «рублей» в правильном падеже.
 */
public class Task8Rubles {
    public static void main(String[] args) {
        Random rand = new Random();
        int rubles =rand.nextInt(15);

        int x=rubles%10;
        if (rubles % 100 >= 10&& rubles % 100 <=15 ) {
            System.out.println(rubles+ " рублей");
        }
        else
        {
            switch (x)
            {
                case 1:
                    System.out.println(rubles+ " рубль");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println(rubles+ " рубля");
                    break;
                default:
                    System.out.println(rubles+ " рублей");
            }
        }
    }


}
