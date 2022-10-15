package org.practicaltest.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.practicaltest.model.Book;

public class BookDAO {

	Book myBooks=new Book();
	static List<Book> bookList=new ArrayList<Book>();
	Scanner scanner =new Scanner(System.in);
	public void addBook(Book b) {
		bookList.add(b);
		System.out.println(bookList);
	}
	
	public String searchByTitle() {
		System.out.println("Search Book Title");
		String title=scanner.nextLine();
		
		 for (int i = 0; i < title.length(); i++) {
			 if(myBooks.getTitle().contains(title)){
				 bookList.add(myBooks);
			 }
		 }
		 return title;
	}
	public String searchByAuthor() {
		System.out.println("Search Book Author");
		String author=scanner.nextLine();
		
		 for (int i = 0; i < author.length(); i++) {
			 if(myBooks.getAuthor().contains(author)){
				 bookList.add(myBooks);
			 }
		 }
		 return author;
	}
	
	public List<Book> displayAllBooks(){
		return bookList;
	}
}
