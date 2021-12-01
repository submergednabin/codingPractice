package com.practice.interview;

import java.util.Arrays;

//find an element greater than the given number and also the first number after the given number or smaller than any other remaining number
public class ArrayCompareLauncher {
	public static void main(String[] args) {
		int arr[] = {8, 5, 6, 12, 9, 5};
		int num = 9;
		Arrays.sort(arr);
		int[] temp = new int[arr.length];
		int count = 0;
		for(int i = 0; i< arr.length;i++) {
			if(arr[i]>num) {
				temp[i] = arr[i];
				count++;
			}
			
		}

		int[] temp2 = new int[count];
		int j = 0;
		for(int i=0;i<temp.length;i++) {
			if(arr[i]==temp[i]) {
				temp2[j] = temp[i];
				j++;

				}
			}
		System.out.println(temp2[0]);		
		
		
	}
}
