package com.example.bookservice;

import com.example.bookservice.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();

    void save(Book book);
}

