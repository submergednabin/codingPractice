package com.practice.interview;

import java.util.Scanner;

public class CountLowerAndUpper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int diff;
		int l = s.length();
		int count1 = 0;
		int count2=0;
		for(int i=0; i<l;i++) {
			if(Character.isLowerCase(s.charAt(i))) {
				count1++;
			}
			if(Character.isUpperCase(s.charAt(i))) {
				count2++;
			}
		}
		
//		System.out.println(count1);
//		System.out.println(count2);
		if(count1>count2) {
			diff = count1-count2;
			System.out.println(diff);
		}
		else {
			diff = count2-count1;
			System.out.println(diff);
		}

	}

}
