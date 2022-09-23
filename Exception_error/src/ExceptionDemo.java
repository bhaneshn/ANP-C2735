import java.util.Scanner;

public class ExceptionDemo {

	static void display() {
		
		try {
			
//			int d=8/0;
		}catch(NullPointerException Npe) {
			System.out.println("Npe");
			Npe.printStackTrace();
		}catch(RuntimeException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}catch(Throwable e) {
			e.printStackTrace();
		}
		finally {
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Line 1");
		display();
		int s=scanner.nextInt();
		System.out.println(s);
		System.out.println("Line 2");
	}
}
