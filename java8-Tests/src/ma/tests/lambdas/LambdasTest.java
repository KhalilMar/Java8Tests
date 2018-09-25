package ma.tests.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ma.beans.lambdas.Developer;

public class LambdasTest {

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong"));
		result.add(new Developer("alvin"));
		result.add(new Developer("jason"));
		result.add(new Developer("iris"));

		return result;

	}

	public static void main(String[] args) {


		List<Developer> listDev;

		// Comparator with lambdas

		listDev = getDevelopers();
		listDev.sort((arg0, arg1) -> {
			return arg0.getName().compareTo(arg1.getName());
		});
		System.out.println(listDev);

		// old Comparator

		Comparator<Developer> oldComparator = new Comparator<Developer>() {

			@Override
			public int compare(Developer arg0, Developer arg1) {

				return arg0.getName().compareTo(arg1.getName());
			}
		};

		listDev = getDevelopers();
		Collections.sort(listDev, oldComparator);
		System.out.println(listDev);
		
		List result = listDev.stream().filter(line -> !"mkyong".equals(line.getName())).
				        collect(Collectors.toList());
		result.forEach(System.out::println);

		Developer mkyong = listDev.stream().filter(line -> !"mkyong".equals(line.getName())).findAny().orElse(new Developer("NA"));
		System.out.println(mkyong.getName());
		
		List resultmap = listDev.stream().map(x -> "AA" +x.getName()).collect(Collectors.toList());
		resultmap.forEach(System.out::println);

	}
}
