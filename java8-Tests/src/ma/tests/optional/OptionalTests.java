package ma.tests.optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalTests {

	public static void main(String[] args) {

		Optional<String> gender = Optional.of("male");
		String answer1 = "Yes";
		String answer2 = null;

		System.out.println("Non-Empty Optional:" + gender);
		System.out.println("Non-Empty Optional: Gender value : " + gender.get());
		System.out.println("Empty Optional: " + Optional.empty());

		System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
		System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(answer2));

		Optional<String> emptyOpt = Optional.ofNullable(answer2);

		try {

			System.out.println("ofNullable on Non-Empty Optional: " + emptyOpt.get());

		} catch (NoSuchElementException ex) {
			System.out.println("NoSuchElementException");

		}

		System.out.println("ofNullable on Empty Optional orElse: " + emptyOpt.orElse("NA"));
		System.out.println("ofNullable on Empty Optional orElseGet: " + emptyOpt.orElseGet(()->"NA"));


		try {
			// java.lang.NullPointerException
			System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(answer2));

		} catch (NullPointerException ex) {

			System.out.println("NullPointerException");
		}

		// map and flatmap
		
		
		System.out.println("Non-Empty Optional:: " + gender.map(String::toUpperCase));
        System.out.println("Empty Optional    :: " + emptyOpt.map(String::toUpperCase));

        Optional<Optional<String>> nonEmptyOtionalGender = Optional.of(Optional.of("male"));
        System.out.println("Optional value   :: " + nonEmptyOtionalGender);
        System.out.println("Optional.map     :: " + nonEmptyOtionalGender.map(gen -> gen.map(String::toUpperCase)));
        System.out.println("Optional.flatMap :: " + nonEmptyOtionalGender.flatMap(gen -> gen.map(String::toUpperCase)));

        
        //Filter on Optional
        System.out.println(gender.filter(g -> g.equals("MALE"))); //Optional.empty
        System.out.println(gender.filter(g -> g.equalsIgnoreCase("MALE"))); //Optional[MALE]
        System.out.println(emptyOpt.filter(g -> g.equalsIgnoreCase("MALE"))); //Optional.empty
		
		
	}

}
