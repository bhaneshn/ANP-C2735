
public class P40 {

	public static void main(String args[]) {

		int input, result;

		try{

		input= 5;

		result= input/0;

		System.out.println(result);

		}catch (ArithmeticException a) {

		a.printStackTrace();

		}

		catch (Exception e) {

		e.printStackTrace();

		}

		finally {

		System.out.println("Arithmetic Exception / 0");

		}

		}
}
