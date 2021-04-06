package com.freeit.methodicaltasks;

import java.util.Scanner;
import java.util.StringTokenizer;

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
        StringTokenizer strTok = new StringTokenizer(str, " ,.?/!;:'-()\"");
        int count = strTok.countTokens();
        StringBuilder endLetter = new StringBuilder();

        for (int i = 0; i < count; i++) {
            String strWords = strTok.nextToken();
            endLetter.append(strWords.charAt(strWords.length() - 1));

            System.out.println("String: " + str);
            System.out.println("Result: " + "\"" + endLetter + "\" ");

        }
    }
}
