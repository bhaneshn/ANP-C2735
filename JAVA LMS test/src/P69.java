
public class P69 {

	public static void main(String arg[]) {

		String str1 = "x2y4x5y";

		String str2[]=str1.split("\\d");// this \\d is splits the number 

		for(int i=0;i<str2.length;i++)

		System.out.print(str2[i]+" ");

		}

		
}
