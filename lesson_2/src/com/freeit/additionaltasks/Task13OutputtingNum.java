package com.freeit.additionaltasks;
// 13)Напишите программу вывода всех четных чисел от 2 до 100 включительно
public class Task13OutputtingNum {
    public static void main(String[] args) {
        int[] array = new int[21];
        for (int i = 2; i <= 20; i = i + 2){
            i = i + array[i];

            System.out.println("outputting all even numbers from 2 to 100 : "+ i + "  ");
        }

    }
}
