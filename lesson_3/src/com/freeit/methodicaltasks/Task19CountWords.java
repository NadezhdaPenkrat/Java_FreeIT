package com.freeit.methodicaltasks;

import java.util.Scanner;
import java.util.StringTokenizer;

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
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String strTextSentence = in.nextLine();
        int countWords = new StringTokenizer(strTextSentence, " ,.?/!;:'-()\"").countTokens();
        System.out.print("Your sentence has " + countWords + " words.");
    }
}
