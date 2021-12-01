package com.practice.interview;

import java.util.Arrays;
import java.util.Scanner;

public class javaNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1;
		int[] temp = new int[N];
		for(int i=0; i<N; i++) {
			int value = sc.nextInt();
			temp[i] = value;
			
		}
		Arrays.sort(temp);
		for(int i=0; i<temp.length;i++) {
			for(int j=1; j<temp.length; j++) {
				if(temp[i]==temp[j]) {
					count++;
				}else {
//					temp[i];
					System.out.println(temp[i]);
				}
//				if(temp[i]==temp[j]) {
//					count++;
//					System.out.println(count);
//				}
			}

		}
	}
}
