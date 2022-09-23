package com.starlite.view;

import java.util.Scanner;

import com.starlite.dao.RentalDAO;
import com.starlite.model.Book;
import com.starlite.model.RentalDetails;
import com.starlite.service.BookService;

public class BookView {

	static Scanner scan=new Scanner(System.in);
	public static boolean addBook() {
		System.out.println("Book Add Method");
		System.out.println("Enter a book Id");
		int bookId=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter a book name");
		String bookName=scan.nextLine();
		System.out.println("Enter a author name");
		String authorName=scan.nextLine();
		System.out.println("Enter a publisher name");
		String publisher=scan.nextLine();
		System.out.println("Enter a rentalPrice");
		int rentalPrice=scan.nextInt();
		
		
		Book book=new Book(bookId,authorName,bookName,publisher,rentalPrice);
		BookService.addBook(book);
		return true;
		
	}
	public static Book[] displayBooks() {
		return BookService.displayBooks();
	}
	
	
}
