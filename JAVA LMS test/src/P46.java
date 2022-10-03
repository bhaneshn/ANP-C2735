import java.util.Scanner;

public class P46 {
	public static void main(String str[]) {

		String s="test1,test2,test3";

		Scanner scan=new Scanner(s).useDelimiter("test");

		System.out.print(scan.next());

		System.out.print(scan.next());

		System.out.print(scan.next());

		scan.close();

		}
	
// the use of (useDelimiter)is remove test word only which are existing in bracket 
}
