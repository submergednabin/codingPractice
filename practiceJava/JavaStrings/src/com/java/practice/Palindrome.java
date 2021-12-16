package com.java.practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		int len = input.length();

		int count =0;

		
		for(int i=0;i<len/2;i++) {

			if(input.charAt(i) != input.charAt(len-i-1)) {
			
				count++;
			}

		}
		if(count<=1) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	

	}

}
