
public class P44 {
	void get ( ) throws ArrayIndexOutOfBoundsException {

		int k[]= { 5, 7, 6, 2 , 8};

		for ( int x=0; x<k.length; x++) {

		System.out.print(k[2] + " ");
		

		}

		}

		}

		class Rose extends P44{
			public static void main(String args[]) {

				try{

				P44 r= new Rose();

				r.get();

				} catch (IndexOutOfBoundsException ie) {

				throw new IndexOutOfBoundsException ();

				}

				System.out.print(" Statement Out of the try block");

				

				}
	
}
