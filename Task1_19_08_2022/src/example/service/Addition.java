package example.service;

public class Addition {
	
	public int add(int a) {
		int b=++a;
		return b;
	}
	 public int add(int a,double b) {
		 int c=(int)(a+b);
		 return c;
	 }
	public  int add(int a,int b) {
		 int c=a+b;
		 return c;
	 }
}
