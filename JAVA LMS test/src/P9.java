
public class P9 {

	
	public long doMethod(long a){ return a*10; }
	//1 if we use int instead of long then it will raise compile error
	public int doMethod(int a){ return a*3; } //2

	public static void main(String[] args) {

	long i = 0;
	int x=0;

	i = new P9().doMethod(5);

	x=new P9().doMethod(10);
	System.out.println( i );
	System.out.println( x);

	

	}
}
