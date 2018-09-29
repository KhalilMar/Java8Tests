package ma.tests.random;

import java.util.Random;

public class RandomInts {

	public static void main(String[] args) {
	
		
		int min = 4;
		int max= 39;
		Random r = new Random();
		
		int randomInt = r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();
		System.out.println(randomInt);

		r.ints(3, min, max+1).forEach(System.out::println);
	}

}
