
public class SwitchCase {

	public static void main(String[] args) {
	
		int menuInput=1;
		switch(menuInput) {
		
		case 1:
			System.out.println("Start method called");
			break;
		case 2:
			System.out.println("displayInstruction method called");
			break;
		case 3:
			System.out.println("Exit method called");
			break;
		default:
			System.out.println("Invalid Input");
		}
	}
}
