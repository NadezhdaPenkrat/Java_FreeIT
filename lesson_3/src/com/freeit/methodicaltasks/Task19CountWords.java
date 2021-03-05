package com.freeit.methodicaltasks;

import java.util.Scanner;

/*
Имеется строка с текстом.
Подсчитать количество слов в тексте.
Желательно учесть, что слова могут
разделяться несколькими пробелами,
в начале и конце текста
также могут быть пробелы,
но могут и отсутствовать.
*/
public class Task19CountWords {
    public static int countWords(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = in.nextLine();
        System.out.print("Your sentence has " + countWords(sentence) + " words.");
    }
}
