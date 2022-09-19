package view;
import service.CheckPower;
public class MainView3 {

	public static void main(String[]args) {
		CheckPower Obj=new CheckPower();
		int n=16;
		
		if(Obj.checkNumber(n)) {
			System.out.println(n+" is power of two ");
		}
		else {
			System.out.println(n+" is not ");
		}
	}
}
