package example.sub;
import example.base.Car;
public class FunCar extends Car {
	
	public FunCar() { //doubt
		super();
		System.out.println(super.getColor());
		System.out.println(super.getBody());
		
	}
	
	public FunCar(String Color,String Body) {
		super.getColor();
		super.getBody();
	}
	
	 public void playCD() { //doubt for return  statement is correct or not..
		System.out.println("Beautiful music is played");
	}
}
