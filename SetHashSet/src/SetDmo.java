import java.util.HashSet;
import java.util.Set;

public class SetDmo {

	public String toString() {
		return "SetDemo";
	}
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		Set set=new HashSet();
		String s=new String("Hello"); 
		Integer i=new Integer(2);
		SetDmo setD=new SetDmo();
		hs.add(set);
		hs.add(s);
		hs.add(i);
		hs.add(setD);
		hs.add(setD);
		System.out.println(hs);
		
		
		
//		HashSet hset=new Set();// compilation error
		
	}
}
