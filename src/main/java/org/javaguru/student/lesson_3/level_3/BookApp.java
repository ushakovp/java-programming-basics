package org.javaguru.student.lesson_3.level_3;

public class BookApp {

    public static void main(String[] args) {
        Book book1 = new Book(
                "Java",
                "Guru",
                2000,
                new Chapter("Java", "1000"),
                new Chapter("Java", "2000")
        );

        Book book2 = new Book(
                "Java",
                "Guru",
                2000,
                new Chapter("Java", "1000"),
                new Chapter("Java", "2000")
        );
        System.out.println(book1.getTitle() + " " +book1.getAuthor() + " " + book1.getYearOfPublishing() + " " + book1.getChapter1().getContent() + " " + book1.getChapter2().getTitle() + " ");
    }
}
