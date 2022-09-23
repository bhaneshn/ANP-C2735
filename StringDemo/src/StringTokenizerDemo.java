
import java.util.StringTokenizer;

public class StringTokenizerDemo {
	


public static void main(String[]args) {
	StringTokenizer st = new StringTokenizer("welcome to;the; java",";");
	while(st.hasMoreTokens()) {
		String s=st.nextToken();
		System.out.println(s);
		
	}
}


}




