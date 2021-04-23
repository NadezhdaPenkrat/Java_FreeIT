package com.freeit.additianal_library;
/*
Создать класс Книга, поля:
• id (целое число)
• title (строка)
• genre (строка)
 (Если вы уже в себе уверены,
 создавайте еще один класс Genre
 и в класс Book вмест genre включайте genreId,
 который будет ссылаться на жанр с соответствующим id)
*/

import java.util.Objects;

public class Book {
    int id;
    static String title;
    Genre genre;

    public Book(int id, String title, Genre genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }


    public int hashCode() {
        return Objects.hash(id, title, genre);
    }


    public int compareTo(Object o) {

        return title.compareTo(this.title);
    }


    public String toString() {
        return "Book Description{" +
                "Id=" + id +
                ", Title='" + title +
                ", Genre=" + genre +
                '\'' +
                '}';
    }
}
