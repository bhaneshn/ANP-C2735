
public class P24 {

	public static void main(String s[]) {

		try {

		int x = 6/0;

		}

		catch(Exception e) {

		System.out.println("Exception:"+e);

		}

//		catch(ArithmeticException e1) { // here error cuz we should follow every immediate  
										// exception class
//		System.out.println("Arithmetic Exception:"+e1);

		

		}
}

//catch(ArithmeticException)
//catch(RuntimeException)
//catch(Exception)
//catch(Throwable)
//catch(Object)

