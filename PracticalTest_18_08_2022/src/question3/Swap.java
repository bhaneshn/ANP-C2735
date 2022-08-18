package question3;

public class Swap {
	
	 public static void main(String[]args) {
		int a=50;
		int b=100;
		System.out.println("value is a:"+a);
		System.out.println("value is b:" +b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value is a:"+a);
		System.out.println("value is b:" +b);
		
	 }
}
