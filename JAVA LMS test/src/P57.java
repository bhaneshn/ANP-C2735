
public class P57 {

	public static void main(String args[]){

		int z=3;

		for(int i=0; i<2;i++) {

		z++;

		switch(z) {

		case 3: System.out.print(z=z+1);

		case 5: System.out.print(z=z+2 );

		break;

		default : System.out.print(z=z+8 );

		case 6: System.out.print( z=z+4 );

		}

		z--;

		}

		

		}
}
