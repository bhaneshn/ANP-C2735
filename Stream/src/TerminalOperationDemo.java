import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TerminalOperationDemo {

	public static void main(String[] args) {
		List<Integer> intList=Arrays.asList(20,35,56,78);
		
		Stream<Integer> intStream=intList.stream();
		
		intStream.forEach(num->System.out.println(num));
//  intStream.forEach(num->System.out.println(num));.we can use only one forEach
		System.out.println();
		intList.stream().forEach(num->System.out.println(num));
		
		// this is work with accept method and its parameter
	}
}
