package com.java.practice;

import java.util.Scanner;

public class reverseNumberMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		
		int rem = 0;
		int rev = 0;
		
		while(num != 0) {
			
			rem = num%10;
			rev = rev*10 + rem;
			num /= 10;
			
		}
		System.out.println(rev);
		
		
	}

}
