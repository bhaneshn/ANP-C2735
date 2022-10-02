
public class Prac7 {

	public static void main(String args[]) {

		int x,y;

		skip:

		for(x=2; x<4; x++) {

		System.out.println(x + " ");

		for(y=0; y<6;y++) {

		System.out.println(y + " ");

		if (x==y) {

		continue skip;

		}

		}
		}
		}
}
