import java.text.NumberFormat;

public class B {
	public static void main(String[] args){
		B b = new Derived();
		System.out.println(b.getValue());
		}
	
	int value = 0;
	B(){
	addValue();
	}
	void addValue(){
	value += 10;
	}
	int getValue(){
	return value;
	}
	}
	class Derived extends B{
	Derived(){
	addValue();
	}
	void addValue(){
	value += 20;
	}
	}
//	public class Test{
//	
//	
//	}
