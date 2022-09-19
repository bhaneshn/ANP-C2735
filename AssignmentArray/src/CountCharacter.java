
public class CountCharacter {

	public static void countChar(String s) {
		int count=0;
		System.out.println();
		for(int i=0;i<s.length();i++) {
				count++;
			}
		}
	
	
	public static void main(String[] args) {
		String s= "Programming language";
		CountCharacter.countChar(s);
	}
}
