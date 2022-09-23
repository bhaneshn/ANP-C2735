import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo {

	public static void main(String[] args) {
		 Pattern patternObj=Pattern.compile(".e");
//		 Matcher matcherObj=patternObj.matcher("he");
		 Matcher matcherObj=patternObj.matcher("hee");
		 boolean result=matcherObj.matches();
		 System.out.println(result);
		 
	}
}
