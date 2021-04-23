package com.freeit.additianal_library;


/*
Создать класс Библиотека, поля:
• Список книг (изначально пустой) методы:
• добавить книгу (принимает объект книги и
 добавляет его в список товаров).
 При попытке добавить книгу с id уже существующем в списке,
 вставка производится не должна
• получить все книги (метод ВОЗВРАЩАЕТ список всех книг в библиотеке)
• удалить книгу (метод принимает id книги и
удаляет из списка книгу с соответствующим id)
• редактировать книгу (принимает объект книги и
редактирует их список товаров)
 Обратите внимание, что id книги и
 индекс книги в списке — это разные вещи, не перепутайте.
Id книги — это поле вашего объекта, вы при его создании его задаете.
А индекс книги в списке книг, это по сути её порядковый номер в списке(начинается с 0).
 */

import java.util.ArrayList;
import java.util.List;


public class Library {

    List<Book> catalogOfBooks = new ArrayList<>();

    public List<Book> getAllBooks() {
        return catalogOfBooks;
    }

    public void add(Book book) {
        if (!catalogOfBooks.contains(book.getId())) {
            catalogOfBooks.add(book.getId(), book);
            System.out.println("Book with this id added!");
        } else {
            System.out.println("Library  has book with this id! Try another.");
        }
    }

    public void remove(Book book, int id) {

        if (catalogOfBooks.contains(book.getId())) {
            catalogOfBooks.remove(book.getId());
            System.out.println("Book with this id  removed!");
        } else {
            System.out.println("There is no book with this id!");
        }
    }

    public void edit(Book book) {
        for (Book i : catalogOfBooks) {
            if (equals(book)) {
                book.setTitle(book.getTitle());
                book.setGenre(book.getGenre());

            }

        }
    }
}


