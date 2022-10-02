
public class P43 {

	public void get(int k, int l, int m) {

		assert ( k > l && k > m) : " its ok";

		System.out.println(" Its assertion");

		}

		public static void main(String[] args) {

		P43 r = new P43();

		r.get(10, 20, 5);

		}

		
}
