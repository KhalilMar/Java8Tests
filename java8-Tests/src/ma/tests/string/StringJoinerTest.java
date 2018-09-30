package ma.tests.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

import ma.beans.lambdas.Developer;

public class StringJoinerTest {

	public static void main(String[] args) {

		StringJoiner sj = new StringJoiner(",");
		sj.add("aaa");
		sj.add("bbb");
		sj.add("ccc");
		String result = sj.toString(); // aaa,bbb,ccc
		System.out.println(result);

		sj = new StringJoiner("/", "prefix-", "-suffix");
		sj.add("2016");
		sj.add("02");
		sj.add("26");
		result = sj.toString(); // prefix-2016/02/26-suffix
		System.out.println(result);
  
		// 2015-10-31
		System.out.println(String.join("-", "2015", "10", "31"));

		List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");
		// java, python, nodejs, ruby
		System.out.println(String.join(", ", list));

		// java | python | nodejs | ruby
		System.out.println(list.stream().map(x -> x).collect(Collectors.joining(" | ")));

		List<Developer> listDeveloper = new ArrayList<Developer>();

		listDeveloper.add(new Developer("mkyong"));
		listDeveloper.add(new Developer("alvin"));
		listDeveloper.add(new Developer("jason"));
		listDeveloper.add(new Developer("iris"));

		result = listDeveloper.stream().map(x -> x.getName()).collect(Collectors.joining(", ", "{", "}"));

		System.out.println(result);

	}
}
