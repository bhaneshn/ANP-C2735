package org.dao;

import java.util.HashSet;

import org.model.Student;

public class StudentDAO {

	static HashSet<Student> hashSet=new HashSet<Student>();
	
	public static void addStudentDetails(Student student) {
		hashSet.add(student);
		System.out.println(hashSet);
	}
	
	public HashSet<Student> getStudentDetails(){
		return hashSet;
	}
}
