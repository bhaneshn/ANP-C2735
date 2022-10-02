import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class P31 {

	public static void main(String[] args) {

		NavigableSet <Integer> ns = new TreeSet<Integer>();

		ns.add(10);

		ns.add(15);
		
		ns.add(7);

		Iterator descendingIterator = ns.descendingIterator();

		if(descendingIterator.hasNext()) {  
			
// here we always use while loop for iterator if we use (if )
// then it will print only bigger value like 15			
		System.out.println(descendingIterator.next());

		}

		}
}

//while(descendingIterator.hasNext()) {
//
//	System.out.println(descendingIterator.next());
//
// but here we will print 15,10,7
//	}