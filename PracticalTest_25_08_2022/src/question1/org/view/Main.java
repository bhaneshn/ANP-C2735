package question1.org.view;
import java.util.Scanner;
import question1.org.service.ArrayService;
public class Main {
	
public static void main(String[] args) {
	
	ArrayService arrSer=new ArrayService();
	Scanner sc=new Scanner(System.in);
	int[]arr1=new int[5];
	System.out.println("Enter five integer values for calculating Average");
	for(int i=0;i<5;i++) {
		arr1[i]=sc.nextInt();
	}
	System.out.println("Your average value is : "+ArrayService.calculateAverage(arr1));
	
	
	
	
	
}
}
