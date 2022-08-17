
public class SwitchCase {
	
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
		SwitchCase SwiObj=new SwitchCase();
		int menuInput=3;
		if(menuInput==1) {
			SwiObj.start();
		}else if(menuInput==2) {
			SwiObj.displayIncrement();
		}
		else if(menuInput==3) {
			SwiObj.exit();
		}
		else {
			System.out.println("Your input value is wrong");
		}

	}
	

}
