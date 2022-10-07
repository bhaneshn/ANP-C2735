import java.util.Scanner;

public class P72 {

	public static void main(String s[]) {

		String str="shalini,22,student";

		Scanner sc = new Scanner(str);

		sc.useDelimiter(",");

		System.out.print(sc.next()+" ");// next only print shalini if we want to print all statement use nextLine

		}
}
