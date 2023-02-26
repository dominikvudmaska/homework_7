package com.homework.library;

import com.homework.books.Book;

import java.time.LocalDate;
import java.util.Date;

public class Borrowing {
    private Book book;
    private Subscriber subscriber;
    private LocalDate returnDate;

    public Borrowing(Book book, Subscriber subscriber, LocalDate returnDate) {
        this.book = book;
        this.subscriber = subscriber;
        this.returnDate = returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}
