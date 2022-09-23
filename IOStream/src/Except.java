import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

//import java.io.File;

public class Except {

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
