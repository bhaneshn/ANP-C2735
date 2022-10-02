
public class P37 {

	void process() throws Exception { throw new Exception(); }

	public static void main(String[] args) {

	new B().process();

	}

	static class B extends P37 {

	void process() { System.out.println("B"); }

	}
	
}
