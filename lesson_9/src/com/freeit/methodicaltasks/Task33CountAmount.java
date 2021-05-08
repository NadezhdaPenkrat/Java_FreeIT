package com.freeit.methodicaltasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 Создать файл с текстом,
 прочитать,
 подсчитать в тексте количество знаков препинания и слов.
 */

public class Task33CountAmount {
    public static void main(String[] args) throws IOException {

        StringBuilder stringBuilder = new StringBuilder();
        File file = new File
                ("src/com/freeit/methodicaltasks/Task33CountAmount/text33.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader fileInputStream = new FileReader("Task33CountAmount/text33.txt");
            int sign = fileInputStream.read();
            while (sign != -1) {
                System.out.print((char) sign);
                sign = fileInputStream.read();
            }
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
            return;
        }
        countAmountMarks(stringBuilder.toString());
        countAmountWords(stringBuilder.toString());
    }


    public static void countAmountMarks(String text) {
        Pattern pattern = Pattern.compile(" [,.?/!;:'-()><]");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("Text has " + count + "punctuation  marks.");
    }

    public static void countAmountWords(String text) {
        int countWords = new StringTokenizer(text, " [,.?/!;:'-()><]").countTokens();
        System.out.print("Text has " + countWords + " words.");
    }
}
