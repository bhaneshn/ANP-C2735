import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

import org.model.Student;

public class SortingDemo {
public static void main(String[] args) {
	Student[]studentArray = {new Student(1,"AB"),new Student(2,"BD")};
	Arrays.sort(studentArray);
	for(Student s:studentArray) {
		System.out.println(s);
	}
	
	LinkedList<Student> list=new LinkedList<Student>();
	list.add(new Student(1,"Ab"));
	list.add(new Student(3,"Bc"));
	list.add(new Student(2,"Cb"));
	
	Collections.sort(list);
	System.out.println(list);
	
	StudentComparator sc=new StudentComparator();
	Collections.sort(list,sc);
//	Collections.sort(list,new StudentComparator());
	System.out.println(list);
	
	
}
}
