package org.practicaltest.question3.service;

import org.practicaltest.question1.model.Student;
import org.practicaltest.question3.dao.StudentDAO;

public class StudentService {

	static StudentDAO studentDAO=new StudentDAO();
	public static String addStudent(Student student) {
		
		return studentDAO.addStudent(student);
	}
}
