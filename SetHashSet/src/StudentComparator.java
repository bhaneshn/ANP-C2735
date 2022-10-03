import java.util.Comparator;

import org.model.Student;

public class StudentComparator implements Comparator<Student>{
	
	public int compare(Student stu1,Student stu2) {
		String s1=stu1.getStudentName();
		String s2=stu2.getStudentName();
		return s1.compareTo(s2);
//		return stu1.getStudentName().compareTo(stu2.getStudentName());
	}

}
