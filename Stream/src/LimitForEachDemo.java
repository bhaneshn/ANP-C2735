import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LimitForEachDemo {

	public static void main(String[] args) {
		Stream<String> stringList1=Stream.of("A","B","B","C");
		stringList1.limit(2).forEach(System.out::println);
//		stringList1.limit(3).forEach(System.out::println);
	}
}
