package com.freeit.additianal_library;
/*
(обязательное): В main:
• создаем объект библиотеки
• создаем пару тройку книг и добавляем эти книги в библиотеку
• получаем список книг из библиотеки, сортируем по полю title (по названию книги) и выводим в консоль.
• удаляем одну книгу
• получаем список книг из библиотеки, сортируем по порядку добавления (последние добавленные в начале) и выводим в консоль.
• редактируем одну книгу
• получаем список книг и выводим в консоль
 */

import java.util.Collections;

public class Run {

    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book(1, "The Man Who Laughs. Victor Hugo", Genre.CLASSIC.ROMANCE);
        Book book2 = new Book(2, "Fahrenheit 451. Ray Bradbury", Genre.SCIENCE_FICTION_STORY.ROMANCE);
        Book book3 = new Book(3, "Pygmalion. Bernard Shaw", Genre.PLAY);
        Book book4 = new Book(4, "The Gulag Archipelago.  Aleksandr Solzhenitsyn", Genre.BIOGRAPHY.THRILLER);
        Book book5 = new Book(5, "Flowers for Algernon. Daniel Keyes", Genre.SCIENCE_FICTION_STORY);
        Book book6 = new Book(6, "Fellowship of the Ring. J. R. R. Tolkien", Genre.FANTASY.ADVENTURE);
        Book book7 = new Book(7, "The Godfather. Mario Puzo", Genre.ROMANCE);
        Book book8 = new Book(8, "How the Steel Was Tempered.  Nikolai Ostrovsky", Genre.BIOGRAPHY.THRILLER);
        Book book9 = new Book(9, "One Hundred Years Of Solitude ... Gabriel Garcia Marquez", Genre.ROMANCE);
        Book book10 = new Book(10, "One Flew Over the Cuckoo's Nest. Ken Kesey", Genre.ROMANCE.ADVENTURE);

        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        library.add(book5);
        library.add(book6);
        library.add(book7);
        library.add(book8);
        library.add(book9);
        library.add(book10);

        System.out.println(library.catalogOfBooks);
        library.getAllBooks().sort(Collections.reverseOrder());
        System.out.println(library.getAllBooks().toString());
        library.remove();
        Collections.reverse(library.catalogOfBooks);
        System.out.println(library.catalogOfBooks);
        library.edit();
        System.out.println(library.getAllBooks().toString());
    }
}

