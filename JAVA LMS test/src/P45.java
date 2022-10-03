
public class P45 {

	public static void main(String args[]) {

		String str;

		String s;

		String s1 = new String("i");

		String s2 = new String("j");

		String s3 = new String("k");

		str = s2;

		s2 = null;//1

		str = s1 + s2 + s3;//2

		s1 = null;//3

		str = null;//4

		s3 = null;//6

		}
}
