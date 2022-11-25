package org.tnsindia.dao;

import java.util.List;

import org.tnsindia.entities.Book;

public interface BookDao {
	
	//abstract method
	
	Book getBookById(int id);
	List <Book> getBookByTitle(String title);
	List <Book> getAuthorBooks (String author);
	List <Book> getAllBooks();
	List <Book> getBookInPriceRange(double low,double high);

}
