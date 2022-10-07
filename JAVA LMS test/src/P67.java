
public class P67 {

	public int tester(String str) {

		if(str == null || str.length() == 0) {

		System.out.println("empty");

		return 0;

		}

		else {      // but here it was .. Else 

		System.out.println("not empty");

		return 1;

		}

		}

		public static void main(String ar[]) {

		P67 ob = new P67();

		ob.tester("hi");

		ob.tester("");

		}
}
