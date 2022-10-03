import java.util.TreeSet;

import org.model.Student;

public class CollectionDemo {

	public static void main(String[] args) {
		TreeSet<Student> set=new TreeSet<Student>();
		set.add(new Student(2,"a"));
		set.add(new Student(3,"b"));
		set.add(new Student(1,"c"));
		System.out.println(set);
	}
}
