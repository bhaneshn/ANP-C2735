
public class FullTimeEmployee extends Employee {
	
	int id ;
	FullTimeEmployee(int id){
		
		super(50);// this SUPER key is refers to parent object
		System.out.println(super.id);
		System.out.println(this.id);//THIS keyword is refers to current object
		System.out.println(id);
	}

}
