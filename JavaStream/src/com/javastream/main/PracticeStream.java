package com.javastream.main;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PracticeStream {

	public static void main(String[] args) {

		
		List<Integer> nums = Arrays.asList(7,5,9,6,8,4);
		
//		Predicate<Integer> predi = n ->  n%2==1;
		
		
		int results = nums.stream()
//				.map(n->n*2)
				.filter(n-> n%2 == 1)
				.sorted()
				.map(n->n * 2)
				.reduce(0,(c,e)->c+e);
				//.forEach(n-> System.out.println(n));
		
		System.out.println(results);

	}

}
