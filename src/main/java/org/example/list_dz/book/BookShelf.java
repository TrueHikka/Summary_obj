package org.example.list_dz.book;

import java.util.ArrayList;

public class BookShelf {
    private ArrayList<String> books;

    public BookShelf() {
        books = new ArrayList<>();
    }

    public void addBook(String bookName) {
        books.add(bookName);
    }

    public void removeBook(String bookName) {
        books.removeIf(book -> book.equals(bookName));
    }

    public ArrayList<String> listBook() {
        return books;
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "book=" + books +
                '}';
    }
}
