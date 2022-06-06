package com.java.practice;

import java.util.Scanner;

public class TestJavaIdentifiers {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		int billid;
		int customerId;
		int discount;
		double billAmount;
	
		System.out.println("Enter Bill id");
		billid = sc.nextInt();
		System.out.println("Enter Customer id");
		customerId = sc.nextInt();
		System.out.println("Enter Discount Percentage");
		discount = sc.nextInt();
		System.out.println("Enter Bill Amount");
		billAmount = sc.nextDouble();
		int discountedBillAmount = (int) (billAmount - billAmount * (discount/100));
		System.out.println(discountedBillAmount);
	}



}
