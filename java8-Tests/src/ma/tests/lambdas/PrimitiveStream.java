package ma.tests.lambdas;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * This class presents some examples for working with Streams for primitive types (int, long, double..)
 * @author macbookpro
 *
 */
public class PrimitiveStream {

	public static void main(String[] args) {
		// here we initialize a stream of ints between 0 and 10 exclusive
		// and then write each to the console
		IntStream.range(0, 10).
		forEach(System.out::println);
		
		System.out.println("-----------------------------------------------------");
		
		//here we initialize the same stream, apply a mapping function to it , and then write
		// everything to the console
		IntStream.range(0,10).
		map(n->2*n).
		forEach(System.out::println);
		
		System.out.println("-----------------------------------------------------");
		
		//here we initialize an int stream, apply a mapping function, then an aggregating function,
		//then displaying the result
		
		IntStream.range(0,5).
		map(n->2*n).
		average().
		ifPresent(System.out::println);
		
		System.out.println("-----------------------------------------------------");

		//here we initialize an int stream, apply a mapping function to a different object, then
		//display the result
		
		IntStream.
		rangeClosed(0, 4).mapToObj(i -> "Hello : " + i).
		forEach(System.out::println);

		System.out.println("-----------------------------------------------------");

		Stream.of("d2", "a2", "b1", "b3", "c")
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .anyMatch(s -> {
	        System.out.println("anyMatch: " + s);
	        return s.startsWith("A");
	    });
	}

}
