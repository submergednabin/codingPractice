package com.java.practice;

import java.util.Scanner;

public class JavaStringLauncher {
	/*
	 * program to reverse any string
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input any string");
		String line = sc.nextLine();

		char[] ch = line.toCharArray();

		for(int i=ch.length-1; i>=0; i--) {
			
			System.out.print(ch[i]);
		}
		
		
	}

}
