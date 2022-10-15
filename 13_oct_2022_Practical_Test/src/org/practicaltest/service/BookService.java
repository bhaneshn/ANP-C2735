package org.practicaltest.service;

import java.util.List;

import org.practicaltest.dao.BookDAO;
import org.practicaltest.model.Book;

public class BookService {

	static BookDAO bookDAO=new BookDAO();
	
	public static void addBook(Book b) {
		bookDAO.addBook(b);
		
	}
	public void searchByTitle() {
		bookDAO.searchByTitle();
	}
	public void searchByAuthor() {
		bookDAO.searchByTitle();
	}
	public List<Book> displayAllBooks(){
		return bookDAO.displayAllBooks();
	}
}
