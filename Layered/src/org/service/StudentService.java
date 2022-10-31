package org.service;

import java.util.HashSet;

import org.dao.StudentDAO;
import org.model.Student;

public class StudentService {

	static StudentDAO studentDAO=new StudentDAO();
	public static void addStudentDetails(Student student) {
		StudentDAO.addStudentDetails(student);
		
	}
	public  HashSet<Student> getStudentDetails(){
		return studentDAO.getStudentDetails();
	}
}
