
public class P38 {

	public void process() { 
		
		System.out.print("A "); 
		
	}

	public static void main(String[] args) {

	try { 
		((P38)new B()).process();
		
	}

	catch (Exception e) { 
		System.out.print("Exception "); 
		}

	}

	}

	class B extends P38 {

	public void process() throws RuntimeException

	{

	super.process();

	if (true) throw new RuntimeException();{
		
	

	System.out.print("B");
	}

	}
}
