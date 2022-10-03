import java.util.Optional;
import java.util.stream.Stream;

public class MinMaxDemo {

	public static void main(String[] args) {
		Stream<Integer> intStream=Stream.of(23,14,55,96,77);
		Optional<Integer> opMax=intStream.max(Integer::compare);
		System.out.println(opMax.get());
		
		Stream<Integer> intStream1=Stream.of(23,34,55,46,77);
		Optional<Integer> opMin=intStream1.min(Integer::compare);
		System.out.println(opMin.get());
	}

}
