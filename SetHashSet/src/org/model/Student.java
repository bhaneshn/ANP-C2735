package org.model;

import java.util.Objects;

public class Student implements Comparable<Student>{

	private int studentId;
	private String studentName;
	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(studentId, studentName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return studentId == other.studentId && Objects.equals(studentName, other.studentName);
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
	public int compareTo(Student stu) {
		int val=0;
		if(this.studentId==stu.studentId)
			val=0;
		else
			val=this.studentId>stu.studentId?1:-1;//ternary operator
		
		return val;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	
}
