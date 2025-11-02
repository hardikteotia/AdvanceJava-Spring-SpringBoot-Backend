package com.libraryManagementSystem.testers;
import com.libraryManagementSystem.Dao.*;
import com.libraryManagementSystem.Entities.Author;
import com.libraryManagementSystem.Entities.Book;

import java.time.LocalDate;

public class LibraryManagementSystemTester {

	public static void main(String[] args) {
        Book_Dao_Interface dao = new Book_Dao_Interface_Impl();
        Book_Dao_Interface dao2 = new Book_Dao_Interface_Impl();
        Author author = new Author();
        author.setName("George Orwell");
        author.setNationality("British");

        Book book = new Book();
        book.setTitle("1984");
        book.setGenre("Dystopian");
        book.setPrice(499.99);
        book.setPublishedDate(LocalDate.parse("1949-06-08"));
        book.setAuthor(author);
        
        
        dao.saveBook(book);
        System.out.println("📘 Book with author added successfully!");
    }

}
