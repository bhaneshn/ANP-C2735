
public class P54 {
	public enum Cars {ferari, maruti, omni};

	public static void main(String [] args) {

	Cars mycar = Cars.ferari;

	switch (mycar) {

	case ferari:

	System.out.print("ferari ");

//	default case:     // here error because default doesn't use case 

	System.out.print("mercedez ");

	case maruti:

	System.out.print("maruti ");

	}

	}
	
}
