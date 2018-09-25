package ma.tests.lambdas;

import java.util.HashMap;
import java.util.Map;

import ma.beans.lambdas.Developer;

public class ForEachTests {

	private static Map<Integer,Developer> getDevelopers() {

		Map<Integer,Developer> result = new HashMap<Integer,Developer>();

		result.put(1,new Developer("mkyong"));
		result.put(2,new Developer("alvin"));
		result.put(3,new Developer("jason"));
		result.put(4,new Developer("iris"));

		return result;

	}
	public static void main(String[] args) {
		
		// old
		Map<Integer,Developer> result = getDevelopers();
		
		
		for (Integer devId : result.keySet()) {
			System.out.println(result.get(devId));
		}
		 
		// lambdas
		System.out.println("*************** Lambdas Starts");
		result.forEach((k,v)-> System.out.println(v));

	}
}
