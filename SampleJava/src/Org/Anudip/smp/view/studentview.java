package Org.Anudip.smp.view;
import Org.Anudip.smp.model.student;
public class studentview {
	
	
	
     public static void main(String []arg) {  //this is main class
	
	
	   student studentObj1=new student(); // this is the object of student class
	
	   student studentObj2=new student(2,'H',24);
	
		char name = studentObj2.getStudentName();// calling method // arguments
	System.out.println("studentObj2 "+ name);
	
	System.out.println("studentObj1 name "+studentObj1.getStudentName());
	
	studentObj2.setStudentName('c');
	
	name=studentObj2.getStudentName();// calling method // arguments
	System.out.println("studentObj2 "+name);
	
		int ag=studentObj2.getAge();
		System.out.println("studentObj2 "+ ag);
		
	studentObj2.setAge(35);    // for Age
	
	ag = studentObj2.getAge();
	System.out.println("studentObj2 "+ag);
	
	int id=studentObj2.getStudentId();
	System.out.println("studentObj2 : "+ id);
	
	System.out.println("studentObj1: "+ studentObj1.getStudentId());
	
		
		
	
	
	
}
}
