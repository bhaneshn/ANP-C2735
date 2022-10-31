package org.model;

import java.time.LocalDate;
import java.util.Objects;

public class Student {

	private int studentId;
	private String studentName;
	private Gender gender;
	private LocalDate dob;
	public Student() {
		super();
		
	}
	public Student(int studentId, int id, String studentName, Gender gender, LocalDate dob) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.gender = gender;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", gender=" + gender + ", dob=" + dob
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dob, gender, studentId, studentName);
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
		return Objects.equals(dob, other.dob) && gender == other.gender && studentId == other.studentId
				&& Objects.equals(studentName, other.studentName);
	}
	
	
}
