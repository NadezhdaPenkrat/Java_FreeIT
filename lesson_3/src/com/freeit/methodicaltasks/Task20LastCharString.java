package com.freeit.methodicaltasks;

import java.util.Scanner;

/*
Имеется строка с текстом.
Вывести текст,
составленный из последних букв всех слов.
*/
public class Task20LastCharString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = scanner.nextLine();

        StringBuilder res = new StringBuilder();

        String[] words = str.split("\\s+");
        for (String word : words)
            res.append(word.toCharArray()[word.length() - 1]);

        System.out.println("String: " + str);
        System.out.println("Result: " + res.toString());
    }

}
