package org.practicaltest.service;

import java.util.ArrayList;
import java.util.List;

import org.practicaltest.dao.BookDAO;
import org.practicaltest.model.Book;

public class BookService {

	static List<Book> bookList=new ArrayList<Book>();
	static BookDAO bookDAO=new BookDAO();
	static Book book=new Book();
	public static void addBook(Book b) {
		bookDAO.addBook(b);
		
	}
	public Book searchByTitle(String title) {
		bookDAO.searchByTitle(title);
		return book;
	}
	public List<Book> searchByAuthor(String author) {
		bookDAO.searchByTitle(author);
		return bookList;
	}
	public List<Book> displayAllBooks(){
		return bookDAO.displayAllBooks();
	}
}
