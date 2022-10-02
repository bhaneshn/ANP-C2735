
public class P39 {

	

		public static void main(String[] args) {

		int k = 0;

		try {

		int i = 5/k;

		}

		catch(ArithmeticException e) {

		System.out.println("1");

		}

		catch(RuntimeException e) {

		System.out.println("2");

		}

		catch(Exception e) {

		System.out.println("3");

		}

		finally { //error here finally's F should not big 

		System.out.println("4");

		}

		System.out.println("5");

		}
}
