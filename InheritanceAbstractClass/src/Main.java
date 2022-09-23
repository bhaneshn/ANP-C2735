import java.util.Scanner;

public class Main {

	public static void main (String []args) {
		Book book=new Book();
		JournalPaper jrPaper=new JournalPaper(2020);
		book.modelItem();
		jrPaper.modelItem();
		
		
		System.out.println(book.toString()); //toString getting error
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice :");
		int id =sc.nextInt();
		System.out.println(id);
	}
}
