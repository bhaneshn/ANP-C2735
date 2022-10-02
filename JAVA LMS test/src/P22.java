
public class P22 {

	public void arr() {

		try{

		int y= 5, j=0;

		System.out.print(y=y/0 );

		}catch(Exception e)

		{

		e.printStackTrace();

		}

		System.out.print("Hi" ); // if we will remove this statement error will not found

//		finally{       here finally got error

		System.out.print("Hi");

		}

//		}

		public static void main (String args[])

		{

		P22 r=new P22();

		r.arr( );

		}
}
