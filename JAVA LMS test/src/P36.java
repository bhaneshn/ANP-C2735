
public class P36 {

	public void arr() {

		try{

		int y= 5, j=0;

		System.out.println(y=y/0);

		}catch(Exception e)

		{

		e.printStackTrace();

//		}catch(ArithmeticException ae) error because this is not immediate superclass

		{

		ae.printStackTrace();

		}finally{

		System.out.println("Hi");

		}

		}

		public static void main (String args[]) {

		P r=new P36();

		r.arr( );

		}
}
