import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapCollectDemo {

	
	public static void main(String[] args) {
		List<String> cityList=Arrays.asList("Nagpur","Pune","Nashik");
		
		Stream<String> cityListName=cityList.stream();
		
		Stream<Integer> cityNameLength=cityListName.map(str->str.length());
		
		List<Integer> cityLengthList=cityNameLength.collect(Collectors.toList());
		System.out.println(cityLengthList);
		
		//REDUCE  METHOD
		
		System.out.println();
		Stream<Integer> intStream=Stream.of(2,2,2);
		Optional<Integer> op=intStream.reduce((a,b)->a*b);
//		Optional<Integer> op1=intStream.reduce((a,b)->a+b); this will get exception
		System.out.println(op.get());
//		System.out.println(op1.get());
	}
}
