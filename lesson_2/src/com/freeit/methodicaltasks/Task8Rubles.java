package com.freeit.methodicaltasks;

import java.util.Random;

/*
8) Имеется целове число
(задать с помощью
Random rand = new Random();
int x =rand.nextInt()  ).
Это число – количесво денег в рублях.
Вывести это число, добавив к
нему слово «рублей» в правильном падеже.
 */
public class Task8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int RUBLES =rand.nextInt(15);

        int x=RUBLES%10;
        if (RUBLES%100>=10&&RUBLES%100<=15)
        {
            System.out.println(RUBLES+ " рублей");
        }
        else
        {
            switch (x)
            {
                case 1:
                    System.out.println(RUBLES+ " рубль");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println(RUBLES+ " рубля");
                    break;
                default:
                    System.out.println(RUBLES+ " рублей");
            }
        }
    }


}
