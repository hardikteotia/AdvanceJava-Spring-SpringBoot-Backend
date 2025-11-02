package com.libraryManagementSystem.Dao;

import com.libraryManagementSystem.Entities.*;
import java.util.List;

public interface Book_Dao_Interface {
    void saveBook(Book book);
    List<Book> getAllBooks();
    Book getBookById(int id);
    List<Book> getBooksByGenre(String genre);
    void deleteBook(int id);
}
