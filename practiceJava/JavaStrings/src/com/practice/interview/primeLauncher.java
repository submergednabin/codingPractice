package com.practice.interview;

import java.util.Scanner;

public class primeLauncher {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		boolean flag=false;
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		sc.nextLine();
		int m=n/2;
		for(int i=2;i<=m;i++) {
			if(n%i==0) {
//				System.out.println("it is not a prime number"+ " " + n);
				flag=true;
				break;
			}
		}
		if(n>1) {
			
			if(flag ==false) {
				System.out.println("The number "+n+ " is prime");
			}else {
				System.out.println("Not prime");
			}
		}
		else {
			System.out.println("Not prime");
		}
		

	}

}
