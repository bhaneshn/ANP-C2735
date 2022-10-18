package org.practicaltest.main;

import java.util.Scanner;

import org.practicaltest.dao.BookDAO;


import org.practicaltest.view.BookView;

public class Main {

	static BookView bookView = new BookView();
	static BookDAO bookDAO = new BookDAO ();
	
	public static void main(String[] args) {
		int input=0;
		do {

		Scanner scanner=new Scanner(System.in);
		while (true) {
		System.out.println("1 Enter Book Records");
		System.out.println("2 Search Book by Title");
		System.out.println("3 Search Book by Author");
		System.out.println("4 Display All books Details");
		
		int choice=scanner.nextInt();
		
		switch(choice) {
		case 1:
			bookView.acceptBookDetails();
			break;
		case 2:
			bookDAO.searchByTitle(null);
			break;
		case 3:
			bookDAO.searchByAuthor(null);
			break;
		case 4:
			System.exit(0);
			break;
		default:
			System.out.println("Inavild Input");
			input=scanner.nextInt();
		}
	}
		
		}while(input==1);
	}

}
