package com.java.practice;

import java.util.Scanner;

public class ConsecutiveNumberMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
	    System.out.println("String: " + str);
	    int start = isConsecutive(str);
	    if (start != -1)
	        System.out.println("True \n" + start);
	    else
	        System.out.println("False");


	}
	
	
	public static int isConsecutive(String input) {
		
		int size = input.length();
		int start;
		for(int i=0; i<size/2; i++) {
			
			String new_string = input.substring(0, i+1);
			
			int num = Integer.parseInt(new_string);
			start = num; 
			while(new_string.length()<size) {
				num++;
				new_string = new_string + String.valueOf(num);
				
			}
			if (new_string.equals(input))
		        return start;
			
		}
		return -1;
	}

}
