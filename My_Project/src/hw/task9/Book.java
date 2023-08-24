package com.itacademy.lesson11.hw.task9;

import java.util.Random;

public class Book {
    private int book_id;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private int pages;
    private float price;
    private String binding;

    public Book(int book_id, String title, String author, String publisher, int year, int pages, float price, String binding) {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.binding = binding;
    }

    public Book() {
        Random rand = new Random();

        String[] bookTitles = {
                "1984", "War and Peace", "Pieratrus u muzei", "Crime and Punishment",
                "Alice's Adventures in Wonderland", "Murder on the Orient Express", "The Shadow of the Wind", "Three Comrades",
                "Master and Margarita", "Wuthering Heights"
        };

        String[] authors = {
                "George Orwell", "Leo Tolstoy", "Alhierd Baharevich", "Fyodor Dostoevsky",
                "Lewis Carroll", "Agatha Christie", "Carlos Ruiz Zafón", "Erich Maria Remarque",
                "Mikhail Bulgakov", "Emily Brontë"
        };

        String[] publishers = {
                "Publisher \"Mart\"", "Publisher \"AST\"", "Publisher \"Knihauka\"", "Publisher \"Eksmo\"",
                "Publisher \"AST\"", "Publisher \"Prospect\"", "Publisher \"AST\"", "Publisher \"AST\"",
                "Publisher \"AST\"", "Publisher \"Eksmo\""
        };

        int n = rand.nextInt(bookTitles.length);

        this.book_id = rand.nextInt(999);
        this.title = bookTitles[n];
        this.author = authors[n];
        this.publisher = publishers[n];
        this.year = rand.nextInt(1900, 2023);
        this.pages = rand.nextInt(299, 999);
        this.price = rand.nextFloat(1.99f, 99.99f);

        if (n % 2 == 0) {
            this.binding = "Hard";
        } else {
            this.binding = "Soft";
        }
    }

    public int getBook_id() {
        return book_id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public float getPrice() {
        return price;
    }

    public String getBinding() {
        return binding;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", price=" + price +
                ", binding='" + binding + '\'' +
                '}';
    }
}

