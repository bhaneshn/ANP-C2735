
public class IfCase {
	
	void start() {
		System.out.println("Start method called");
	}
	void displayIncrement() {
		System.out.println("displayIncrement method called");
	}
	void exit() {
		System.out.println("exit method called");
	}
	public static void main(String[] args) {
		IfCase ifObj=new IfCase();
		int menuInput=3;
		if(menuInput==1) {
			ifObj.start();
		}else if(menuInput==2) {
			ifObj.displayIncrement();
		}
		else if(menuInput==3) {
			ifObj.exit();
		}
		else {
			System.out.println("Your input value is wrong");
		}

	}
	

}
