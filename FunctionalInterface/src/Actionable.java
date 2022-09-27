
public interface Actionable {
	void calSquare();
	
	default void display() {
		System.out.println("This is greet method");
	}
	
	static String greet1() {
		return "This is greet two";
	}
}
