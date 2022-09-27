
public class Prac4 {

	protected void get(char x ) {

		switch(x){

		case 88: System.out.println( "X");break;

		case 90: System.out.println( "Z");break;

		case 89: System.out.println( "Y");break;

		default: System.out.println( 0);break;

		case 97: System.out.println("a");break;// (-)getting error

		}

		
		}

		public static void main(String[] args) {

		Prac4 r = new Prac4();

		r.get('X');

		}

}
