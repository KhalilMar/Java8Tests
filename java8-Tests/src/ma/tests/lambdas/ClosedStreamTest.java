package ma.tests.lambdas;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ClosedStreamTest {

	public static void main(String[] args) {

		String[] array = { "a", "b", "c", "d", "e" };
		Stream<String> stream = Arrays.stream(array);

		// loop a stream
		stream.forEach(x -> System.out.println(x));

		// reuse it to filter again! throws IllegalStateException
		try {
			long count = stream.filter(x -> "b".equals(x)).count();
			System.out.println(count);

		} catch (IllegalStateException ex) {
			System.out.println("Stream already closed !");

		}

		// use Supplier

		Supplier<Stream<String>> streamSupplier = () -> Stream.of(array);

		// get new stream
		streamSupplier.get().forEach(x -> System.out.println(x));

		// get another new stream
		long count = streamSupplier.get().filter(x -> "b".equals(x)).count();
		System.out.println(count);

	}

}
