
public class P53 {

	static int j;

	public int arr() {

	int y[] = { 5 , 7, 8 , 6};

	j = y[2]; 
	
	return j;

	}

	public static void main (String args[]) {

	P53 r=new P53();

	int x = r.arr( );

	System.out.println(x);

	switch(x) {

	case 0: System.out.print(0 + " ");break;

	case 2: System.out.print(2 + " ");break;

	case 8: System.out.print(8 +" " );  // here break is not present so thats why
								// out will be 8   8 5
	case 5: System.out.print(5 + " ");break;

	default: System.out.print("Default");

	}

	}
}
