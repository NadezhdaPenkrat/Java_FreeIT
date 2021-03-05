package com.freeit.methodicaltasks;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 Написать программу,
 выполняющую поиск в строке шестнадцатеричных чисел,
 записаных по правилам Java,
с помощью регулярных выражений и
вывести их на страницу.
*/
public class Task22RegularExpressions {
    public static void main(String[] args) {

        String text = "  write your text <p id=p1>";
        System.out.println(text.replaceAll("<p id=p1>", "<p>"));
        Pattern pattern=Pattern.compile("0x[A-Fa-f0-9]{1,4}");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.start()+" "+matcher.end());
        }
    }
}
