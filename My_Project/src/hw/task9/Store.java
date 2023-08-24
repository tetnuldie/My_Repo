package com.itacademy.lesson11.hw.task9;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Book> bookstore;

    public Store(List<Book> bookstore) {
        this.bookstore = bookstore;
    }

    public Store() {
        List<Book> bookstore = new ArrayList<>();
        Book b = new Book();
        bookstore.add(b);

        this.bookstore = bookstore;
    }

    public Store(int n) {
        List<Book> bookstore = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            bookstore.add(new Book());
        }
        this.bookstore = bookstore;
    }

    public List<Book> getBookstore() {
        return bookstore;
    }

    public List<Book> findByAuthor(String name) {
        List<Book> result = new ArrayList<>();

        for (int i = 0; i < bookstore.size(); i++) {
            if (bookstore.get(i).getAuthor().contains(name)) {
                result.add(bookstore.get(i));
            }
        }
        if (result.size() > 0) {
            return result;
        } else {
            throw new RuntimeException("findByAuthor - No books found");
        }
    }
    public List<Book> findByPublisher(String name) {
        List<Book> result = new ArrayList<>();

        for (int i = 0; i < bookstore.size(); i++) {
            if (bookstore.get(i).getPublisher().contains(name)) {
                result.add(bookstore.get(i));
            }
        }
        if (result.size() > 0) {
            return result;
        } else {
            throw new RuntimeException("findByPublisher - No books found");
        }
    }

    public List<Book> findByYear(int year) {
        List<Book> result = new ArrayList<>();

        for (int i = 0; i < bookstore.size(); i++) {
            if (bookstore.get(i).getYear() >= year) {
                result.add(bookstore.get(i));
            }
        }
        if (result.size() > 0) {
            return result;
        } else {
            throw new RuntimeException("findByYear - No books found");
        }
    }
}
