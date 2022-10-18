package org.practicaltest.view;

import java.util.List;
import java.util.Scanner;

import org.practicaltest.model.Book;

import org.practicaltest.service.BookService;

public class BookView {

	static BookService bookService=new BookService();
	static Scanner sc=new Scanner(System.in);
	
	public void acceptBookDetails() {
		
		System.out.print("Enter book Id : ");
		String bookId =sc.nextLine();
		
		
		System.out.print("Enter book title : ");
		String title = sc.nextLine();
		
		System.out.print("Enter book's author name : ");
		String author = sc.next();
		
		System.out.print("Enter book's category : ");
		String category = sc.next();
		try {
			category(category);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.print("Enter book price : ");
		float price = sc.nextFloat();
		try {
			checkprice(price);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		 
		System.out.println();
		 
		Book book = new Book(bookId, title, author, category , price);
		bookService.addBook(book);
		
		}

		public static void checkprice(float price) throws InvalidPriceException {
			if(price>0) {
				System.out.println(price);
			}
			else {
				throw new InvalidPriceException("Not a valid price");
			}
		}

		public static void category(String category) throws InvalidCategoryException {
			 if(category.equals("Science")||category.equals("Fiction")||category.equals("Technology")||category.equals("Others")) {
				 System.out.println(category);
			 }
			 else{
				 throw new InvalidCategoryException("Not valid categeory");
			 }
				 
		}

		public static void bookid(String bookId) throws InvalidBookidException {
			if(bookId.length()==4&&bookId.charAt(0)=='B') {
				System.out.println(bookId);
			}
			else {
				throw new InvalidBookidException(bookId);
			}
		
	
	
}
		public static List<Book> dispalyAllBooks() {
			return bookService.displayAllBooks();
		
		}

	

		
	
}
