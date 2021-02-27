package com.freeit.methodicaltasks;

import java.util.Random;

/*
12) Найдите сумму первых n целых чисел,
которые делятся на 3.
 */
public class Task12SumDiv {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(15);
        int sum=0;
        for(int i=0;i<=n;i++)

            {
                if(i%3==0)
                {
                    sum=sum+i;
                }
            }

        System.out.print(""+sum);


    }

}


