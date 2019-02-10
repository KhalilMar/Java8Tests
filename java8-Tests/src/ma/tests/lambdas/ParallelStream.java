package ma.tests.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ParallelStream {

	public static void main(String[] args) {
		
		List<String> lst  = new ArrayList<String>();
		
		for(int i=0; i<100;i++) {
			
		 lst.add("Mounaim"+i);
		}
		long start1 = System.nanoTime();
		Optional<Integer> o = lst.stream().map(s-> s.length()).reduce((a,b) -> a+b);
		long end1 = System.nanoTime();

		System.out.println(" ---------- " + ((end1-start1)/1000000));

		long start2 = System.nanoTime();

		lst.parallelStream().map(s-> s.length()).reduce((a,b) -> a+b);
		long end2 = System.nanoTime();
		
		System.out.println(" ---------- " + ((end2-start2)/1000000));

	}

}
