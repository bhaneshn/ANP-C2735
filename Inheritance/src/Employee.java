
public class Employee {
		int id;
		String name;
		
		Employee(int id){
			this("Bhanesh");
			this.id=id;
		}
		Employee(String name){
			System.out.println("Employee:String");
		}
		int display(int id) {
			return this.id;
//			System.out.println(id);
		}
		
}
