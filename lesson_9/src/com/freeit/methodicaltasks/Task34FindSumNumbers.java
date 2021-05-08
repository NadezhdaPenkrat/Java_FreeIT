package com.freeit.methodicaltasks;


import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


/*
Имеется файл с текстом,
в котором присутствуют числа.
Найти все числа,
 распечатать,
 посчитать сумму,
 убрать все повторяющиеся числа
 и снова распечатать.
 */
public class Task34FindSumNumbers {
    public static void main(String[] args) {

        File file = new File("src/com/freeit/methodicaltasks/Task34FindSumNumbers/text34.txt");

        StringBuilder text = new StringBuilder();
        ArrayList<Integer> numberList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            int number;
            while ((number = bufferedReader.read()) != -1) {
                text.append((char) number);
            }
            System.out.println(number);

            int сountAmount = 0;

            for (Integer integer : numberList) {
                сountAmount += integer;
            }

            System.out.println("Numbers that are contained in the text:" + numberList.toString());

            Set<Integer> set = new HashSet<>(numberList);

            System.out.println("Unique numbers:" + set.toString());


        } catch (FileNotFoundException e) {
            System.out.print("File Not Found");
            return;
        } catch (IOException e) {
            System.out.println("Input - Output Exception");
            e.printStackTrace();
        }

    }
}
