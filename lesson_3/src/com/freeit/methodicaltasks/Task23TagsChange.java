package com.freeit.methodicaltasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Написать программу,
выполняющую поиск в строке всех тегов абзацев,
в т.ч. тех, у которых есть параметры,
например <p id=”p1”>, и замену их
на простые теги абзацев <p>.
*/
public class Task23TagsChange {
    public static void main(String[] args) {

        String text = "</div> если ты всё ещё думаешь об этом </div>\n" +
                "</p> то это стоит того  </p id=”p251”>\n" +
                "<div> чтобы сделать <p>.";
        System.out.println(text.replaceAll("</?p( id=”p[1-9]+”)?>|</?div>", "<p>"));

    }
}
