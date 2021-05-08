package com.freeit.methodicaltasks;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


/*
 Вывести список файлов и каталогов
 выбранного каталога на диске.
  Файлы и каталоги
 должны быть распечатаны отдельно.
 */
public class Task36FilesCatalogsList {
    public static void main(String[] args) {

        File doc = new File("src/com/freeit/methodicaltasks/test36file.txt");
        File[] filesAndCatalogs = doc.listFiles();

        List<String> files = new ArrayList<>();
        for (String file : files) {
            System.out.println("files:  " + files);
        }
        System.out.println();

        List<String> catalogs = new ArrayList<>();
        for (String catalog : catalogs) {
            System.out.println("catalogs: " + catalogs);
        }
        if (filesAndCatalogs == null) {
            System.out.println("There are no files and catalogs.");
        } else {
            for (File name : filesAndCatalogs) {
                if (name.isFile()) {
                    files.add(name.getName());
                } else {
                    catalogs.add(name.getName());
                }
            }
        }
    }
}
