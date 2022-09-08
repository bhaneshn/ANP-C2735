package question3;

public class Main {
	static int dcount=0;
	static int ugcount=0;
	static int pgcount=0;
	public static void countObject(Degree...object) {
		for(Degree obj:object) {
			if(obj instanceof UnderGraduate) {
				ugcount++;
				
			}else if
			(obj instanceof PostGraduate) {
				pgcount++;
			}else if 
				(obj instanceof Degree) {
				dcount++;
			}
		}
		System.out.println("The Number of UG object : "+ugcount);
		System.out.println("The Number of PG object : "+pgcount);
		System.out.println("The Number of Degree object : "+dcount);//here we are calling the count of objects
		}
		
	public static void main(String[] args) {
		Degree deg=new Degree();
		UnderGraduate ug=new UnderGraduate();
		PostGraduate pg=new PostGraduate();
		Degree deg1=new Degree();
		UnderGraduate ug1=new UnderGraduate();
		PostGraduate pg1=new PostGraduate();
		Degree degree=new Degree();
		
		countObject(deg,ug,pg,deg1,ug1,pg1,degree);// here we are invoking the count of objects
		
		
		
	}
}
