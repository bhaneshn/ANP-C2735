import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterandForEachDemo {

	public static void main(String[] args) {
		List<Integer> intList=Arrays.asList(20,35,56,78);
		System.out.println("printing the value greater than 50");
		System.out.println();
		Stream<Integer> intStream=intList.stream();
		Stream<Integer> filterStream=intStream.filter(num->num>50);
		
		filterStream.forEach(n->System.out.println(n));
		System.out.println();
		intList.stream().filter(num->num>50).forEach(System.out::println);

		
		// this is work with test method and its parameter
		
		List<String> stringList1=Arrays.asList("A","B","B");
		Stream<String> stringStream=stringList1.stream();
		Stream<String> stream1=stringStream.distinct();
		stream1.forEach(n->System.out.println(n));
		System.out.println();
		Stream<Integer> intStream3=Stream.of(2,3,4,5,3);
		Stream<Integer> distStream=intStream3.distinct();
		distStream.forEach(n->System.out.println(n));
		
//		distint method doesnt show double value
	}
}
