package Org.Anudip.smp.model;

public class student {  //this is the student class
	int studentId;   // which we have abject inside of of class like instance of class
	char studentName;  // Attributes -> In attributes we set the  data types which 
	int age;           //we want with variables name

	public student() {  // --> empty constructor and the set values for accessing
		studentId = 1;
		studentName = 'R';
		age = 23;
		System.out.println("Constructor without Parameter");
	}

	public student(int id, char name, int ag) { // --> constructor with parameter
		studentId = id;
		studentName = name;
		age = ag;
		System.out.println("contructer with Parameter");
	}

	public void setStudentId(int id) {  // Encapsulation
		this.studentId = id;
	}

	public char getStudentName() {  // defining a method //parameter
		return studentName;
	}

	public void setStudentName(char Name) { // parameter with data types
		this.studentName = Name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getStudentId() {
		return studentId;
	}
}
