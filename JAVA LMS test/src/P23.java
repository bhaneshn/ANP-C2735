import java.util.ArrayList;
import java.util.List;

public class P23 {

	public static void main(String[] args) {

		List<String> student = new ArrayList<String>();

		student.add("Vikash");

		student.add("Suchita");

		String name = "Deepak";

		Object student1 = new String("Shivam");// here we should write String instead of Object class

		student.add(name);

//		student.add(student1); //  here add get error because Object class
//		                           is not a String class

		

		}
}
