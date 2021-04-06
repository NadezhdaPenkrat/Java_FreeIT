package com.freeit.methodicaltasks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Найти в строке не только запятые,
но и другие знаки препинания.
Подсчитать общее их количество.
*/
public class Task18RegExFoundCount {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[!.,;:?\\-]");
        System.out.println("please. write your text: ");
        Scanner scanner = new Scanner(System.in);
        Matcher matcher = pattern.matcher(scanner.nextLine());
        int count = 0;
        while (matcher.find()) {
            count++;
        }

        System.out.println(count);
    }
}
