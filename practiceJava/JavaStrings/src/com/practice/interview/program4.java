package com.practice.interview;

import java.util.HashMap;

public class program4 {

	public static void main(String[] args) {
		
		HashMap<Employee, String> hm = new HashMap<Employee, String>();
		hm.put(new Employee("a"), "emp1" );
		hm.put(new Employee("b"), "emp1" );
		hm.put(new Employee("a"), "emp1 overridden" );
		System.out.println(hm.size());
		System.out.println(hm.get(new Employee("a")));
	}

}
