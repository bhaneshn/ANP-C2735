
public class Addition {
	int a;
	int b;
	
	public Addition(int A,int B) {
		a=A;
		b=B;
	}
	
	public int addMethod() { //this is method to return and call
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition Obj=new Addition(2,3);
		System.out.println(Obj.addMethod());
	}

}
