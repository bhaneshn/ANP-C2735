package example.view;
import example.service.Addition;
public class Main {
	public static void main(String[]args) {
		
		Addition addObj = new Addition();
		System.out.println(addObj.add(5));
		System.out.println(addObj.add(10,10.5));
		System.out.println(addObj.add(5,5));
	}
}
