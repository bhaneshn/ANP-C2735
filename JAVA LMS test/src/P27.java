import java.util.ArrayList;
import java.util.List;

public class P27 {

	public static void main(String[] args) {

		boolean bool [] = new boolean[5];

		List s = new ArrayList<String>();

		bool[0] = s.add("a");

		bool[1] = s.add(new Integer(22));

		bool[2] = s.add("b");

		bool[3] = s.add("a");

		bool[4] = s.add(new Object());

		for(int i = 0; i<bool.length;i++)

		System.out.print(bool[i] + " ");

		}
}
