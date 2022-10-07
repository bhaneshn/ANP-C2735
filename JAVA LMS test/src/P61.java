
public class P61 {

	public void sendstring(String s1, StringBuffer s2) {

		s1 = s1+s2.toString();

		s2.append(s1);

		s1 = null;

		s2 = null;

		}

		public static void main(String [] args) {

		String str = "AAA";

		StringBuffer sbr = new StringBuffer("BBB");

		new P61().sendstring(str, sbr);

		System.out.print("str=" + str + " ");

		System.out.print("sbr=" +sbr);

		}
}
