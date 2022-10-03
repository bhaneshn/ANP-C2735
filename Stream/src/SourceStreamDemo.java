import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
public class SourceStreamDemo {
public static void main(String[] args) {
	
	Stream<Integer> intStream1=Stream.of(1,2,3,4,5);
	
	Stream<String> stringStream=Stream.of("A","C","B");
	System.out.println(stringStream);
	Integer intArray[]= {25,34,56,35};
	Stream<Integer> intStream2=Arrays.stream(intArray);
	
	List<String> stringList=new LinkedList<>();
	stringList.add("AAA");
	stringList.add("BBB");
	
	Stream<String> stringStream2=stringList.stream();
	}
}
