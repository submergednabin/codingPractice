package com.practice.interview;

public class checkCharLauncher {

	public static void main(String[] args) {
		String lett = "abcdcba";
		char [] let = lett.toCharArray();
		int len = let.length;
		char[] temp =new char[len];
		int count =0;
		for(int i=len-1;i>=0;i--) {
			temp[count]=let[i];
//			System.out.println(i);
//			System.out.println(count);
			
//			System.out.printlsn(temp[count]);
			count++;
			
		}
		String ch = String.valueOf(temp);
		System.out.println(ch);
		
		if(lett.equals(ch)) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("Not palindrome");
		}
		
		
	}
}
