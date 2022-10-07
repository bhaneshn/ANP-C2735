
public class P62 {

	public static void main(String[] args) {

		String str = "PQR";// here the length is 012=3 ,, march will be output

		int len = str.length();

		switch (len) {

		case 1: System.out.println("January"); break;

		case 2: System.out.println("February"); break;

		case 3: System.out.println("March"); break;

		default: System.out.println("Invalid month.");break;

		}

		}
}
