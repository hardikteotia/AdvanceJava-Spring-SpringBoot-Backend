package com.libraryManagementSystem.Dao;

import java.util.List;
import static com.libraryManagementSystem.utils.LibraryHibernateUtils.getFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.libraryManagementSystem.Entities.Book;

public class Book_Dao_Interface_Impl implements Book_Dao_Interface{

	 @Override
	    public void saveBook(Book book) {
	        try (Session session = getFactory().openSession()) {
	            Transaction tx = session.beginTransaction();
	            session.persist(book);
	            tx.commit();
	        }
	    }

	    @Override
	    public List<Book> getAllBooks() {
	        try (Session session = getFactory().openSession()) {
	            return session.createQuery("from Book", Book.class).list();
	        }
	    }

	    @Override
	    public Book getBookById(int id) {
	        try (Session session = getFactory().openSession()) {
	            return session.find(Book.class, id);
	        }
	    }

	    @Override
	    public List<Book> getBooksByGenre(String genre) {
	        try (Session session = getFactory().openSession()) {
	            return session.createQuery("from Book where genre = :genre", Book.class)
	                          .setParameter("genre", genre)
	                          .list();
	        }
	    }

	    @Override
	    public void deleteBook(int id) {
	        try (Session session = getFactory().openSession()) {
	            Transaction tx = session.beginTransaction();
	            Book book = session.find(Book.class, id);
	            if (book != null) session.remove(book);
	            tx.commit();
	        }
	    }
	    
	    
}
