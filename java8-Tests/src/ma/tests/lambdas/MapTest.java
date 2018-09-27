package ma.tests.lambdas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import ma.beans.lambdas.Developer;

public class MapTest {

	public static void main(String[] args) {
		List<String> alpha = Arrays.asList("a", "b", "c", "d");

		alpha = alpha.stream().map(n -> n + "2").collect(Collectors.toList());
		
		List<Developer> devlopers = alpha.stream().map(name -> { Developer dev = new Developer(name);
		                                                          return dev;}).collect(Collectors.toList());
		
		System.out.println(devlopers);
		
		Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("a", 6);
        unsortMap.put("c", 20);
        unsortMap.put("d", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("n", 99);
        unsortMap.put("g", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 9);
		 // sort by keys, a,b,c..., and return a new LinkedHashMap
        // toMap() will returns HashMap by default, we need LinkedHashMap to keep the order.
        //
        
        //************** (oldValue, newValue) -> oldValue if not specified the code will throw an error if there is a duplicate key
        Map<String, Integer> result = unsortMap.entrySet().stream()
        .sorted(Map.Entry.comparingByKey())
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        
        System.out.println("Sorted...");
        System.out.println(result);
	}
}
