package com.practice.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SumArrayListLauncer {

	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
		    int i = sc.nextInt();
		   arr.add(i);
		   
		}
		int l = arr.size();
		int sum = 0;
		int hold=0;
		int[] rem = new int[l];
		for(int i =0; i<l; i++) {
			hold = arr.get(i);
			for(int j=0;j<l;j++) {
				sum += arr.get(j);
				
			}
			rem[i] = sum-hold;
			sum =0;
			System.out.println(rem[i]);
			
		}
		Arrays.sort(rem);
		int min=0;
		int max =0;

		int count = rem.length;
		System.out.println("The smallest from sum is" + rem[0]);
		System.out.println("The largest is "+ rem[count-1]);
		
		
		
	}
	
//	public static find(List<>)

}
