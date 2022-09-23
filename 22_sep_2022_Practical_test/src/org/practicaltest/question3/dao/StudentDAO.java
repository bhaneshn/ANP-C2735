package org.practicaltest.question3.dao;


import java.util.TreeSet;

import org.practicaltest.question1.model.Student;


public class StudentDAO {

	
		TreeSet<Student> treeSet=new TreeSet<>();
		public String addStudent(Student student) {
			
			treeSet.add(student);
			System.out.println(treeSet);
			return "Student added successfully";
		}
		
	
}
