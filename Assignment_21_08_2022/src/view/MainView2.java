package view;
import service.IncreasingNumber;
public class MainView2 {

	public static void main(String[]args) {
		IncreasingNumber increNum=new IncreasingNumber();
		System.out.println(increNum.checkNumber(20));
	}
}
