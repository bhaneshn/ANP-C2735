
public class P14 {

	public Integer val;

	public void fun1() {

	Integer grade1 = new Integer(25);

	val = grade1;

	fun2(grade1);

	}

	private void fun2(Integer grade2) {

	grade2 = grade2 .intValue();

	if(grade2==val) {

	System.out.println("equal");

	}

//	Else {  here { (else) is (Else) } always check line by line code before executing

	System.out.println("not equal");

	}

	

	public static void main(String ar[]) {

	P14 c=new P14();

	c.fun1();

	}
}
