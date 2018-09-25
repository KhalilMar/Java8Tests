package ma.tests.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import ma.beans.lambdas.Developer;

public class MapTest {

	public static void main(String[] args) {
		List<String> alpha = Arrays.asList("a", "b", "c", "d");

		alpha = alpha.stream().map(n -> n + "2").collect(Collectors.toList());
		
		List<Developer> devlopers = alpha.stream().map(name -> { Developer dev = new Developer(name);
		                                                          return dev;}).collect(Collectors.toList());
		
		System.out.println(devlopers);
	}
}
