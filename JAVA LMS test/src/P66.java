import java.util.Scanner;

public class P66 {


		public static void main(String str[]) {

		String scn="Sun,Mon,Tues,Wed,Thurs,Fri,Sat";

		Scanner scan=new Scanner(scn);

		scan.useDelimiter(",");

		while(scan.hasNext()) {

		System.out.println(scan.nextInt()+" ");


	// here we need to use (nextLine) thats why runtime exception has created 
		
		}
	}


}
