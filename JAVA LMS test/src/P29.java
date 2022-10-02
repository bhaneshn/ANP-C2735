import java.util.ArrayList;

public class P29  {
	public void addmore(ArrayList l1) {

		l1.add("We");

		}

		public static void main(String[] args) {

		ArrayList <String>als = new ArrayList<String>();

		als.add("I");

		als.add("You");

		P29 obj = new P29( );

		obj.addmore(als);  // this line print "we"

		System.out.println(als);

		}
}
