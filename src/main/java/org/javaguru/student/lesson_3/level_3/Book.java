package org.javaguru.student.lesson_3.level_3;

public class Book {

    String title;
    String author;
    Integer yearOfPublishing;
    Chapter chapter1;
    Chapter chapter2;

    public Book(String title, String author, Integer yearOfPublishing, Chapter chapter1, Chapter chapter2) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.chapter1 = chapter1;
        this.chapter2 = chapter2;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getYearOfPublishing() {
        return yearOfPublishing;
    }

    public Chapter getChapter1() {
        return chapter1;
    }

    public Chapter getChapter2() {
        return chapter2;
    }
}
