
public class P68 {

	public static void meth(String str) {

		int check = 4;

		if (check == str.length()) {

		System.out.print(str.charAt(check -= 1) +", ");

		} else {

		System.out.print(str.charAt(0) + ", ");

		}

		}

		public static void main(String ar[]) {

		meth("funky");// meth (str is passing ) 

		meth("tangy");

		meth("rocky");

		}
}
