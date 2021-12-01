package com.practice.interview;

import java.util.Arrays;

public class arrayLauncher {
	
	public static void main(String[] args) {
		int arr[]= {6, 7,5,8, 12};
		
		int[] temp = new int[arr.length];
		for(int i = 0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		Arrays.sort(arr);
		for(int i=0; i<arr.length;i++) {
			if(temp[i]==arr[i]) {
				System.out.println(arr[i]);
				
			}
		}
	}
}
