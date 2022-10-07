
public class P71 {

	public static void main(String arg[]) {

		String str1 = "Kogent 1. Kogent 2. Kogent 3.";

		String str2[]=str1.split("\\.\\s*");

		for(int i=0;i<str2.length;i++)

		System.out.print(str2[i]+" ");

		}
}
