
public class P60 {
	public static void main(String args[]) {

		Object obj =new int[] { 10, 20, 30 }; //1

		int[] array = (int[])obj; //2

		for (int i: array) //3

		System.out.print(i +" ");

		}
}
