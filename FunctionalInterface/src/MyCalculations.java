
public class MyCalculations implements Calculations {

	public int calSquare(int x) {
		return x*x;
	}
	public static void main(String[] args) {
		
		MyCalculations cal=new MyCalculations();
		int square=cal.calSquare(5);
		System.out.println(square);
		
		cal.display();
		System.out.println(Calculations.greet1());
		
		Calculations myCal = new MyCalculations(); 
		System.out.println(myCal.calSquare(4));
	}
}
