package org.practicaltest.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.practicaltest.model.Book;

public class BookDAO {

	static Book myBooks=new Book();
	static List<Book> bookList=new ArrayList<Book>();
	static Scanner scanner =new Scanner(System.in);
	public void addBook(Book b) {
		bookList.add(b);
		System.out.println(bookList);
	}
	
	public Book searchByTitle(String title) {
		System.out.println("Enter book title");
		String title1= scanner.next();
		
	    for(Book b : bookList){
	        if(title1.equalsIgnoreCase(myBooks.getTitle())){
	        	System.out.println("Book is avaliable");
	        }
	        else {
	        	System.out.println("Book is not avalible");
	        }
	     
	    }
	    return myBooks;
	    }
	public List<Book> searchByAuthor(String author) {
		System.out.println("Enter book Author");
		String author1 = scanner.next();
		
	    for(Book b : bookList){
	    	System.out.println(b);
	        if(author1.equalsIgnoreCase(myBooks.getAuthor())){
	        	System.out.println("Book is avaliable");
	        }
	        else {
	        	System.out.println("Book is not avalible");
	        }
	    }
	    return bookList;
	    }
	
	public List<Book> displayAllBooks(){
		return bookList;
	}
}
