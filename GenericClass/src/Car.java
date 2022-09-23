
public class Car{

	Object obj;
	
	public Object getData(){
		return obj;
	}
	void putData(Object obj) {
		this.obj=obj;
	}
	

	public static void main(String[] args) {
		MonstorTruck mt=new MonstorTruck();
			Car car =new Car();
			car.putData(mt);
			Object obj=car.getData();
			MonstorTruck mt1=(MonstorTruck)obj;
			System.out.println(mt1);
			
			C1 c1=new C1();
			C2 c2=new C2();
			
			car.putData(c1);
			car.putData(c2);
			Object o1=car.getData();
			C1 o=(C1)o1;
			System.out.println(o);
		}
}
class MonstorTruck{

	@Override
	public String toString() {
		return " MonstorTruck ";
	}
}
class C1{
	
}
class C2{
	
}


	






