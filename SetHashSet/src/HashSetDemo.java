import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

import org.model.Student;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> obj=new HashSet<String>();
		TreeSet<String> obj1=new TreeSet<String>();
		obj.add("C++");
		obj.add("Java");
		obj.add("Python");
		obj.add("Python");// it cannot call again same value
		
		System.out.println(obj);// this is not in sorted manner
		
		obj1.add("B");
		obj1.add("A");
		obj1.add("C");
		obj1.add("C");//it cannot call again same value
		
		
		System.out.println(obj1);//this is in sorted manner
		
		Iterator<String> it=obj1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+"---iterate");
		}
		LinkedList<String> ll=new LinkedList<String>();
		
		
		ll.add("b");
		ll.add("a");
		ll.add("a");
		ll.add("f");
		ll.add("f");
		ll.add("F");
		ll.addFirst("bhanesh");// addFirst method
		System.out.println(ll);
		
		ArrayList<String> array=new ArrayList<String>();
		array.add("b");
		array.add("a");
		array.add("a");
		array.add("f");
		array.add("f");
		array.add(1,"A");//index position method
		array.add("A");
		array.add("1");
		ll.addFirst("bhanesh");//not possible here
		System.out.println(array);
		
		LinkedList<Student> ll1=new LinkedList<Student>();
		Student sObj=new Student(1,"hjsx");
		ll1.add(sObj);
		System.out.println(ll1);
		
	}
}
