import java.util.Scanner;

public class A {

	

	public void sendstring(String s1, StringBuffer s2) {

		s1 = s1+s2.toString();

		s2.append(s1);

		s1 = null;

		s2 = null;

		}

		public static void main(String [] args) {

		String str = "AAA";

		StringBuffer sbr = new StringBuffer("BBB");

		new A().sendstring(str, sbr);

		System.out.print("str=" + str + " ");

		System.out.print("sbr=" +sbr);

		
		}
}
